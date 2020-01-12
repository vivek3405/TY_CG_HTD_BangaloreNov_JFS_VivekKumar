import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl, FormArray, Validators } from '@angular/forms';

@Component({
  selector: 'app-form-bulider',
  templateUrl: './form-bulider.component.html',
  styleUrls: ['./form-bulider.component.css']
})
export class FormBuliderComponent implements OnInit {
  
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
      name: this.fb.control(null, [
        Validators.required, Validators.minLength(5),
      ]),
      email: this.fb.control(null,
        [
          Validators.required, Validators.minLength(5), Validators.email
        ]),
      password: this.fb.control(null, [
        Validators.required, Validators.minLength(4),
        Validators.maxLength(8),
        Validators.pattern('(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$')
      ]),
      age: this.fb.control(null, [
        Validators.maxLength(3), Validators.required,
      ]),
      skills: this.fb.array([
        this.getSkill()
      ])
    });
  }
  // to have this.fb.control Object
  getSkill(){
    return this.fb.control(null, [Validators.required, Validators.minLength(3)]);
  }
  // to push for FormControl to FormArray
  addSkill(){
    this.skills.push(this.getSkill());
  }
  deleteSkill(i: number){
    this.skills.removeAt(i);
  }

}
