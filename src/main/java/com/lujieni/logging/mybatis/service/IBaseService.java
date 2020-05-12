package com.lujieni.logging.mybatis.service;


import com.lujieni.logging.mybatis.service.delete.IDeleteService;
import com.lujieni.logging.mybatis.service.insert.IInsertService;
import com.lujieni.logging.mybatis.service.select.ISelectService;
import com.lujieni.logging.mybatis.service.update.IUpdateService;

public interface IBaseService<T> extends IDeleteService<T>, IInsertService<T>, IUpdateService<T>, ISelectService<T> {


}
