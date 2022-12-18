package com.lineage.web.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/authentification")
public class AuthController {

    @PostMapping("/signin")
    public void authentificateUser(){ // il se connecte

    }

    @PostMapping("/signapp")
    public void registerUser() { // Il s'enregistre créé un compte

    }
}
