import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListarComponent } from './bd/listar/listar.component';
import { AgregarComponent } from './bd/agregar/agregar.component';
import { EditarComponent } from './bd/editar/editar.component';


const routes: Routes = [
  {path:'listar',component:ListarComponent},
  {path:'agregar',component:AgregarComponent},
  {path:'editar',component:EditarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
