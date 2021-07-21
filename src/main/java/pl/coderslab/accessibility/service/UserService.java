package pl.coderslab.accessibility.service;

import pl.coderslab.accessibility.model.User;
import pl.coderslab.accessibility.model.dto.RegisterDto;
import pl.coderslab.accessibility.exceptions.RegisterFailedException;

import java.util.List;

public interface UserService {

    User save(User u);
    User saveAdmin(User u);
    List<User> findAll();
    User findByUsername(String username);
    User registerUser(RegisterDto dto) throws RegisterFailedException;
}
