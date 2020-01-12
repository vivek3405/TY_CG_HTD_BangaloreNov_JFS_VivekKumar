import { NgModule } from "@angular/core";
import { RouterModule, Route } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AboutComponent } from './about/about.component';
import { AdminComponent } from './admin/admin.component';
import { AuthGaurd } from 'auth.gaurd';
import { UserComponent } from './user/user.component';

let routes: Route[] = [
    { path: '', component: HomeComponent },
    { path: 'header', component: HeaderComponent },
    { path: 'login', component: LoginComponent },
    { path: 'register', component: RegisterComponent },
    { path: 'about', component: AboutComponent },
    {
        path: 'admin', component: AdminComponent,
        canActivate: [AuthGaurd], data: {
            expectedRoles: ['admin']
        }
    },
    {
        path: 'user', component: UserComponent,
        canActivate: [AuthGaurd], data: {
            expectedRoles: ['admin', 'user']
        }
    }
];

@NgModule({
    imports: [
        RouterModule.forRoot(routes)
    ],
    exports: [
        RouterModule
    ]
})
export class AppRoutingModule {

}