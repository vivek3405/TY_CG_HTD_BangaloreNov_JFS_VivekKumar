import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {
  name="vivek"
  flag=true;
  imgUrl="https://cdn.pixabay.com/photo/2019/12/29/12/56/new-years-eve-4727013__340.jpg";
  constructor() { 
    // setInterval(()=>
    // {
    //   this.flag=!this.flag;
    // },1000)
  }
  twoWayData;

  clickMe(input){
    console.log(input.value);
    this.flag=!this.flag;
  }
  printData(){
    console.log(this.twoWayData);
  }

  ngOnInit() {
  }

}
