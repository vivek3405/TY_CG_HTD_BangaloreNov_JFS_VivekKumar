import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormArray, Form, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm: FormGroup;
  constructor(private fb: FormBuilder) { }

  submitForm() {
    console.log(this.registerForm.value);
    this.registerForm.reset();
  }
  // to access name field (FormControl)
  get name(): FormControl {
    return this.registerForm.get('name') as FormControl;
  }
  // to access email field (FormControl)
  get email(): FormControl {
    return this.registerForm.get('email') as FormControl;
  }
  // to access password field (FormControl)
  get password(): FormControl {
    return this.registerForm.get('password') as FormControl ;
  }
  // to access age field (FormControl)
  get age(): FormControl {
    return this.registerForm.get('age') as FormControl;
  }
  // to access skills field (FormControl)
  get skills(): FormArray{
    return this.registerForm.get('skills') as FormArray;
  }

  ngOnInit() {
    this.registerForm = this.fb.group({
      name: new FormControl(null, [
        Validators.required, Validators.minLength(5),
      ]),
      email: new FormControl(null,
        [
          Validators.required, Validators.minLength(5), Validators.email
        ]),
      password: new FormControl(null, [
        Validators.required, Validators.minLength(4),
        Validators.maxLength(8),
        Validators.pattern('(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$')
      ]),
      age: new FormControl(null, [
        Validators.maxLength(3), Validators.required,
      ]),
      skills: new FormArray([
        this.getSkill()
      ])
    });
  }
  // to have new FormControl Object
  getSkill(){
    return new FormControl(null, [Validators.required, Validators.minLength(3)]);
  }
  // to push for FormControl to FormArray
  addSkill(){
    this.skills.push(this.getSkill());
  }
  deleteSkill(i: number){
    this.skills.removeAt(i);
  }
}
