
package com.floop.back;

import java.util.List;


public interface bdService {
    List<bd>listar();
    bd listarId(int id);
    bd add(bd b);
    bd edit(bd b);
    bd delete(int id);    
}
