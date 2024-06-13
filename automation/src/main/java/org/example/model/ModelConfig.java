package org.example.model;

import com.poiji.bind.Poiji;
import org.example.util.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

@Configuration
public class ModelConfig {

//    @Autowired
//    private ExcelUtils excelUtils;

    @Bean
    public List<PersonModel> getPersonData(){
        ExcelUtils excelUtils = new ExcelUtils();
        return excelUtils.retrieveExcelData(PersonModel.class, "src/main/resources/TestData/TestData.xlsx");
    }
}
