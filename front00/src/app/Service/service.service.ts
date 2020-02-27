import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { bd } from '../Modelo/bd';

@Injectable({
  providedIn: 'root'
}) 
export class ServiceService {

  
  constructor(private http:HttpClient) {}

    Url = 'http://localhost:8080/back/db';

    getDB(){
      return this.http.get<bd[]>(this.Url);
    }

  
}
