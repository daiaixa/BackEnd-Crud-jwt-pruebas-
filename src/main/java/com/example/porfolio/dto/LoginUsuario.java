
package com.example.porfolio.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginUsuario {
    
    @NotBlank
    private String email;  
    @NotBlank
    private String password; 

    public LoginUsuario() {
    }

    public LoginUsuario(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    
    
}
