import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

//Nuevo
import { UserComponent } from './components/user/user.component';
import { AddUserComponent } from './components/add-user/add-user.component';

//Creo las rutas
const routes: Routes = [
  { path: 'users', component: UserComponent },
  { path: 'add', component: AddUserComponent }
];

//Todo esto ya estaba al ppio
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
