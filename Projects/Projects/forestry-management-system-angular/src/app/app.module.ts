import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { SchedularComponent } from './schedular/schedular.component';
import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { FooterComponent } from './footer/footer.component';
import { BodyComponent } from './body/body.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { FilterProductsPipe } from './filter-products.pipe';
import { ViewProductComponent } from './view-product/view-product.component';
import { ModifyProductComponent } from './modify-product/modify-product.component';
import { ViewCustomerComponent } from './view-customer/view-customer.component';
import { CustomerHomeComponent } from './customer-home/customer-home.component';
import { OrderComponent } from './order/order.component';
import { ViewOrderProductComponent } from './view-order-product/view-order-product.component';
import { ViewHaulierComponent } from './view-haulier/view-haulier.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    PageNotFoundComponent,
    HomeComponent,
    LoginComponent,
    AdminComponent,
    SchedularComponent,
    CustomerLoginComponent,
    FooterComponent,
    BodyComponent,
    AddCustomerComponent,
    FilterProductsPipe,
    ViewProductComponent,
    ModifyProductComponent,
    ViewCustomerComponent,
    CustomerHomeComponent,
    OrderComponent,
    ViewOrderProductComponent,
    ViewHaulierComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
