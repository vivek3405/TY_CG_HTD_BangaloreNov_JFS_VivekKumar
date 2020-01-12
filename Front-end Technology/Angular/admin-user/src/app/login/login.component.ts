import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../authentication.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  error: any;
  message: any;

  constructor(private auth: AuthenticationService,
              private router: Router) { }

  login(form: NgForm) {
    this.auth.loginUser(form.value).subscribe( res => {
      if (res.statusCode === 201) {
        form.reset();
        this.message = res.message;
        setTimeout(() => {
          this.message = null;
        }, 5000);
        console.log(res);
        localStorage.setItem('userDetails.account[0]', JSON.stringify(res));
        console.log('user details stored in local storage');
        this.router.navigateByUrl('/');
      } else {
        form.reset();
        this.error = res.message;
        setTimeout(() => {
          this.error = null;
        }, 5000);

      }
    });
  }

  ngOnInit() {
  }

}
