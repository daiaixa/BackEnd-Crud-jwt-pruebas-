
package com.example.porfolio.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginUsuario {
    
    private String email;   
    private String password; 

    public LoginUsuario() {
    }

    public LoginUsuario(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    
    
}
