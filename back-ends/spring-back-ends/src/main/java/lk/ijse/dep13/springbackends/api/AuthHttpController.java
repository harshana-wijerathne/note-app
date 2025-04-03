package lk.ijse.dep13.springbackends.api;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthHttpController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/login")
    public String login(){
        return "Log in";
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/logout")
    public String logout(){
        return "Log out";
    }
}
