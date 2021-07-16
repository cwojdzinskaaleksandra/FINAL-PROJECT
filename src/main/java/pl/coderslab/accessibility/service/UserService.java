package pl.coderslab.accessibility.service;

import pl.coderslab.accessibility.domain.User;
import pl.coderslab.accessibility.domain.dto.RegisterDto;
import pl.coderslab.accessibility.exceptions.RegisterFailedException;

import java.util.List;

public interface UserService {

    User save(User u);
    User saveAdmin(User u);
    List<User> findAll();
    User findByUsername(String username);
    User registerUser(RegisterDto dto) throws RegisterFailedException;
}
