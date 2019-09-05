import { Injectable } from '@angular/core';

//Nuevo
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../models/user';

//Nuevo
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})





export class UserService {

  //Todo lo de la clase es nuevo

  constructor(private http:HttpClient) {}
  //private userUrl = 'https://jsonplaceholder.typicode.com/users';
  private userUrl = 'http://localhost:8080/user-portal/users';
  
  
  //private userUrl = '/api';


//Hay que crear el metodo dame20 y mostrarlo por pantalla, para esto
//hay que recuperar el id del componente login y según este id
//conseguir el genero para asi mandar la consulta list20 
//la cual ya está creada en el servidor.
  
  public getUsers() {
    return this.http.get<User[]>(this.userUrl+"/list20");
  }

  //http://localhost:8080/user-portal/users/5
  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public createUser(user) {
    return this.http.post<User>(this.userUrl+"/adduser", user);
  }


  public comprobarUser(id){
    return this.http.get(this.userUrl + "/login"+"/"+ id);
  }



}
