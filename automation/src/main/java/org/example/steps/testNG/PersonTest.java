package org.example.steps.testNG;

import org.example.model.ModelConfig;
import org.example.model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Stream;

public class PersonTest {

    @Autowired
    private ModelConfig modelConfig;

//    @DataProvider(name = "getData")
//    public Object [][] getData(){
////        Stream var10000 = modelConfig.getPersonModel().stream()
//    }

    @Test
    public void personTestRun(){
        List<PersonModel> personList = modelConfig.getPersonData();
        System.out.println(personList.get(0));
    }
}
