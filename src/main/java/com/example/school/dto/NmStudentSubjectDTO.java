package com.example.school.dto;

import lombok.Data;

@Data
public class NmStudentSubjectDTO {
    private Long id;
    private String schoolUlid;
    private StudentDTO student;
    private SubjectDTO subject;
}
