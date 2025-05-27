package mx.edu.utez.cvambg9b.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user2")
@CrossOrigin(origins = "**")
public class User2Controller {
    @GetMapping("")
    public String getUser2() {
        return "User2 endpoint is working!";
    }
}
