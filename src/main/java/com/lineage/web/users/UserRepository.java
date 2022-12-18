package com.lineage.web.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Cela va chercher dans la base de donnée par name, email
    Optional<User> findByUserName(String userName);
    Optional<User> findByEmail(String email);

    // Il regarde si cela existe oui ou non pour vérifier le Token
    Boolean existsByUserName(String userName);
    Boolean existsByEmail(String email);
}
