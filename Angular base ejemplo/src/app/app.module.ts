import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { AddUserComponent } from './components/add-user/add-user.component';

//Nuevo
import { UserService } from './services/user.service';
import { HttpClientModule } from "@angular/common/http";
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { LoginComponent } from './components/login/login.component';
import { ListarUsersComponent } from './components/listar-users/listar-users.component';
import { ListarcontactosComponent } from './components/listarcontactos/listarcontactos.component';
import { ListardescartesComponent } from './components/listardescartes/listardescartes.component';

@NgModule({
  declarations: [
    AppComponent,
    AddUserComponent,
    LoginComponent,
    ListarUsersComponent,
    ListarcontactosComponent,
   ListardescartesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    //Nuevo
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule   
  ],
  //Nuevo el provider
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
