package com.lineage.web.security.jwt;

import com.lineage.web.users.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UsersDetailsImplements implements UserDetails {

    private static final long serialVersion = 1L;
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private Collection<? extends GrantedAuthority> grantedAuthorities;

    public UsersDetailsImplements(Long id, String userName, String firstName, String lastName, String email, String password, Collection<? extends GrantedAuthority> grantedAuthorities) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.grantedAuthorities = grantedAuthorities;
    }

    //public static UsersDetailsImplements build(User user){
    //    //todo les roles
    //}

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
