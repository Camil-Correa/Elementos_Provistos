package tup.backend.controller;

import tup.backend.Services.Empleados.EmpleadosServiceImpl;
import tup.backend.Services.Empleados.GradoServiceImpl;
import tup.backend.models.Empleados.DatosEmpleado;
import tup.backend.models.Empleados.Empleados;
import tup.backend.models.Empleados.Grado;
import tup.backend.models.Empleados.SituacionEmp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class EmpleadosController {

  @Autowired
  private EmpleadosServiceImpl empleadosService;

  // @Autowired
  // private GradoServiceImpl GradoService;

  // DatosEmpleado datosEmpleado = new DatosEmpleado();
  // Grado grado = new Grado();
  // SituacionEmp sitemp = new SituacionEmp();

  // @RequestMapping("/hola")
  // public String hola() {
  //   return "hola";
  // }

  @GetMapping("/empleado/{nI}")
  public Empleados oneemp(@PathVariable int nI) {

    return empleadosService.oneemp(nI);
    // Empleados emp = empleadosService.oneemp(nI);

    // this.datosEmpleado.setNI(emp.getNI());
    // this.datosEmpleado.setNombres(emp.getNombres());
    // this.datosEmpleado.setApellidos(emp.getApellidos());
    // this.datosEmpleado.setDni(emp.getDni());   


    // System.out.println(this.datosEmpleado);
    // return datosEmpleado;
  }

  @GetMapping("/empleados")
  public ResponseEntity<List<Empleados>> all() {
    return ResponseEntity.ok().body(this.empleadosService.all());
  }
  
}