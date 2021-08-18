package com.lujieni.logging.service.impl;

import com.lujieni.logging.dao.StudentDao;
import com.lujieni.logging.domain.po.StudentPO;
import com.lujieni.logging.domain.vo.StudentVO;
import com.lujieni.logging.mybatis.service.AbstractBaseService;
import com.lujieni.logging.service.IStudentService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@Service
public class StudentServiceImpl extends AbstractBaseService<StudentDao, StudentPO> implements IStudentService {

    @Override
    public List<StudentPO> findStudentByName() {
        Example example = new Example(StudentPO.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name", "陆捷旎");
        return dao.selectByExample(example);
        //return dao.findStudentByName("陆捷旎");
    }
}
