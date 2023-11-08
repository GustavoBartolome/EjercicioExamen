package gustavo.fullstack.examen.service;

import java.util.ArrayList;

import gustavo.fullstack.examen.model.ArtistDTO;
import gustavo.fullstack.examen.model.ArtworkDTO;

public interface ArtistService {
		ArrayList<ArtworkDTO> getAllArtwok();
		void createArtwork(ArtworkDTO a);

	ArtistService getArtworkById(Integer id);
	ArtistDTO getArtistbyid(Integer id);
}



