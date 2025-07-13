package com.cognizant.spring_learn.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;

public class JwtUtil {
    private String secretKey = "8357751e-cc7c-422b-80de-957d2e0346f2"; // A secret key for signing JWTs

    // Method to generate the JWT
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour validity
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
    }

    // Method to extract username from the token
    public String extractUsername(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    // Validate the JWT token
    public boolean isTokenExpired(String token) {
        return extractExpirationDate(token).before(new Date());
    }

    // Extract expiration date
    private Date extractExpirationDate(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody()
                .getExpiration();
    }
}
