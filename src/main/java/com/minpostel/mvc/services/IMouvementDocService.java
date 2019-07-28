package com.minpostel.mvc.services;

import com.minpostel.mvc.entities.MouvementDoc;

import java.util.List;

public interface IMouvementDocService {

    public MouvementDoc save(MouvementDoc entity);

    public MouvementDoc update(MouvementDoc entity);

    public List<MouvementDoc> selectAll();

    public List<MouvementDoc> selectAll(String sortField, String sort);

    public MouvementDoc getById(Long id);

    public void remove(Long id);

    public MouvementDoc findOne(String paramName, Object paramValue);

    public MouvementDoc findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
