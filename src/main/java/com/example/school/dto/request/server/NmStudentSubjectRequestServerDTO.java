package com.example.school.dto.request.server;

import lombok.Data;

@Data
public class NmStudentSubjectRequestServerDTO {
    private String schoolUlid;
    private StudentRequestServerDTO studentRequestServerDTO;
    private SubjectRequestServerDTO subjectRequestServerDTO;
}
