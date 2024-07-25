package dev.oscar.supportapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.oscar.supportapp.model.Consult;

@Repository
public interface ConsultRepository extends JpaRepository<Consult, Long> {
}