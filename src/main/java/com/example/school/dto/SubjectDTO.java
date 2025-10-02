package com.example.school.dto;

import lombok.Data;
import java.util.List;

@Data
public class SubjectDTO {
    private int id;
    private String schoolUlid;
    private String name;
    private String description;
    private TeacherDTO teacher;
    private List<NmStudentSubjectDTO> nmStudentSubjectDTOList;
}
