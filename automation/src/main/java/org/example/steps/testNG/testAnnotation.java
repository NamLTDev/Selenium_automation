package org.example.steps.testNG;

import org.example.model.ModelConfig;
import org.example.model.PersonModel;
import org.testng.annotations.Test;

import java.util.List;

public class testAnnotation {

    @Test
    public void test(){
        System.out.println("This is first test");
        List<PersonModel> listPerson = ModelConfig.getPersonModel("src/main/resources/TestData/TestData.xlsx");
        System.out.println(listPerson.get(0).getFirstName());
    }
}
