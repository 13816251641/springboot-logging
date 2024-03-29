package com.lujieni.logging.controller;

import com.lujieni.logging.domain.po.StudentPO;
import com.lujieni.logging.domain.vo.StudentVO;
import com.lujieni.logging.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping(value = "/v1/findStudentByName", method = RequestMethod.GET)
    public List<StudentPO> findStudentByName(){
        return studentService.findStudentByName();
    }

}
