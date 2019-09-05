import { Component, OnInit } from '@angular/core';

//Nuevo
import { Router } from '@angular/router';

import { User } from '../../models/user';
import { UserService } from '../../services/user.service';
@Component({
  selector: 'app-listardescartes',
  templateUrl: './listardescartes.component.html',
  styleUrls: ['./listardescartes.component.css']
})
export class ListardescartesComponent implements OnInit {

  constructor(private router: Router, private userService: UserService) { }
  users: User[];

  ngOnInit() {
    this.userService.listardescartes(window.localStorage.getItem('usuarioId'))
    .subscribe( data => {
        this.users = data;
      });
  }

}
