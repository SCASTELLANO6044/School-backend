package com.example.school.dto.response.server;

import com.example.school.dto.TeacherDTO;
import lombok.Data;

import java.util.List;

@Data
public class SubjectResponseServerDTO {
    private String schoolUlid;
    private String name;
    private String description;
    private TeacherDTO teacher;
    private List<NmStudentSubjectResponseServerDTO> nmStudentSubjectResponseServerDTOList;
}
