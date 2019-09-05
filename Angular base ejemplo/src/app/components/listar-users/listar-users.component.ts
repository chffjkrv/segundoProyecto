import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user';
import { Router } from '@angular/router';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-listar-users',
  templateUrl: './listar-users.component.html',
  styleUrls: ['./listar-users.component.css']
})
export class ListarUsersComponent implements OnInit {
  
  users: User[];

  constructor(private router: Router, private userService: UserService) { }

  ngOnInit() {
    this.userService.listarPerfiles()
      .subscribe( data => {
        this.users = data;
      });
  }

  darLike(userId2){
    this.userService.darLike(userId2)
    .subscribe();
  }

  darDislike(userId2){
    this.userService.darDislike(userId2)
    .subscribe();
  }

  listarContactos(){
    this.router.navigate(['/listarcontactos']);
  }

  listarDescartes(){
    this.router.navigate(['/listardescartes']);
  }

}
