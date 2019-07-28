package com.minpostel.mvc.services.impl;

import com.minpostel.mvc.dao.IDossierDao;
import com.minpostel.mvc.entities.Dossier;
import com.minpostel.mvc.services.IDossierService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class DossierServiceImpl implements IDossierService {

    private IDossierDao dao;

    public void setDao(IDossierDao dao) {
        this.dao = dao;
    }


    @Override
    public Dossier save(Dossier entity) {
        return dao.save(entity);
    }

    @Override
    public Dossier update(Dossier entity) {
        return dao.update(entity);
    }

    @Override
    public List<Dossier> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Dossier> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Dossier getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Dossier findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Dossier findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
}
