package com.brainstation.demo.socialmedia.TravelWorld.model;

import com.brainstation.demo.socialmedia.TravelWorld.model.enums.RoleName;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@Entity(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Size(min=5, max=100)
    private String fullName;

    @Size(min=5, max=50)
    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @Size(min=11, max=100)
    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "is_active", columnDefinition= "TINYINT(1)")
    private Boolean isActive;

    @Enumerated(EnumType.STRING)
    private RoleName role;

    @Column
    @CreationTimestamp
    private LocalDateTime createdAt;
}
