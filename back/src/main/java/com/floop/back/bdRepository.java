package com.floop.back;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface bdRepository extends Repository<bd, Integer> {
    List<bd>findAll();
    bd findOne(int id);
    bd save(bd b);
    void delete(bd b);
}
