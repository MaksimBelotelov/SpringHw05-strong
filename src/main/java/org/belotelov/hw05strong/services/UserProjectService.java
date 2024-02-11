package org.belotelov.hw05strong.services;

import lombok.AllArgsConstructor;
import org.belotelov.hw05strong.model.Project;
import org.belotelov.hw05strong.model.User;
import org.belotelov.hw05strong.model.UsersProject;
import org.belotelov.hw05strong.repositories.ProjectRepository;
import org.belotelov.hw05strong.repositories.UserProjectRepository;
import org.belotelov.hw05strong.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserProjectService {
    UserRepository userRepository;
    ProjectRepository projectRepository;
    UserProjectRepository userProjectRepository;
    public UsersProject addUserToProject(Long userId, Long projectId) {
        UsersProject usersProject = new UsersProject();
        usersProject.setUserId(userId);
        usersProject.setProjectId(projectId);
        return userProjectRepository.save(usersProject);
    }

    public List<User> getUsersByProjectId(Long projectId) {
        List<UsersProject> list = userProjectRepository.findAllByProjectId(projectId);
        List<User> userList = new ArrayList<>();
        for (UsersProject userProjItem : list) {
            userList.add(userRepository.findById(userProjItem.getUserId()).orElse(null));
        }
        return userList;
    }

    public List<Project> getProjectsByUserId(Long userId) {
        List<UsersProject> list = userProjectRepository.findAllByUserId(userId);
        List<Project> projList = new ArrayList<>();
        for (UsersProject usersProjItem : list) {
            projList.add(projectRepository.findById(usersProjItem.getProjectId()).orElse(null));
        }
        return projList;
    }

    public void removeUserFromProject(Long userId, Long projectId) {
        UsersProject usersProject = userProjectRepository.findAllByUserIdAndProjectId(userId, projectId);
        if(usersProject != null) userProjectRepository.delete(usersProject);
    }
}
