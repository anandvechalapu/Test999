package com.Java.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java.model.ICMForgetPasswordService;
import com.Java.repository.ICMForgetPasswordServiceRepository;

@Service 
public class ICMForgetPasswordServiceImp implements ICMForgetPasswordService { 
 
    @Autowired 
    private ICMForgetPasswordServiceRepository iCMForgetPasswordServiceRepository; 
 
    @Override 
    public ICMForgetPasswordService findByUsername(String username) { 
        return iCMForgetPasswordServiceRepository.findByUsername(username);
    } 
 
    @Override 
    public ICMForgetPasswordService findByEmailOrPhoneNumber(String email, String phoneNumber) { 
        return iCMForgetPasswordServiceRepository.findByEmailOrPhoneNumber(email, phoneNumber); 
    } 
 
    @Override 
    public ICMForgetPasswordService findByOTP(String OTP) { 
        return iCMForgetPasswordServiceRepository.findByOTP(OTP); 
    } 
 
    @Override 
    public ICMForgetPasswordService save(String newPassword) { 
        return iCMForgetPasswordServiceRepository.save(new ICMForgetPasswordService(newPassword)); 
    } 
 
    @Override 
    public void deleteByUsername(String username) { 
        Optional<ICMForgetPasswordService> iCMForgetPasswordService = iCMForgetPasswordServiceRepository.findByUsername(username); 
 
        if(iCMForgetPasswordService.isPresent()) { 
            iCMForgetPasswordServiceRepository.delete(iCMForgetPasswordService.get()); 
        } 
    } 
}