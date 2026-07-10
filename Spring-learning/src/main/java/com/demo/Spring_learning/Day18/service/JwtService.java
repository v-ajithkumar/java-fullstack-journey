package com.demo.Spring_learning.Day18.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;

@Service
public class JwtService {
        private final String SECRET_KEY = "a8f3d2c1b7e9f6a5d4c3b2a1f8e7d6c5";

        private SecretKey getSignKey(){
            return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
        }

        public String generateToken(String username, String role){
            return Jwts.builder()
                    .subject(username)
                    .claim("role",role)
                    .issuedAt(new Date())
                    .expiration(new Date(System.currentTimeMillis()+1000*60*60))
                    .signWith(getSignKey())
                    .compact();
        }

        private Claims extractAllClaims(String token){
            return Jwts.parser()
                    .verifyWith(getSignKey())
                    .build()
                    .parseSignedClaims(token)
                    .getPayload();
        }

        public String extractUsername(String token){
           return  extractAllClaims(token).getSubject();
        }

        public String extractRole(String token) {
           return extractAllClaims(token).get("role", String.class);
        }

        public Date extractExpiration(String token){
            return extractAllClaims(token).getExpiration();
        }

        public boolean isTokenExpired(String token) {
            return extractExpiration(token).before(new Date());
        }

        public boolean isTokenValid(String token, UserDetails userDetails){
            String username =  extractUsername(token);
            return username.equals(userDetails.getUsername()) && !isTokenExpired(token);

        }
}

