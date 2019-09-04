import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { Router } from '@angular/router';
import { User } from 'src/app/models/user';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: User;

  constructor(private userService: UserService, private router: Router) {


   }

  ngOnInit() {
  }


  login(user: User): void {
    this.userService.comprobarUser(user.id)
      .subscribe(Response => {
        if (Response == null) {
          alert('Usuario no existe');
          // this.router.navigate(['/add']);
        } else {
          alert('Usuario existe');
          window.localStorage.setItem('usuarioId', user.id);
          // this.router.navigate(['/listado']);

        }


      });
  }

}
