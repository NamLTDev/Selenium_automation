package org.example.steps.testNG;

import org.example.base.SpringBaseTestNG;
import org.example.model.ModelConfig;
import org.example.model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.List;

public class testAnnotation{

//    @Autowired
//    private ModelConfig modelConfig;

    @Test
    public void test(){
        System.out.println("This is first test");
        ModelConfig modelConfig = new ModelConfig();
        List<PersonModel> listPerson = modelConfig.getPersonData();
        System.out.println(modelConfig.getPersonData().get(0));
    }
}
