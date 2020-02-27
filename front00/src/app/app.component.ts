import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ListarComponent } from './bd/listar/listar.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'front00';
  constructor(private router:Router){}
  Listar(){
     this.router.navigate(["Listar"]);    
  }
  Nuevo(){
    this.router.navigate(["agregar"]);     
 }
}
