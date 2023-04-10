package com.srhdp.repository;

import java.util.Optional;

import com.srhdp.models.ERole;
import com.srhdp.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
