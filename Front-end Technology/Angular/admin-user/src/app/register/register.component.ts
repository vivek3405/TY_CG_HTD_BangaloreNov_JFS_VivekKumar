import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthenticationService } from '../authentication.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  message: string;
  constructor(private auth: AuthenticationService) { }

  register(form: NgForm) {
    this.auth.registerUser(form.value).subscribe(res => {
      console.log(res);
      this.message = res.message;
      form.reset();
      setTimeout(() => {
        this.message = null;
      }, 5000);
    }, err => {
      form.reset();
      if (err.statusCode === 201) {
        console.log(err);
      // tslint:disable-next-line: align
      } else
        console.log(err);
    });
}

ngOnInit() {
}

}
