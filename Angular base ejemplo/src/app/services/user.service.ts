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
    return this.http.get<User[]>(this.userUrl);
  }

  //http://localhost:8080/user-portal/users/5
  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public createUser(user) {
    return this.http.post<User>(this.userUrl+"/adduser", user);
  }

  public idUltimo() {
    return this.http.get<number>(this.userUrl+"/ultimoid");
  }

  public comprobarUser(id){
    return this.http.get(this.userUrl + "/login"+"/"+ id);
  }

  public listarPerfiles(){
    return this.http.get<User[]>(this.userUrl+"/"+window.localStorage.getItem('usuarioId'));
  }

  public darLike(userid2){
    return this.http.get<void>(this.userUrl+"/darlike"+"/"+window.localStorage.getItem('usuarioId')+"/"+userid2);
  }

  public darDislike(userid2){
    return this.http.get<void>(this.userUrl+"/dardislike"+"/"+window.localStorage.getItem('usuarioId')+"/"+userid2);
  }

  public listarcontactos(id){
    return this.http.get<User[]>(this.userUrl + "/listarcontactos"+"/"+ id);
  }
  public listardescartes(id){
    return this.http.get<User[]>(this.userUrl + "/listardescartes"+"/"+ id);
  }

}
