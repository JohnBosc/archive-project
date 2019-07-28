package com.minpostel.mvc.services;

import com.minpostel.mvc.entities.Type;

import java.util.List;

public interface ITypeService {

    public Type save(Type entity);

    public Type update(Type entity);

    public List<Type> selectAll();

    public List<Type> selectAll(String sortField, String sort);

    public Type getById(Long id);

    public void remove(Long id);

    public Type findOne(String paramName, Object paramValue);

    public Type findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
