package com.floop.back;

import java.util.List;
import org.springframework.data.repository.Repository;


public interface bdRepositorio extends Repository<bd,Integer>{
    List<bd>findAll();
    bd findById(int id);
    bd save(bd p);
    void delete(bd p);           
}



