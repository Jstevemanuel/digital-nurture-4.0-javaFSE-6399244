package com.cognizant.spring_learn.controller;


import com.cognizant.spring_learn.util.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class AuthenticationController {
    private JwtUtil jwtUtil = new JwtUtil();

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestHeader("Authorization") String authorizationHeader) {
        try {
            String base64Credentials = authorizationHeader.substring("Basic ".length());
            String credentials = new String(Base64.getDecoder().decode(base64Credentials));
            final String[] values = credentials.split(":", 2);
            String username = values[0];
            String password = values[1];

            if (username.equals("user") && password.equals("pwd")) {
                // Generate JWT token
                String token = jwtUtil.generateToken(username);
                return ResponseEntity.ok("{\"token\":\"" + token + "\"}");
            } else {
                return ResponseEntity.status(401).body("{\"message\":\"Invalid credentials\"}");
            }
        } catch (Exception e) {
            return ResponseEntity.status(400).body("{\"message\":\"Bad Request\"}");
        }
    }
}

