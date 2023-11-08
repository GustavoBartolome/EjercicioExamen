package gustavo.fullstack.examen.controllers;
import java.net.URI;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import gustavo.fullstack.examen.model.ArtworkDTO;
import gustavo.fullstack.examen.service.ArtworkService;


@RestController
@RequestMapping("/obras")
public class ArtworkRestController {
    ArtworkService ArtworkService1;
	private ArtworkService ArtworkService;

    public ArtworkRestController (ArtworkService servicio) {
        this.ArtworkService1=servicio;
    }
    @GetMapping
    public ResponseEntity<ArrayList<?>> VerObras(){
        ArrayList<ArtworkService> array = ArtworkService1.VerArtworkService();
        return ResponseEntity.ok(array);
    }
    @PostMapping
    public ResponseEntity<ArtworkDTO> CrearObra(@RequestBody @Validated ArtworkDTO ArtworkCreado){
    	ArtworkService1.createArtwork(ArtworkCreado);
        URI a = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(ArtworkCreado.getId()).toUri(); 
        return ResponseEntity.created(a).build();


    }

}