package gustavo.fullstack.examen.service;


import java.util.ArrayList;
import gustavo.fullstack.examen.model.ArtworkDTO;

public interface ArtworkService {
	ArrayList<ArtworkDTO> getAllArtworks();
	void createArtwork(ArtworkDTO artworkDTO);
	ArrayList<ArtworkService> VerArtworkService();
}


