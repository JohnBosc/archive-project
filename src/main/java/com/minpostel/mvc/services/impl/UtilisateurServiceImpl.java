package com.minpostel.mvc.services.impl;

import com.minpostel.mvc.dao.IUtilisateurDao;
import com.minpostel.mvc.entities.Utilisateur;
import com.minpostel.mvc.services.IUtilisateurService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class UtilisateurServiceImpl implements IUtilisateurService {

    private IUtilisateurDao dao;

    public void setDao(IUtilisateurDao dao) {
        this.dao = dao;
    }

    @Override
    public Utilisateur save(Utilisateur entity) {
        return dao.save(entity);
    }

    @Override
    public Utilisateur update(Utilisateur entity) {
        return dao.update(entity);
    }

    @Override
    public List<Utilisateur> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Utilisateur> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Utilisateur getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Utilisateur findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Utilisateur findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }

}
