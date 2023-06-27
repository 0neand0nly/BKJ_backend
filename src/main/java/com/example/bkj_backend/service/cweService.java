package com.example.bjk_backend.service;


import com.example.bjk_backend.domain.cweVo;
import com.example.bjk_backend.mapper.cweMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class cweService {
    @Autowired
    private cweMapper mapper;

    public List<cweVo> select() {return mapper.select();}
    public void insert(cweVo vo){mapper.insert(vo);}

}
