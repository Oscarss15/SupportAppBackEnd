package dev.oscar.supportapp.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Consults")
public class Consult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConsult")
    private Long idConsult;
    @Column(name = "name")
    private String name;
    @Column(name = "dateConsult")    
    private LocalDate dateConsult;
    @Column(name = "typeConsult") 
    private String typeConsult;
    @Column(name = "description") 
    private String description;

    public Consult(){

    }

    public Consult(Long idConsult, String name, LocalDate dateConsult, String typeConsult, String description) {
        this.idConsult = idConsult;
        this.name = name;
        this.dateConsult = dateConsult;
        this.typeConsult = typeConsult;
        this.description = description;
    }

    public Long getIdConsult() {
        return idConsult;
    }

    public void setIdConsult(Long idConsult) {
        this.idConsult = idConsult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateConsult() {
        return dateConsult;
    }

    public void setDateConsult(LocalDate dateConsult) {
        this.dateConsult = dateConsult;
    }

    public String getTypeConsult() {
        return typeConsult;
    }

    public void setTypeConsult(String typeConsult) {
        this.typeConsult = typeConsult;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

  
   

   
}
