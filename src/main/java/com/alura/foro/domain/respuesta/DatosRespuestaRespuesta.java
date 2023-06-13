
package com.alura.foro.domain.respuesta;

import java.time.LocalDateTime;

public record DatosRespuestaRespuesta(
        Long id,
        String mensaje,
        LocalDateTime fechaCreacion,
        Boolean solucion,
        Long topico,
        Long autor) {

}
