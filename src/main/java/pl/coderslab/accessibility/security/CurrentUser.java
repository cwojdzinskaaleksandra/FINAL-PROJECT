package pl.coderslab.accessibility.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CurrentUser extends User { //obiekt rozszerzajacy domyslny obiekt User ze spring security (tworzony podczas autoryzacji UserDetailService
                                        // zrobiony w celu stworzenia pola user zgodnego z NASZĄ domeną
                                        //      v
    private final pl.coderslab.accessibility.domain.User user;

    public CurrentUser(String username, String password, Collection<?
                extends GrantedAuthority> authorities, pl.coderslab.accessibility.domain.User user) {
        super(username, password, authorities);
        this.user = user;
    }
    public pl.coderslab.accessibility.domain.User getUser() {
        return user;
    }
}
