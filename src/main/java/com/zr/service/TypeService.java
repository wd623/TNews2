package com.zr.service;

import com.zr.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TypeService {

    Page<Type> listType(Pageable pageable);


    void deleteById(Long id);

    Type findById(Long id);

    void input(Type type);
}
