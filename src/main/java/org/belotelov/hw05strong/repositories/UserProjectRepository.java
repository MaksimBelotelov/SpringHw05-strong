package org.belotelov.hw05strong.repositories;

import org.belotelov.hw05strong.model.User;
import org.belotelov.hw05strong.model.UsersProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserProjectRepository extends JpaRepository<UsersProject, Long> {

    List<UsersProject> findAllByProjectId(Long projectId);

    List<UsersProject> findAllByUserId(Long userId);

    UsersProject findAllByUserIdAndProjectId(Long userId, Long projectId);
}
