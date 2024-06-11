package org.example.hsjboardproject.controller.user;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "user_tb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String email;
    private String username;
    private String password;
    private String name;

    @CreationTimestamp
    private Timestamp createdAt;
    // 여기 값이 들어왔다? 그럼 오어스를 사용한것
    private String provider; // facebook, kakao, apple, naver

    @Builder
    public User(Integer id, String email, String username, String password, String name, String provider, Timestamp createdAt) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.name = name;
        this.provider = provider;
        this.createdAt = createdAt;
    }
}
