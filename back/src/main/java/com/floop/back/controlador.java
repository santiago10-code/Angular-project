package com.floop.back;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/bd"})

public class controlador {
     
    @Autowired
    bdServices service;
    
    @GetMapping
    public List<bd>listar(){
      return service.listar();
    }
    
    @PostMapping
    public bd agergar(@RequestBody bd p){
        return service.add(p);
    }
}
