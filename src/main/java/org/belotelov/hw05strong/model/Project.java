package org.belotelov.hw05strong.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "projectname")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "createddate")
    private LocalDate createdDate;
}
