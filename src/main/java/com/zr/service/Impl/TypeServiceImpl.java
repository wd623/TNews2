package com.zr.service.Impl;

import com.zr.dao.TypeDao;
import com.zr.po.Type;
import com.zr.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeDao typeDao;


    public Page<Type> listType(Pageable pageable) {
        return typeDao.findAll(pageable);
    }

    public void deleteById(Long id) {
        typeDao.deleteById(id);
    }

    public Type findById(Long id) {
        return typeDao.getOne(id);  //展现新增
    }

    public void input(Type type) {
        typeDao.save(type);
    }


}
