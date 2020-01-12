import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { SectionComponent } from './section/section.component';
import { AboutComponent } from './about/about.component';
import { HomeComponent } from './home/home.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { RouterModule } from '@angular/router';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { VivekComponent } from './vivek/vivek.component';
import { AbhishekComponent } from './abhishek/abhishek.component';
import { AmanComponent } from './aman/aman.component';
import { LateComersComponent } from './late-comers/late-comers.component';
import { ProductsComponent } from './products/products.component';
import { ProductCardComponent } from './product-card/product-card.component';
import { ColorDirective } from './color.directive';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { BikesComponent } from './bikes/bikes.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    SectionComponent,
    AboutComponent,
    HomeComponent,
    ContactUsComponent,
    LoginComponent,
    RegisterComponent,
    PageNotFoundComponent,
    VivekComponent,
    AbhishekComponent,
    AmanComponent,
    LateComersComponent,
    ProductsComponent,
    ProductCardComponent,
    ColorDirective,
    ParentComponent,
    ChildComponent,
    BikesComponent,
    BikeDetailsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot([
      {path: '', component: HomeComponent},
      {path: 'about', component: AboutComponent, children:[
        {path: 'vivek', component: VivekComponent},
        {path: 'abhishek', component: AbhishekComponent},
        {path: 'aman', component: AmanComponent}
      ]},
      {path: 'contact-us', component: ContactUsComponent},
      {path: 'login', component: LoginComponent},
      {path: 'register', component: RegisterComponent},
      {path: 'lateComers', component: LateComersComponent},
      {path: 'products', component: ProductsComponent},
      {path: 'product-card', component: ProductCardComponent},
      {path: 'bikes', component: BikesComponent},
      {path: 'bike-details', component: BikeDetailsComponent},
      {path: 'parent', component: ParentComponent},
      {path: 'child', component: ChildComponent},
      {path: '**', component: PageNotFoundComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
