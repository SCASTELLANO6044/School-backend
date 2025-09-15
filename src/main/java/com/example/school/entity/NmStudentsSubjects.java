package com.example.school.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "nm_students_subjects")
public class NmStudentsSubjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "school_ulid", nullable = false, unique = true)
    private String schoolUlid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "students_id", nullable = false)
    private StudentsEntity studentsEntity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subjects_id", nullable = false)
    private SubjectsEntity subjectsEntity;
}
