package com.veyodev.test.glassware.web;

import com.veyodev.test.glassware.validation.Forename;
import com.veyodev.test.glassware.validation.Surname;



/**
 * @author Masoud Nour
 */
public class RegistrationForm {
    @Forename
    private String forename;
    @Surname
    private String surname;

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

