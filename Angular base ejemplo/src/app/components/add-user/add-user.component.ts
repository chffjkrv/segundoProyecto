import { Component, OnInit } from '@angular/core';

//Nuevo
import { Router } from '@angular/router';
import { User } from '../../models/user';
import { UserService } from '../../services/user.service';
import { identity } from 'rxjs';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  //La clase de dentro es nueva

  user: User = new User();
  idpropio:number;

  // si se metiera en el constructor automáticamente lo hace

  constructor(private router: Router, private userService: UserService) {

  }

  createUser(): void {
    this.userService.createUser(this.user)
        .subscribe( data => {
          console.log(data.id);
          alert("Usuario generado de forma correcta.");
          window.localStorage.setItem("usuarioId", data.id);
          this.router.navigate(["/listado"]);
        });
  };

  ngOnInit() {
  };

}
