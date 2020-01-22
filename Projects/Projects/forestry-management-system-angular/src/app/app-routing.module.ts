import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { AdminComponent } from './admin/admin.component';
import { AuthGaurd } from 'auth.gaurd';
import { SchedularComponent } from './schedular/schedular.component';
import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { ViewProductComponent } from './view-product/view-product.component';
import { ModifyProductComponent } from './modify-product/modify-product.component';
import { ViewCustomerComponent } from './view-customer/view-customer.component';
import { CustomerHomeComponent } from './customer-home/customer-home.component';
import { OrderComponent } from './order/order.component';
import { ViewOrderProductComponent } from './view-order-product/view-order-product.component';
import { ViewHaulierComponent } from './view-haulier/view-haulier.component';


const routes: Routes = [{path: '', component: HomeComponent},
{path: 'login', component: LoginComponent},
{
  path: 'admin', component: AdminComponent
},
{
  path: 'schedular', component: SchedularComponent,
  canActivate: [AuthGaurd], data: {
      expectedRoles: ['schedular']
  }
},
{path: 'customer-login', component: CustomerLoginComponent},
{path: 'add-customer', component: AddCustomerComponent},
{path: 'view-product', component: ViewProductComponent},
{path: 'modify-product', component: ModifyProductComponent},
{path: 'view-customer', component: ViewCustomerComponent},
{path: 'customer', component: CustomerHomeComponent},
{path: 'order', component: OrderComponent},
{path: 'view-order', component: ViewOrderProductComponent},
{path: 'view-haulier', component: ViewHaulierComponent},
{path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
