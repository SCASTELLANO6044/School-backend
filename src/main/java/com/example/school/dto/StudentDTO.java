package com.example.school.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {
    private Long id;
    private String schoolUlid;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private List<NmStudentSubjectDTO> nmStudentSubjectDTOList;
}
