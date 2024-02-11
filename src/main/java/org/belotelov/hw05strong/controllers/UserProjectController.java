package org.belotelov.hw05strong.controllers;

import lombok.AllArgsConstructor;
import org.belotelov.hw05strong.model.Project;
import org.belotelov.hw05strong.model.User;
import org.belotelov.hw05strong.services.UserProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class UserProjectController {
    private UserProjectService userProjectService;

    @GetMapping("/users/{id}")
    public ResponseEntity<List<User>> getUsersByProjectId(@PathVariable("id") Long projectId) {
        return ResponseEntity.ok(userProjectService.getUsersByProjectId(projectId));
    }

    @GetMapping("/projects/{id}")
    public ResponseEntity<List<Project>> getProjectsByUserId(@PathVariable("id") Long userId) {
        return ResponseEntity.ok(userProjectService.getProjectsByUserId(userId));
    }

    @PostMapping("/add/{uid}/{pid}")
    public ResponseEntity addUserToProject(@PathVariable("uid") Long userId,
                                           @PathVariable("pid") Long projectId) {

        return ResponseEntity.ok(userProjectService.addUserToProject(userId, projectId));
    }

    @PostMapping("/remove/{uid}/{pid}")
    public ResponseEntity removeUserFromProject(@PathVariable("uid") Long userId,
                                                @PathVariable("pid") Long projectId) {
        userProjectService.removeUserFromProject(userId, projectId);
        return ResponseEntity.ok("Deleted successful");
    }
}
