package com.example.school.repository;

import com.example.school.entity.NmStudentsSubjectsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NmStudentsSubjectsRepository extends JpaRepository<NmStudentsSubjectsEntity, Long> {
    NmStudentsSubjectsEntity findById(long id);
}
