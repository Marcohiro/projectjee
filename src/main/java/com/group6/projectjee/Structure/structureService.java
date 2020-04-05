package com.group6.projectjee.Structure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class structureService {

    private final StructureStorage structureStorage;

    @Autowired
    public structureService(StructureStorage structureStorage){
        this.structureStorage = structureStorage;
    }

    public ArrayList<GenericData> getList(){
        return  structureStorage.getGenericDataArrayList();
    }
}
