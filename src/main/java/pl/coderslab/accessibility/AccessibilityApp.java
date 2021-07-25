package pl.coderslab.accessibility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.coderslab.accessibility.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class AccessibilityApp {

    public static void main(String[] args) {
        SpringApplication.run(AccessibilityApp.class, args);
    }


//    @Bean
//    CommandLineRunner init(UserService userService, RoleService roleService) { //funkcja ktora uruchamia sie podczas startu aplikacji (za kazdym razem)
//        return (args) -> {
//
//            if(roleService.findByName("ROLE_ADMIN")==null) { //patrzymy czy mamy role admin i jesli nie to ja tworzymy
//                Role r = new Role();
//                r.setName("ROLE_ADMIN");
//            roleService.save(r);
//            }
//            if(roleService.findByName("ROLE_USER")==null) { //analogicznie do roli wyzej
//                Role r = new Role();
//                r.setName("ROLE_USER");
//                roleService.save(r);
//            }
//            if(userService.findByUserName("admin")==null){ //tworze admina
//
//                User user = new User();
//                user.setUserName("admin");
//                user.setPassword("admin");
//                userService.saveAdmin(user);
//            }
//            };
//        }

}
