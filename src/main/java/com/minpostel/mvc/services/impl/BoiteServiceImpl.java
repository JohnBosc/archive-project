package com.minpostel.mvc.services.impl;

import com.minpostel.mvc.dao.IBoiteDao;
import com.minpostel.mvc.entities.Boite;
import com.minpostel.mvc.services.IBoiteService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class BoiteServiceImpl implements IBoiteService {

    private IBoiteDao dao;

    public void setDao(IBoiteDao dao) {
        this.dao = dao;
    }


    @Override
    public Boite save(Boite entity) {
        return dao.save(entity);
    }

    @Override
    public Boite update(Boite entity) {
        return dao.update(entity);
    }

    @Override
    public List<Boite> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Boite> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Boite getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Boite findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Boite findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
}
