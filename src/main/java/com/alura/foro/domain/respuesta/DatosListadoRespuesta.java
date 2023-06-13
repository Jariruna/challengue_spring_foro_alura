
package com.alura.foro.domain.respuesta;

public record DatosListadoRespuesta(
        Long id,
        String mensaje,
        String fechaCreacion,
        Boolean solucion) {

    public DatosListadoRespuesta(Respuesta respuesta) {
        this(respuesta.getRespuestaId(),
                respuesta.getMensaje(),
                respuesta.getFechaCreacion().toString(),
                respuesta.getSolucion()
        );
    }

}
