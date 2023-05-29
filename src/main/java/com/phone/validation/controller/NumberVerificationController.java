package com.phone.validation.controller;

import com.phone.validation.domain.NumberRequest;
import com.phone.validation.service.NumberVerificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/validate")
@RequiredArgsConstructor
public class NumberVerificationController {
    @Autowired
    private final NumberVerificationService service;

    @PostMapping("/number")
    public ResponseEntity<String> validateNumber(@RequestBody NumberRequest request) throws IOException {
        return service.validate(request.number());
    }
}
