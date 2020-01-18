import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  selectedProductToUpdate: any;
  api = `https://jsonplaceholder.typicode.com`;

  constructor(private http: HttpClient) { }

  postData(product): Observable<any> {

    return this.http.post<any>(`${this.api}/add-post`, product);
  }
  getData(): Observable<any> {
    return this.http.get<any>(`${this.api}/posts`);
  }
  deleteData(product): Observable<any> {
    return this.http.delete<any>(`${this.api}/delete-post`, product);
  }
  updateData(product): Observable<any> {
    return this.http.put<any>(
      `${this.api}/modify-post`,
      product);
  }
}
