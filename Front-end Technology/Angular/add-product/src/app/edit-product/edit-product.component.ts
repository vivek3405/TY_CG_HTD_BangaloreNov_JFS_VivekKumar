import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {

  constructor(public productService: ProductService,
              private router: Router) { }

  ngOnInit() {
  }
  updateProduct(form: NgForm) {
    this.productService.updateData(form.value).subscribe(res => {
      console.log(res);
      if (res.message === 'Success') {
        this.router.navigateByUrl('/products');
      }
      form.reset();
    });
  }

}
