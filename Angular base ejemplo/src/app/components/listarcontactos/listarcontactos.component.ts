import { Component, OnInit } from '@angular/core';

//Nuevo
import { Router } from '@angular/router';

import { User } from '../../models/user';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-listarcontactos',
  templateUrl: './listarcontactos.component.html',
  styleUrls: ['./listarcontactos.component.css']
})
export class ListarcontactosComponent implements OnInit {

  users: User[];

  constructor(private router: Router, private userService: UserService) { }

  ngOnInit() {
    this.userService.listarcontactos(window.localStorage.getItem('usuarioId'))
    .subscribe( data => {
        this.users = data;
      });
    
  }

}
