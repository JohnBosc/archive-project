package com.minpostel.mvc.services.impl;

import com.minpostel.mvc.dao.IMouvementDocDao;
import com.minpostel.mvc.entities.MouvementDoc;
import com.minpostel.mvc.services.IMouvementDocService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class MouvementDocServiceImpl implements IMouvementDocService {

    private IMouvementDocDao dao;

    public void setDao(IMouvementDocDao dao) {
        this.dao = dao;
    }


    @Override
    public MouvementDoc save(MouvementDoc entity) {
        return dao.save(entity);
    }

    @Override
    public MouvementDoc update(MouvementDoc entity) {
        return dao.update(entity);
    }

    @Override
    public List<MouvementDoc> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<MouvementDoc> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public MouvementDoc getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public MouvementDoc findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public MouvementDoc findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
}
