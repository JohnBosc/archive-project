package com.minpostel.mvc.services.impl;

import com.minpostel.mvc.dao.IProfileDao;
import com.minpostel.mvc.entities.Profile;
import com.minpostel.mvc.services.IProfileService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class ProfileServiceImpl implements IProfileService {

    private IProfileDao dao;

    public void setDao(IProfileDao dao) {
        this.dao = dao;
    }


    @Override
    public Profile save(Profile entity) {
        return dao.save(entity);
    }

    @Override
    public Profile update(Profile entity) {
        return dao.update(entity);
    }

    @Override
    public List<Profile> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Profile> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Profile getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Profile findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Profile findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }

}
