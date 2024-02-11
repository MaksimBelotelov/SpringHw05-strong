package org.belotelov.hw05strong.repositories;

import org.belotelov.hw05strong.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
