package gustavo.fullstack.examen.exceptions.handlers;

import java.net.URI;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import gustavo.fullstack.examen.exceptions.*;

@RestControllerAdvice
public class GlobalExcepcionHandler {

    @ExceptionHandler( ArtworkCreationException.class )
    public ProblemDetail HandleCreacionArtworkException(ArtworkCreationException e) {

        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
        problemDetail.setTitle("Artwork Exception Occurred");
        problemDetail.setType(URI.create("http://cesurformacion.com"));
        problemDetail.setProperty("errorCategory", "Artwork");
        problemDetail.setProperty("timeStamp", Instant.now());

        return problemDetail;
    }

}