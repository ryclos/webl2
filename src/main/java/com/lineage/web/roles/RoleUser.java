package com.lineage.web.roles;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class RoleUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private EnumRole userRole;

    public RoleUser(EnumRole userRole) {
        this.userRole = userRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnumRole getUserRole() {
        return userRole;
    }

    public void setUserRole(EnumRole userRole) {
        this.userRole = userRole;
    }
}
