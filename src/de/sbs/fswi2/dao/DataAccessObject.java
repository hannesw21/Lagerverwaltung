package de.sbs.fswi2.dao;


import java.util.List;


import daoservice.DAOHttpService;
import daoservice.DAOJasonService;
import daoservice.LagerFXModel;

public class DataAccessObject implements Speicherbar <LagerFXModel>{

    @Override
    public List<LagerFXModel> getAll() {
       // System.out.println(DAOHttpService.getJSONOffline());
        return DAOJasonService.deserialize(DAOHttpService.getJSONOffline());
    }

    @Override
    public boolean create(LagerFXModel data) {
        return false;
    }

    @Override
    public boolean delete(LagerFXModel data) {
        return false;
    }

}