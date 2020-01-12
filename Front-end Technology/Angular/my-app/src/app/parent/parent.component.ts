import { Component, OnInit, OnChanges, DoCheck, OnDestroy } from '@angular/core';

// tslint:disable-next-line: no-conflicting-lifecycle
@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit, OnDestroy, OnChanges, DoCheck {
  dataFromChild;

  student = {
    name: 'shankar',
    age: 20,
    marks: 50
  };
  constructor() {
    console.log('parent component constructor called');
  }

  getChildData(data) {
    this.dataFromChild = data;
  }
  ngOnInit() {
    console.log('onInit method executed');
  }

  ngDoCheck() {
    console.log('do check');

    ngOnDestroy(){
      console.log('destroy');
    }
    ngOnChanges(){
      console.log('changes');

    }
  }


}
