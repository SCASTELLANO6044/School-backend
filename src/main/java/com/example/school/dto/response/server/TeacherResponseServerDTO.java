package com.example.school.dto.response.server;

import lombok.Data;

import java.util.List;

@Data
public class TeacherResponseServerDTO {
    private String schoolUlid;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private List<SubjectResponseServerDTO> subjectResponseServerDTOList;
}
