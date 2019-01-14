package com.tma.security;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tma.db.model.User;
import com.tma.entities.daoImpl.UserRepository;


@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    public UserDetailServiceImpl() {
        super();
    }


    @Override
    public UserDetails loadUserByUsername(final String username) {
        final User user = userRepository.findByName(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new org.springframework.security.core.userdetails.User(username, user.getPassword(), true, true, true, true, Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
