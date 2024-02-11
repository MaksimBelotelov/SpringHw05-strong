package org.belotelov.hw05strong.repositories;

import org.belotelov.hw05strong.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
