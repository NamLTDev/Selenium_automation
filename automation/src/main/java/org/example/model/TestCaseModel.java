package org.example.model;

import com.poiji.annotation.ExcelCellName;

public class TestCaseModel {

    @ExcelCellName("TestCase")
    private String testCase;

    @ExcelCellName("Run")
    private boolean run;



}
