package com.example.school.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "subjects")
public class SubjectsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "school_ulid", nullable = false, unique = true)
    private String schoolUlid;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "description", nullable = false, unique = true)
    private String description;

    @OneToMany(mappedBy = "nmStudentsSubjectsEntity", fetch = FetchType.LAZY)
    private List<NmStudentsSubjectsEntity> nmStudentsSubjectsEntityList;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "teachers_id", nullable = false)
    private TeachersEntity teachersEntity;
}
