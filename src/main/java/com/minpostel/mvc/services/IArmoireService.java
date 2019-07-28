package com.minpostel.mvc.services;

import com.minpostel.mvc.entities.Armoire;

import java.util.List;

public interface IArmoireService {

    public Armoire save(Armoire entity);

    public Armoire update(Armoire entity);

    public List<Armoire> selectAll();

    public List<Armoire> selectAll(String sortField, String sort);

    public Armoire getById(Long id);

    public void remove(Long id);

    public Armoire findOne(String paramName, Object paramValue);

    public Armoire findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
