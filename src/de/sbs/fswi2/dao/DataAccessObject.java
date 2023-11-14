package de.sbs.fswi2.dao;


import java.util.List;

import daoservice.DAOHttpService;

public class DataAccessObject implements Speicherbar <DataTransferObject>{

    @Override
    public List<DataTransferObject> getAll() {
        System.out.println(DAOHttpService.useService());
        return null;
    }

    @Override
    public boolean create(DataTransferObject data) {
        return false;
    }

    @Override
    public boolean delete(DataTransferObject data) {
        return false;
    }

}