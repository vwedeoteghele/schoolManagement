package model;

import java.util.Date;

public class Grade {
    private String gradeValue;
    private Date evaluationDate;
    public Grade(String gradeValue, Date evaluationDate) {
        this.evaluationDate = evaluationDate;
        this.gradeValue = gradeValue;
    }
}
