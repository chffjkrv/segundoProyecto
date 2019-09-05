import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

//Nuevo
import { AddUserComponent } from './components/add-user/add-user.component';
import { LoginComponent } from './components/login/login.component';
import { ListarUsersComponent } from './components/listar-users/listar-users.component';
import { ListarcontactosComponent } from './components/listarcontactos/listarcontactos.component';
import { ListardescartesComponent } from './components/listardescartes/listardescartes.component';

//Creo las rutas
const routes: Routes = [
  { path: 'add', component: AddUserComponent },
  { path: 'login', component: LoginComponent},
  { path: 'listado', component: ListarUsersComponent },
  { path: 'listarcontactos',component:ListarcontactosComponent},
 { path: 'listardescartes',component:ListardescartesComponent}
];

//Todo esto ya estaba al ppio
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
