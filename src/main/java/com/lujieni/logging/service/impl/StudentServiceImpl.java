package com.lujieni.logging.service.impl;

import com.lujieni.logging.dao.StudentDao;
import com.lujieni.logging.domain.po.StudentPO;
import com.lujieni.logging.domain.vo.StudentVO;
import com.lujieni.logging.mybatis.service.AbstractBaseService;
import com.lujieni.logging.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl extends AbstractBaseService<StudentDao, StudentPO> implements IStudentService {
    @Override
    public List<StudentVO> findStudentByName() {
        return dao.findStudentByName("陆捷旎");
    }
}
