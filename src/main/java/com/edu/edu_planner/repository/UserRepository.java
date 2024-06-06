package com.edu.edu_planner.repository;

import com.edu.edu_planner.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
