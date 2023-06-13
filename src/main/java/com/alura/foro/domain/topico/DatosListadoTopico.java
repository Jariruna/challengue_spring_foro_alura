
package com.alura.foro.domain.topico;

public record DatosListadoTopico(Long id, String titulo, String mensaje, String fechaCreacion) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getTopicoId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion().toString());
    }

}
