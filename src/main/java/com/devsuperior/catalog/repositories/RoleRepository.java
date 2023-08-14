package com.devsuperior.catalog.repositories;

import com.devsuperior.catalog.entities.Role;
import com.devsuperior.catalog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}