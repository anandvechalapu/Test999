package com.Java.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java.entity.DocumentGenerateService;
import com.Java.repository.DocumentGenerateServiceRepository;

@Service
public class DocumentGenerateService {
    
    @Autowired
    DocumentGenerateServiceRepository documentGenerateServiceRepository;
    
    public byte[] generateDebitNoteById(Long id) {
        Optional<DocumentGenerateService> documentGenerateService = documentGenerateServiceRepository.findById(id);
        if (documentGenerateService.isPresent()) {
            return documentGenerateService.get().generateDebitNoteById(id);
        }
        return null;
    }
    
    public byte[] generateInwardDebitNoteByDTO(DocumentGenerationDTO dto) {
        Optional<DocumentGenerateService> documentGenerateService = documentGenerateServiceRepository.findById(dto.getId());
        if (documentGenerateService.isPresent()) {
            return documentGenerateService.get().generateInwardDebitNoteByDTO(dto);
        }
        return null;
    }
    
    public byte[] generateGSTBillById(Long id) {
        Optional<DocumentGenerateService> documentGenerateService = documentGenerateServiceRepository.findById(id);
        if (documentGenerateService.isPresent()) {
            return documentGenerateService.get().generateGSTBillById(id);
        }
        return null;
    }
    
    public byte[] generateGSTBillByDTO(DocumentGenerationDTO dto) {
        Optional<DocumentGenerateService> documentGenerateService = documentGenerateServiceRepository.findById(dto.getId());
        if (documentGenerateService.isPresent()) {
            return documentGenerateService.get().generateGSTBillByDTO(dto);
        }
        return null;
    }
    
    public byte[] generateGSTInvoiceById(Long id) {
        Optional<DocumentGenerateService> documentGenerateService = documentGenerateServiceRepository.findById(id);
        if (documentGenerateService.isPresent()) {
            return documentGenerateService.get().generateGSTInvoiceById(id);
        }
        return null;
    }
    
    public byte[] generateGSTInvoiceByDTO(DocumentGenerationDTO dto) {
        Optional<DocumentGenerateService> documentGenerateService = documentGenerateServiceRepository.findById(dto.getId());
        if (documentGenerateService.isPresent()) {
            return documentGenerateService.get().generateGSTInvoiceByDTO(dto);
        }
        return null;
    }
}