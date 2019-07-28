package com.minpostel.mvc.services;

import com.minpostel.mvc.entities.ArchivePapier;

import java.util.List;

public interface IArchivePapierService {

    public ArchivePapier save(ArchivePapier entity);

    public ArchivePapier update(ArchivePapier entity);

    public List<ArchivePapier> selectAll();

    public List<ArchivePapier> selectAll(String sortField, String sort);

    public ArchivePapier getById(Long id);

    public void remove(Long id);

    public ArchivePapier findOne(String paramName, Object paramValue);

    public ArchivePapier findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
