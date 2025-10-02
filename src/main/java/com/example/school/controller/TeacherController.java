package com.example.school.controller;

import com.example.school.dto.request.server.TeacherRequestServerDTO;
import com.example.school.dto.response.server.TeacherResponseServerDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("school/teacher")
@Tag(name = "Teacher", description = "Endpoints for CRUD operations with teacher")
public class TeacherController {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Create user")
    public ResponseEntity<TeacherResponseServerDTO> createUser(TeacherRequestServerDTO teacherRequestServerDTO) {
        return null;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Get Teacher by schoolUlid")
    public ResponseEntity<TeacherResponseServerDTO> getTeacherBySchoolUlid(@PathVariable String schoolUlid) {
        return null;
    }
}
