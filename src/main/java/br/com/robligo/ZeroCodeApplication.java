package br.com.robligo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api/users")
public class ZeroCodeApplication {
    private List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(ZeroCodeApplication.class, args);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody User user) {
        if (!StringUtils.hasText(user.getPrimeiroNome())) {
            return new ResponseEntity("O primeiro nome não pode ser vazio!", HttpStatus.BAD_REQUEST);
        }
        if (!StringUtils.hasText(user.getSegundoNome())) {
            return new ResponseEntity("O segundo nome não pode ser vazio!", HttpStatus.BAD_REQUEST);
        }
        user.setId(UUID.randomUUID()
                .toString());
        users.add(user);
        return new ResponseEntity(user, HttpStatus.CREATED);
    }

}
