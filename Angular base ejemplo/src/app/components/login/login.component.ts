import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { Router } from '@angular/router';
import { User } from '../../models/user';
import { FormControl, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: User;
  formulario: FormGroup;

  constructor(private userService: UserService, private router: Router) {


   }

  ngOnInit() {
    this.formulario = new FormGroup({id: new FormControl(null, Validators.required)
  });
}


  login(): void {
    this.userService.comprobarUser(this.formulario.value.id)
      .subscribe(Response => {
        
        if (Response == null) {
          alert('Usuario no existe');
          // this.router.navigate(['/add']);
        } else {
          alert('Usuario existe');
          window.localStorage.setItem('usuarioId',this.formulario.value.id);
          // this.router.navigate(['/listado']);

        }


      });
  }

}
