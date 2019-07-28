package com.minpostel.mvc.services;

import com.minpostel.mvc.entities.Profile;

import java.util.List;

public interface IProfileService {

    public Profile save(Profile entity);

    public Profile update(Profile entity);

    public List<Profile> selectAll();

    public List<Profile> selectAll(String sortField, String sort);

    public Profile getById(Long id);

    public void remove(Long id);

    public Profile findOne(String paramName, Object paramValue);

    public Profile findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
