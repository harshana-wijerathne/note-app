package lk.ijse.dep13.springbackends.api;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthHttpController {

    @PostMapping("/login")
    public String login(){
        return "Log in";
    }

    @DeleteMapping("/logout")
    public String logout(){
        return "Log out";
    }
}
