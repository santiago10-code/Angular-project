import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { Datos } from 'src/app/Modelo/bd';

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent implements OnInit {

  bd:Datos = new Datos();
  constructor(private router:Router,private service:ServiceService) { }

  ngOnInit() {
    this.Editar();
  }

  Editar(){
    let id=localStorage.getItem("id");
    this.service.getDatoId(+id)
    .subscribe(data=>{
      this.bd=data;
    })
  }

  Actualizar(bd:Datos){
    this.service.updateDato(bd)
    .subscribe(data=>{
      this.bd=data;
      alert("Se Actualizo con Exito");
      this.router.navigate(["listar"]);
    })
  }

}
