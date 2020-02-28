import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Datos } from '../Modelo/bd';

@Injectable({
  providedIn: 'root'
}) 
export class ServiceService {

  
  constructor(private http:HttpClient) {}

    Url = 'http://localhost:8080/bd';

    getDatos(){
      return this.http.get<Datos[]>(this.Url);
    }
    createRegistro(bd:Datos){
      return this.http.post<Datos>(this.Url,bd);
    }

  
}
