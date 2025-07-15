package com.cognizant.spring_learn.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.Date;

@RestController

public class AuthenticationController {
	
	 private static final String SECRET_KEY = "mysecretkey"; // Replace with secure key in real apps

	    @GetMapping("/authenticate")
	    public ResponseEntity<?> authenticate(@RequestHeader("Authorization") String authHeader) {
	        // Step 1: Validate Basic Auth format
	        if (authHeader == null || !authHeader.startsWith("Basic ")) {
	            return ResponseEntity.status(401).body("Missing or invalid Authorization header");
	        }

	        // Step 2: Decode credentials
	        String base64Credentials = authHeader.substring("Basic ".length());
	        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
	        String decodedCredentials = new String(decodedBytes);
	        String[] credentials = decodedCredentials.split(":", 2);

	        if (credentials.length != 2) {
	            return ResponseEntity.status(400).body("Invalid Authorization format");
	        }

	        String username = credentials[0];
	        String password = credentials[1];

	        // Step 3: Check dummy credentials
	        if (!username.equals("user") || !password.equals("pwd")) {
	            return ResponseEntity.status(401).body("Invalid credentials");
	        }

	        // Step 4: Generate JWT
	        String token = Jwts.builder()
	                .setSubject(username)
	                .setIssuedAt(new Date())
	                .setExpiration(new Date(System.currentTimeMillis() + 10 * 60 * 1000)) // 10 minutes
	                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
	                .compact();

	        return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
	    }

}
