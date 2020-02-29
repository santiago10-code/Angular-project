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
    getDatoId(id:number){
      return this.http.get<Datos>(this.Url+"/"+id);
    }
    updateDato(bd:Datos){
      return this.http.put<Datos>(this.Url+"/"+bd.id,bd);
    }
    deleteDato(bd:Datos){
      return this.http.delete<Datos>(this.Url+"/"+bd.id);
    }
  
}
