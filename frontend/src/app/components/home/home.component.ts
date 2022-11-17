import { datos } from './../../Interfaces/Requests';
import { EmpleadoService } from './../../services/empleado.service';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private EmpleadoService : EmpleadoService) { }

  ngOnInit(): void {
    this.getEmp();
  }
  NI :number = 672754;

  @Input() datosemp? : datos;

  getEmp() : void {
    const nI = this.NI
    this.EmpleadoService.getEmp(nI)
    .subscribe(empleado => this.datosemp = empleado);
    console.log(this.datosemp)
  }
}
