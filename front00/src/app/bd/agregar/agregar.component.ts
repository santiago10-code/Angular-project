import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service'
import { Datos } from 'src/app/Modelo/bd';

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.css']
})
export class AgregarComponent implements OnInit {

  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit(): void {
  }
  Guardar(bd:Datos){
    this.service.createRegistro(bd)
    .subscribe(data=>{
      alert("existoso");
      this.router.navigate(["listar"])
    })
  }

}
