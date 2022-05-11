package com.first.service.thirdparty.repositories;

import com.first.service.thirdparty.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
