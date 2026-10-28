package com.example.cursesback.application.domain.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
 private long id;
 private String userName;
 private String password;
 private LocalTime joinDate;
}
