package org.example.hsjboardproject.controller.user;

import lombok.Data;

public class UserRequest {

    @Data
    public static class LoginDTO {
        private String email;
        private String password;
    }

    @Data
    public static class JoinDTO {
        private String email;
        private String username;
        private String password;

        public User toEntity(String password) {
            return User.builder()
                    .email(email)
                    .username(username)
                    .password(password)
                    .build();
        }
    }
}
