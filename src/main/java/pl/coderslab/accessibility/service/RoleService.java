package pl.coderslab.accessibility.service;


import pl.coderslab.accessibility.domain.Role;

public interface RoleService {
    Role findByName(String name);
    Role save(Role role);
}
