
package com.floop.back;

import java.util.List;
   
public interface bdServices {
    List<bd>listar();
    bd listarId(int id);
    bd add(bd p);
    bd edit(bd p);
    bd delete(int id);    
}