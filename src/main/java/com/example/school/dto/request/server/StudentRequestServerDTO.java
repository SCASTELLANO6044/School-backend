package com.example.school.dto.request.server;

import lombok.Data;

import java.util.List;

@Data
public class StudentRequestServerDTO {
    private String name;
    private String surname;
    private String phone;
    private String email;
    private List<NmStudentSubjectRequestServerDTO> nmStudentSubjectRequestServerDTOList;
}
