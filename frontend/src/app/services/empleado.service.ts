import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { datos } from '../Interfaces/Requests';

@Injectable({
  providedIn: 'root'
})

export class EmpleadoService {

  constructor(private http: HttpClient) {   }

  //  public GetEmpleadoByNi(url:string){
  //   return this.http.get(url);
  // }

  private empleadoURL = "http://localhost:8080/empleado"

    getEmp(nI: number) {
      return this.http.get<datos>(`${this.empleadoURL}/${nI}`);
    }
}
