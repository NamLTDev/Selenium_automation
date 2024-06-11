package org.example.info;

import lombok.Data;

@Data
public class PersonInfo extends ScenariosInfo{

    private String firstName;

    private String middleName;

    private String lastName;

    public PersonInfo(String firstName,String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
}
