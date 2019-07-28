package com.minpostel.mvc.services.impl;

import com.minpostel.mvc.dao.INatureDao;
import com.minpostel.mvc.entities.Nature;
import com.minpostel.mvc.services.INatureService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class NatureServiceImpl implements INatureService {

    private INatureDao dao;

    public void setDao(INatureDao dao) {
        this.dao = dao;
    }


    @Override
    public Nature save(Nature entity) {
        return dao.save(entity);
    }

    @Override
    public Nature update(Nature entity) {
        return dao.update(entity);
    }

    @Override
    public List<Nature> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Nature> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Nature getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Nature findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Nature findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
}
