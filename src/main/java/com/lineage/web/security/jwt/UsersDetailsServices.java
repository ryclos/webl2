package com.lineage.web.security.jwt;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UsersDetailsServices {
    UserDetails loadByUserName(String userName) throws UsernameNotFoundException;
}
