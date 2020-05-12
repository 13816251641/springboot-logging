package com.lujieni.logging.service;

import com.lujieni.logging.domain.vo.StudentVO;

import java.util.List;

/**
 * 主要放一些自定义的对表的操作
 */
public interface IStudentService {
    List<StudentVO> findStudentByName();
}
