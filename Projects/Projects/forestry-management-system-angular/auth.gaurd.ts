import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
})

export class AuthGaurd implements CanActivate {

    canActivate(route: ActivatedRouteSnapshot): boolean {
        let expectedRolesArray = route.data.expectedRoles;
        let userDetails = JSON.parse(localStorage.getItem('userDetails.login[0]'));
        let expectedRole: string;
        for (let index in expectedRolesArray) {
            if (userDetails && userDetails.login[0].role === expectedRolesArray[index]) {
                expectedRole = expectedRolesArray[index];
            }
        }
        if (userDetails && userDetails.login[0].role === expectedRole) {
            return true;
        } else {
            return false;
        }
    }
}