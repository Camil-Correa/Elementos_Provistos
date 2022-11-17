package tup.backend.controller;

import tup.backend.Services.Armas.ArmasServiceImpl;
import tup.backend.models.Armas.Armas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("")
public class ArmasController {
   
    @Autowired
    private ArmasServiceImpl armasService;

    @GetMapping("/armas")
    public ResponseEntity<List<Armas>> all() {
      return ResponseEntity.ok().body(this.armasService.all());
    }

}
