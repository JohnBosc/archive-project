package com.minpostel.mvc.services.impl;

import com.minpostel.mvc.dao.ITypeDao;
import com.minpostel.mvc.entities.Type;
import com.minpostel.mvc.services.ITypeService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class TypeServiceImpl implements ITypeService {

    private ITypeDao dao;

    public void setDao(ITypeDao dao) {
        this.dao = dao;
    }

    @Override
    public Type save(Type entity) {
        return dao.save(entity);
    }

    @Override
    public Type update(Type entity) {
        return dao.update(entity);
    }

    @Override
    public List<Type> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Type> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Type getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Type findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Type findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }

}
