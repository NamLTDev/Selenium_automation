package org.example.model;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class TestCaseModel {

    @ExcelCellName("TestCase")
    private String testCase;

    @ExcelCellName("Run")
    private boolean run;

}
