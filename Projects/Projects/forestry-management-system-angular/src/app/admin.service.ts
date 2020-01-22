import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  selectedProductToUpdate;
  selectedHaulierToUpdate;
  selectedProductToBuy;
  api = `http://localhost:8080`;

  constructor(private http: HttpClient) { }

  postProduct(product): Observable<any> {

    return this.http.post<any>(`${this.api}/add-product`, product);
  }
  getProduct(): Observable<any> {
    return this.http.get<any>(`${this.api}/get-product`);
  }
  deleteProduct(product: any): Observable<any> {
    return this.http.delete<any>(`${this.api}/delete-product/${product.prodid}`);
  }
  updateProduct(product): Observable<any> {
    return this.http.put<any>(
      `${this.api}/modify-product`,
      product);
  }
  postHaulier(haulier): Observable<any> {

    return this.http.post<any>(`${this.api}/add-haulier`, haulier);
  }
  getHaulier(): Observable<any> {
    return this.http.get<any>(`${this.api}/get-haulier`);
  }
  deleteHaulier(haulier: any): Observable<any> {
    return this.http.delete<any>(`${this.api}/delete-haulier/${haulier.id}`);
  }
  updateHaulier(haulier): Observable<any> {
    return this.http.put<any>(
      `${this.api}/modify-product`,
      haulier);
  }
  postOrder(order): Observable<any> {
    return this.http.post<any>(`${this.api}/add-order`, order);
  }
  getOrder(): Observable<any> {
    return this.http.get<any>(`${this.api}/get-order`);
  }
}
