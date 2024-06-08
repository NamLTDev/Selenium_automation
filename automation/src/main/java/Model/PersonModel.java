package Model;

import com.poiji.annotation.ExcelCellName;

public class PersonModel extends TestCaseModel{

    @ExcelCellName("FirstName")
    private String firstName;

    @ExcelCellName("MiddleName")
    private String middleName;

    @ExcelCellName("LastName")
    private String lastName;
}
