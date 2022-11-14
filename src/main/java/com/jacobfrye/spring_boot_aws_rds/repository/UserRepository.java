package com.jacobfrye.spring_boot_aws_rds.repository;

import com.jacobfrye.spring_boot_aws_rds.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String userName);
}
