package com.Java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Java.model.ICMForgetPasswordService;
import com.Java.model.DocumentGenerateService;
import com.Java.model.DocumentGenerationDTO;
import com.Java.service.ICMForgetPasswordServiceImp;
import com.Java.service.DocumentGenerateService;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ICMForgetPasswordServiceImp iCMForgetPasswordServiceImp;

    @Autowired
    private DocumentGenerateService documentGenerateService;

    @PostMapping("/forget-password")
    public ICMForgetPasswordService findByUsername(@RequestBody String username) {
        return iCMForgetPasswordServiceImp.findByUsername(username);
    }

    @PostMapping("/forget-password/email-or-phone")
    public ICMForgetPasswordService findByEmailOrPhoneNumber(@RequestBody String email,
            @RequestBody String phoneNumber) {
        return iCMForgetPasswordServiceImp.findByEmailOrPhoneNumber(email, phoneNumber);
    }

    @PostMapping("/forget-password/otp")
    public ICMForgetPasswordService findByOTP(@RequestBody String OTP) {
        return iCMForgetPasswordServiceImp.findByOTP(OTP);
    }

    @PostMapping("/forget-password/save")
    public ICMForgetPasswordService save(@RequestBody String newPassword) {
        return iCMForgetPasswordServiceImp.save(newPassword);
    }

    @PostMapping("/forget-password/delete")
    public void deleteByUsername(@RequestBody String username) {
        iCMForgetPasswordServiceImp.deleteByUsername(username);
    }

    @PostMapping("/document-generate/debit-note")
    public byte[] generateDebitNoteById(@RequestBody Long id) {
        return documentGenerateService.generateDebitNoteById(id);
    }

    @PostMapping("/document-generate/inward-debit-note")
    public byte[] generateInwardDebitNoteByDTO(@RequestBody DocumentGenerationDTO dto) {
        return documentGenerateService.generateInwardDebitNoteByDTO(dto);
    }

    @PostMapping("/document-generate/gst-bill")
    public byte[] generateGSTBillById(@RequestBody Long id) {
        return documentGenerateService.generateGSTBillById(id);
    }

    @PostMapping("/document-generate/gst-bill-dto")
    public byte[] generateGSTBillByDTO(@RequestBody DocumentGenerationDTO dto) {
        return documentGenerateService.generateGSTBillByDTO(dto);
    }

    @PostMapping("/document-generate/gst-invoice")
    public byte[] generateGSTInvoiceById(@RequestBody Long id) {
        return documentGenerateService.generateGSTInvoiceById(id);
    }

    @PostMapping("/document-generate/gst-invoice-dto")
    public byte[] generateGSTInvoiceByDTO(@RequestBody DocumentGenerationDTO dto) {
        return documentGenerateService.generateGSTInvoiceByDTO(dto);
    }

}