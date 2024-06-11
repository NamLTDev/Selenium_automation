package org.example.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest
public class SpringBaseTestNG extends AbstractTestNGSpringContextTests {

    @Autowired
    ApplicationContext ctx;

    public static String event;

    //config for test output in excel file.

}
