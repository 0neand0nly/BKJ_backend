package com.example.bkj_backend.controller;


import com.example.bkj_backend.domain.cweVo;
import com.example.bkj_backend.service.cweService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class cweController {
    @Autowired
    private cweService serv;

    @GetMapping("select")
    public List<cweVo> getSelectList(){return serv.select();}

    @GetMapping("insert")
    public void insertDemoVo(){
        cweVo vo = new cweVo();
        vo.setCwe_id("CWE-728");
        vo.setSrcGood("DUMMY");
        vo.setSrcBad("DUMMY");
        vo.setByteGood("DUMMY");
        vo.setByteBad("DUMMY");
        serv.insert(vo);
    }


}
