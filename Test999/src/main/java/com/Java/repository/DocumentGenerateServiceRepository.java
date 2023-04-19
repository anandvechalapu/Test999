package com.Java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentGenerateServiceRepository extends JpaRepository<DocumentGenerateService, Long> {
    
    byte[] generateDebitNoteById(Long id);
    
    byte[] generateInwardDebitNoteByDTO(DocumentGenerationDTO dto);
    
    byte[] generateGSTBillById(Long id);
    
    byte[] generateGSTBillByDTO(DocumentGenerationDTO dto);
    
    byte[] generateGSTInvoiceById(Long id);
    
    byte[] generateGSTInvoiceByDTO(DocumentGenerationDTO dto);

}