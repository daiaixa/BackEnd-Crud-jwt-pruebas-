package com.example.porfolio.controller;

import com.example.porfolio.dto.JwtDto;
import com.example.porfolio.dto.LoginUsuario;
import com.example.porfolio.dto.Mensaje;
import com.example.porfolio.jwt.JwtProvider;
import com.example.porfolio.service.RolService;
import com.example.porfolio.service.UsuarioService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class loginController {

    @Autowired
    UsuarioService usuarioServ;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    AuthenticationManager authManager;
    @Autowired
    RolService rolService;
    @Autowired
    JwtProvider jwtProvider;

    //@PostMapping("/inicio")
   // public ResponseEntity<JwtDto> login(@Validated @RequestBody LoginUsuario loginUsuario, BindingResult bindingResult) {
    //    if (bindingResult.hasErrors()) {
    //        return new ResponseEntity(new Mensaje("campos erroneos"), HttpStatus.BAD_REQUEST);
    //    }
      //  Authentication authentication
    //            = authManager.authenticate(new UsernamePasswordAuthenticationToken(loginUsuario.getEmail(), loginUsuario.getPassword()));

     //   String jwt = jwtProvider.generateToken(authentication);
     //   UserDetails userDetails = (UserDetails) authentication.getPrincipal();
      //  JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());
     //   SecurityContextHolder.getContext().setAuthentication(authentication);
     //   return new ResponseEntity(jwtDto, HttpStatus.OK);
    //}

    @PostMapping("/auth")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginUsuario loginUsuario) {
        Authentication authentication = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginUsuario.getEmail(), loginUsuario.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateToken(authentication); //creo el token

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());
        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());
        return new ResponseEntity(jwtDto, HttpStatus.OK);
    }

}
