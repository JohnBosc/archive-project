package com.minpostel.mvc.services;

import com.minpostel.mvc.entities.Boite;

import java.util.List;

public interface IBoiteService {

    public Boite save(Boite entity);

    public Boite update(Boite entity);

    public List<Boite> selectAll();

    public List<Boite> selectAll(String sortField, String sort);

    public Boite getById(Long id);

    public void remove(Long id);

    public Boite findOne(String paramName, Object paramValue);

    public Boite findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
