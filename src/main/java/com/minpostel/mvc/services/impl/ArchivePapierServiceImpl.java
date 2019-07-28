package com.minpostel.mvc.services.impl;

import com.minpostel.mvc.dao.IArchivePapierDao;
import com.minpostel.mvc.entities.ArchivePapier;
import com.minpostel.mvc.services.IArchivePapierService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class ArchivePapierServiceImpl implements IArchivePapierService {

    private IArchivePapierDao dao;

    public void setDao(IArchivePapierDao dao) {
        this.dao = dao;
    }

    @Override
    public ArchivePapier save(ArchivePapier entity) {
        return dao.save(entity);
    }

    @Override
    public ArchivePapier update(ArchivePapier entity) {
        return dao.update(entity);
    }

    @Override
    public List<ArchivePapier> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<ArchivePapier> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public ArchivePapier getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public ArchivePapier findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public ArchivePapier findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
}
