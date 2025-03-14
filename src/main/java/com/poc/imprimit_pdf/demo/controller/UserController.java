package com.poc.imprimit_pdf.demo.controller;

import com.poc.imprimit_pdf.demo.service.PdfService;
import com.poc.imprimit_pdf.demo.service.UserService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private final PdfService pdfService;
    private final UserService userService;

    public UserController(PdfService pdfService,
                          UserService userService) {
        this.pdfService = pdfService;
        this.userService = userService;
    }

    @GetMapping("/pdf")
    public ResponseEntity<byte[]> generateUserPdf() {
        Map<String, Object> data = Map.of("users", userService.listarUsuarios());
        byte[] pdfBytes = pdfService.generatePdf("users", data);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=usuarios.pdf")
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdfBytes);
    }
}