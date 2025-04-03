package lk.ijse.dep13.springbackends.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserHttpController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public String signUp(){
        return "Create a new user account";
    }

    @GetMapping("/me")
    public String getUserInfo(){
        return "Get authenticated user information";
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/me")
    public String updateUser(){
        return "Update authenticated user information";
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/me")
    public String deleteUser(){
        return "Delete authenticated user account";
    }


}
