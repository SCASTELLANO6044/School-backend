package com.example.school.dto.request.server;
import com.example.school.dto.TeacherDTO;
import lombok.Data;

import java.util.List;

@Data
public class SubjectRequestServerDTO {
    private String name;
    private String description;
    private TeacherDTO teacher;
    private List<NmStudentSubjectRequestServerDTO> nmStudentSubjectRequestServerDTOList;
}
