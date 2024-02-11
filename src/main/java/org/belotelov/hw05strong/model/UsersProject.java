package org.belotelov.hw05strong.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usersproject")
public class UsersProject extends EntityWithRelation {
    @Column(name="projectid")
    private Long projectId;
    @Column(name="userid")
    private Long userId;
}
