package com.lineage.web.roles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleUser, Long> {

    Optional<RoleUser> findByUserRole(EnumRole userRole);
}
