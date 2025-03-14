package com.poc.imprimit_pdf.demo.service;

import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Map;

@Service
public class PdfService {

    private final SpringTemplateEngine templateEngine;

    public PdfService(SpringTemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public byte[] generatePdf(String templateName, Map<String, Object> data) {
        Context context = new Context();
        context.setVariables(data);
        String htmlContent = templateEngine.process(templateName, context);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocumentFromString(htmlContent);
        renderer.layout();

        try (OutputStream os = outputStream) {
            renderer.createPDF(outputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return outputStream.toByteArray();
    }
}