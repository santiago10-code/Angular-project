package com.floop.back;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


public class bdServiceImp implements bdServices {
    
    @Autowired
    private bdRepositorio repositorio;

    @Override
    public List<bd> listar() {
        return repositorio.findAll();
    }

    @Override
    public bd listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public bd add(bd p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public bd edit(bd p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public bd delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
