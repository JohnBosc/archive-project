package com.minpostel.mvc.services;

import com.minpostel.mvc.entities.Dossier;

import java.util.List;

public interface IDossierService {

    public Dossier save(Dossier entity);

    public Dossier update(Dossier entity);

    public List<Dossier> selectAll();

    public List<Dossier> selectAll(String sortField, String sort);

    public Dossier getById(Long id);

    public void remove(Long id);

    public Dossier findOne(String paramName, Object paramValue);

    public Dossier findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
