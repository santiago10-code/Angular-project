package com.floop.back;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public bd agregar(@RequestBody bd p){
        return service.add(p);
    }
    @GetMapping(path = {"/{id}"})
    public bd listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PutMapping(path = {"/{id}"})
    public bd editar(@RequestBody bd p,@PathVariable("id") int id){
        p.setId(id);
        return service.edit(p);
    }
    @DeleteMapping(path = {"/{id}"})
    public bd delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
