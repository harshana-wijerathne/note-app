package lk.ijse.dep13.springbackends.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    public static final String DEFAULT_PROFILE_PICTURE = "data:image/webp;base64,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";
    private String email;
    private String password;
    private String profilePicture;
    private String fullName;
}
