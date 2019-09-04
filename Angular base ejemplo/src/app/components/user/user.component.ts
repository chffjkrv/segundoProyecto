import { Component, OnInit } from '@angular/core';

//Nuevo
import { Router } from '@angular/router';

import { User } from '../../models/user';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  //Todo la clase es nueva

  users: User[];

  constructor(private router: Router, private userService: UserService) {

  }

  ngOnInit() {
    this.userService.dame20(user)
      .subscribe( data => {
        this.users = data;
      });
  }

  deleteUser(user: User): void {
    this.userService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      });
  }


  }

  dame20(user:User){
    this.userService.dame20(user)
      ._subscribe(data => {
        this.users
      })
  }
  }

}
