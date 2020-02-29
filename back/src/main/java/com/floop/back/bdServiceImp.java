package com.floop.back;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bdServiceImp implements bdServices {
    
    @Autowired
    private bdRepositorio repositorio;

    @Override
    public List<bd> listar() {
        return repositorio.findAll();
    }

    @Override
    public bd listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public bd add(bd p) {
        return repositorio.save(p);
    }

    @Override
    public bd edit(bd p) {
        return repositorio.save(p);
    }

    @Override
    public bd delete(int id) {
        bd p=repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
       return p;
    }
    
}
