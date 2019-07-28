package com.minpostel.mvc.services;

import com.minpostel.mvc.entities.Nature;

import java.util.List;

public interface INatureService {

    public Nature save(Nature entity);

    public Nature update(Nature entity);

    public List<Nature> selectAll();

    public List<Nature> selectAll(String sortField, String sort);

    public Nature getById(Long id);

    public void remove(Long id);

    public Nature findOne(String paramName, Object paramValue);

    public Nature findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
