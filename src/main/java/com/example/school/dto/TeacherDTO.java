package com.example.school.dto;

import lombok.Data;
import java.util.List;

@Data
public class TeacherDTO {
    private Long id;
    private String schoolUlid;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private List<SubjectDTO> subjectDTOList;
}
