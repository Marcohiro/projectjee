package com.group6.projectjee.Structure;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class StructureStorage {

    private ArrayList<GenericData> genericDataArrayList = new ArrayList<>();

    public ArrayList<GenericData> getGenericDataArrayList() {
        return genericDataArrayList;
    }

    public void add(GenericData genericData){
        this.genericDataArrayList.add((genericData));
    }

    public int getSize(){
        return this.genericDataArrayList.size();
    }
}
