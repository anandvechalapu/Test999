import org.springframework.data.jpa.repository.JpaRepository;

public interface ICMForgetPasswordServiceRepository extends JpaRepository<ICMForgetPasswordService, Long> { 
 
    ICMForgetPasswordService findByUsername(String username); 
 
    ICMForgetPasswordService findByEmailOrPhoneNumber(String email, String phoneNumber); 
 
    ICMForgetPasswordService findByOTP(String OTP); 
 
    ICMForgetPasswordService save(String newPassword); 
 
    void deleteByUsername(String username); 
}