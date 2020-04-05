package com.group6.projectjee.Structure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.ArrayList;

@RestController
@RequestMapping("/structure")
public class Structure {

    private final structureService structureService;

    @Autowired
    public Structure(structureService structureService){
        this.structureService = structureService;
    }

    @RequestMapping(method = GET)
    public ArrayList<GenericData> getData(){
        return structureService.getList();
    }

}
