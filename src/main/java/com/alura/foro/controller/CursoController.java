package com.alura.foro.controller;

import com.alura.foro.domain.usuario.DatosRegistroUsuario;
import com.alura.foro.domain.usuario.Usuario;
import com.alura.foro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public void registrarUsuario(@RequestBody DatosRegistroUsuario datosRegistroUsuario){

        usuarioRepository.save(new Usuario(datosRegistroUsuario));
    }
}
