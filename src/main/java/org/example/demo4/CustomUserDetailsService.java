//package org.example.demo4;
//
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.List;
//
//@Service
//@Transactional
//@RequiredArgsConstructor
//public class CustomUserDetailsService implements UserDetailsService {
//    @Autowired private UserRepository userRepository;
//    @Override public UserDetails loadUserByUsername
//            (String username) throws UsernameNotFoundException {
//        User user = userRepository.findByusername(username);
//
//        if (user == null) {throw new UsernameNotFoundException("User not found");}
//        return new org.springframework.security.core.userdetails
//    .User(user.getUsername(), user.getPassword(), getAuthorities(user));}
//    private Collection<? extends GrantedAuthority> getAuthorities(User user) {
//        return List.of(new SimpleGrantedAuthority(user.getRole()));}}