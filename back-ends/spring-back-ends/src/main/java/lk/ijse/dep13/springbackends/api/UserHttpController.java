package lk.ijse.dep13.springbackends.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserHttpController {

    @PostMapping
    public String signUp(){
        return "Create a new user account";
    }

    @GetMapping("/me")
    public String getUserInfo(){
        return "Get authenticated user information";
    }

    public String updateUser(){
        return "Update authenticated user information";
    }

    @DeleteMapping("/me")
    public String deleteUser(){
        return "Delete authenticated user account";
    }


}
