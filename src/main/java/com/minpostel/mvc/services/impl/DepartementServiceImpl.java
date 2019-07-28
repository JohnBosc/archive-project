package com.minpostel.mvc.services.impl;

import com.minpostel.mvc.dao.IDepartementDao;
import com.minpostel.mvc.entities.Departement;
import com.minpostel.mvc.services.IDepartementService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class DepartementServiceImpl implements IDepartementService {

    private IDepartementDao dao;

    public void setDao(IDepartementDao dao) {
        this.dao = dao;
    }


    @Override
    public Departement save(Departement entity) {
        return dao.save(entity);
    }

    @Override
    public Departement update(Departement entity) {
        return dao.update(entity);
    }

    @Override
    public List<Departement> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Departement> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Departement getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Departement findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Departement findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
}
