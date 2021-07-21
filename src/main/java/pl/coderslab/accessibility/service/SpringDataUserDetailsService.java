package pl.coderslab.accessibility.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.coderslab.accessibility.model.Role;
import pl.coderslab.accessibility.model.User;
import pl.coderslab.accessibility.security.CurrentUser;

import java.util.HashSet;
import java.util.Set;

public class SpringDataUserDetailsService implements UserDetailsService { //implementacja serwisu UserDetailsService ktory wywolywany jest
                                                                          // przez spring security podczas autoryzacji
                                                                          // podczas loadUserByUsername szukamy usera w naszym serwisie (DB)


    @Autowired
    private UserService userService;

    @Override
    public CurrentUser loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.findByUsername(s);
        if (user == null) {throw new UsernameNotFoundException(s); }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Role role : user.getRoles()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        return new CurrentUser(user.getUsername(),user.getPassword(), grantedAuthorities, user);
    }
}
