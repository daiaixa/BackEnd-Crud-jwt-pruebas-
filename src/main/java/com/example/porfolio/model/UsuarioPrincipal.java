/*
 * encargada de generar la seguridad
 */
package com.example.porfolio.model;

import com.sun.istack.NotNull;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


@Getter
@Setter
public class UsuarioPrincipal implements UserDetails{
    
    @NotNull
    private String nombre;
    @NotNull
    @Column(unique = true)
    private String email;
    @NotNull
    private String password;
    private Collection<? extends GrantedAuthority> authorities; 

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
    }

    @Override
    public String getPassword() {
    return password;
    }

    @Override
    public String getUsername() {
    return email;
    }

    @Override
    public boolean isAccountNonExpired() {
    return  true;
    }

    @Override
    public boolean isAccountNonLocked() {
    return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
    return true;
    }

    @Override
    public boolean isEnabled() {
    return true;
    }

    public UsuarioPrincipal(String nombre, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public static UsuarioPrincipal biuld(Usuario usuario) {
        List<GrantedAuthority> authorities = 
                usuario.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol.getRolNombre().name())).collect(Collectors.toList());
        return new UsuarioPrincipal(usuario.getNombre(), usuario.getEmail(), usuario.getPassword(), authorities);
    }
            
}
