package pl.coderslab.accessibility.service;


import pl.coderslab.accessibility.model.Role;

public interface RoleService {
    Role findByName(String name);
    Role save(Role role);
}
