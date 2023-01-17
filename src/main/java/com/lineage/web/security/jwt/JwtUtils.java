package com.lineage.web.security.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import io.jsonwebtoken.*;

import java.util.Date;

public class JwtUtils {

    private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

    @Value("${ryclos.app.jwtSecret}") // il ira chercher la variable
    private String jwtSecret;
    @Value("${ryclos.app.jwtExperitaion}")
    private int jwtExperitaion; // In milli
    private String generetedJwtToken(Authentication authentication) { // il y aura toutes les info utilisateurs

        UsersDetailsImplements usersDetailsImplements = (UsersDetailsImplements) authentication.getPrincipal();
        return Jwts.builder()
                .setSubject(usersDetailsImplements.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + jwtExperitaion))
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }

    public String getUserNameFromToken(String token) {
        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
    }
}
