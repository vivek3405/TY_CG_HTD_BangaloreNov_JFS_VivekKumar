import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-schedular',
  templateUrl: './schedular.component.html',
  styleUrls: ['./schedular.component.css']
})
export class SchedularComponent implements OnInit {
  products: any;
  productButton = false;

  constructor(private adminService: AdminService) {
    this.getProducts();
   }

  ngOnInit() {
  }
  getProducts() {
    this.adminService.getProduct().subscribe(response => {
      console.log(response);
      this.products = response.product;
    }, err => {
      console.log(err);
    });
  }
  viewProduct() {
    this.productButton = true;
  }

}
