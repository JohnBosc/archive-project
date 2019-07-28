package com.minpostel.mvc.services.impl;

import com.minpostel.mvc.dao.IArmoireDao;
import com.minpostel.mvc.entities.Armoire;
import com.minpostel.mvc.services.IArmoireService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class ArmoireServiceImpl implements IArmoireService {

    private IArmoireDao dao;

    public void setDao(IArmoireDao dao) {
        this.dao = dao;
    }

    @Override
    public Armoire save(Armoire entity) {
        return dao.save(entity);
    }

    @Override
    public Armoire update(Armoire entity) {
        return dao.update(entity);
    }

    @Override
    public List<Armoire> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Armoire> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Armoire getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Armoire findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Armoire findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
}
