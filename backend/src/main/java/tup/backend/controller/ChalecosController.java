package tup.backend.controller;

import tup.backend.Services.Chalecos.ChalecosServiceImpl;
import tup.backend.models.Chalecos.ChalecoBal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ChalecosController {

    @Autowired
    private ChalecosServiceImpl chalecosService;

    @GetMapping("/chalecos")
    public ResponseEntity<List<ChalecoBal>> all() {
      return ResponseEntity.ok().body(this.chalecosService.all());
    }
}
