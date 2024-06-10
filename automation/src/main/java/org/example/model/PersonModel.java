package org.example.model;

import com.poiji.annotation.ExcelCellName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PersonModel extends TestCaseModel{

    @ExcelCellName("FirstName")
    private String firstName;

    @ExcelCellName("MiddleName")
    private String middleName;

    @ExcelCellName("LastName")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }
}
