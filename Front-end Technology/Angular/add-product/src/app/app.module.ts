import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{RouterModule} from '@angular/router';
import{HttpClientModule} from '@angular/common/http';
import{FormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { AddProductComponent } from './add-product/add-product.component';
import { DataFromJsonComponent } from './data-from-json/data-from-json.component';
import { ProductsComponent } from './products/products.component';
import { EditProductComponent } from './edit-product/edit-product.component';
import { UserComponent } from './user/user.component';
import { FilterProductsPipe } from './filter-products.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    AddProductComponent,
    DataFromJsonComponent,
    ProductsComponent,
    EditProductComponent,
    UserComponent,
    FilterProductsPipe,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
      {path: '', component: HomeComponent},
      {path: 'add-product', component: AddProductComponent},
      {path: 'data-from-json', component: DataFromJsonComponent},
      {path: 'products', component: ProductsComponent},
      {path: 'edit-product', component: EditProductComponent},
      {path: 'user/:id', component: UserComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
