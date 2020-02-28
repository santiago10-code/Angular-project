import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service'
import { Datos } from 'src/app/Modelo/bd';


  

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  bd:Datos[]
  constructor(private service:ServiceService, private router:Router) {    
  }

  ngOnInit() {
    this.service.getDatos()
    .subscribe(data=>{this.bd =data;})
  }

}
