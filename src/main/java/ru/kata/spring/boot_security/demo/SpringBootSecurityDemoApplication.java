package ru.kata.spring.boot_security.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;
import ru.kata.spring.boot_security.demo.repositories.UserRepository;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * admin@mail.com=admin
 * user@mail.com=user
 * user2@mail.com=user
 *
 */

@SpringBootApplication
public class SpringBootSecurityDemoApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
	}

	private final RoleRepository roleRepository;

	private final UserRepository userRepository;

	public SpringBootSecurityDemoApplication(RoleRepository roleRepository, UserRepository userRepository) {
		this.roleRepository = roleRepository;
		this.userRepository = userRepository;
	}

	@Override
	public void run(String... args) {
		Role adminR = new Role("ROLE_ADMIN");
        Role userR = new Role("ROLE_USER");
        roleRepository.save(adminR);
        roleRepository.save(userR);
        Set<Role> adminRoles = new HashSet<>();
        Set<Role> userRoles = new HashSet<>();
        adminRoles.add(adminR);
        adminRoles.add(userR);
        userRoles.add(userR);

        User userAdmin = new User("admin", "admin", "$2a$10$P0uwt64MqHhajyz8ct/dZ.G1HgeV130LOAPWp.QZObcC2BPNFjtUa", 25, "admin@mail.com", adminRoles);
        User userUser = new User("user", "user", "$2a$10$Qc.EX9NKznnqloi6thc9WuKsuv5pYQR3oolsI6oN/y1I/.Qx2SxfK", 19, "user@mail.com", userRoles);
        User userUser2 = new User("user2", "user2", "$2a$10$Qc.EX9NKznnqloi6thc9WuKsuv5pYQR3oolsI6oN/y1I/.Qx2SxfK", 28, "user2@mail.com", userRoles);
        userRepository.save(userAdmin);
        userRepository.save(userUser);
        userRepository.save(userUser2);
	}
}
