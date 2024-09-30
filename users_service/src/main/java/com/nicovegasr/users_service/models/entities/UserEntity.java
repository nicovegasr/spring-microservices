package com.nicovegasr.users_service.models.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Entity
@Data
@Builder
@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users", schema = "auth")
public class UserEntity {
    @Id
    @Column(name = "username", nullable = false, unique = true)
    String username;

    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "created_at", nullable = false)
    LocalDate createdAt;

    @Column(name = "last_login_date")
    LocalDate lastLoginDate;
}