package com.lineage.web.security.jwt;

import com.lineage.web.users.User;
import com.lineage.web.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsersDetailsServiceImplements implements UsersDetailsServices {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadByUserName(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(userName).orElseThrow(()->new UsernameNotFoundException("UserName : " + userName + " not found"));

        return UsersDetailsImplements.build(user);
    }
}
