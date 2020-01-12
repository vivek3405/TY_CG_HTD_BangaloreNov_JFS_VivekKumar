import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  products: Product[];
  message: string;
  constructor(private productService: ProductService,
              private router: Router) {
    this.getProducts();
  }

  ngOnInit() {
  }
  getProducts() {
    this.productService.getData().subscribe(response => {
      console.log(response);
      this.products = response.product;
    }, err => {
      console.log(err);
    });
  }
  deleteProduct(product: Product) {
    this.productService.deleteData(product).subscribe(res => {
      console.log(res);
      if (res.message === 'Success') {
      this.products.splice(this.products.indexOf(product), 1);
      this.message=res.message;
    }
    });
  }
  deleteMessage() {
    this.message = null;
  }
  selectProduct(product) {
    this.productService.selectedProductToUpdate = product;
    this.router.navigateByUrl('/edit-product');
  }

}
