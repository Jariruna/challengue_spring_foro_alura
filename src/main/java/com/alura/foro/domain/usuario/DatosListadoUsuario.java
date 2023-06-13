
package com.alura.foro.domain.usuario;

public record DatosListadoUsuario(Long id, String nombre, String email) {

    public DatosListadoUsuario(Usuario usuario) {
        this(usuario.getUsuarioId(), usuario.getNombre(), usuario.getEmail());
    }

}
