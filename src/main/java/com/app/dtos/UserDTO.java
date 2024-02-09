package com.app.dtos;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.app.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO {
    
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "First name is required")
    private String fName;

    @NotBlank(message = "Last name is required")
    private String lName;

    @NotBlank(message = "Password is required")
    @Pattern(regexp = "^[a-zA-Z0-9]{8,20}$", message = "Password must be between 8 and 20 characters and contain only alphanumeric characters")
    private String password;

    @NotBlank(message = "Mobile number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid mobile number format")
    private String mobileNo;

    @NotBlank(message = "Aadhar card number is required")
    @Pattern(regexp = "^[0-9]{12}$", message = "Invalid Aadhar card number format")
    private String adharcardNo;
    
    
    private Role role;
    
    private byte[] profilePic;
    
}


