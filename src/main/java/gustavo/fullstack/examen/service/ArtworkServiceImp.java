package gustavo.fullstack.examen.service;
import java.util.ArrayList;

import org.springframework.stereotype.Service;



import gustavo.fullstack.examen.exceptions.*;
import gustavo.fullstack.examen.model.ArtistDTO;
import gustavo.fullstack.examen.model.ArtworkDTO;
import gustavo.fullstack.examen.service.ArtistServiceImp;
public class ArtworkServiceImp implements ArtworkService {
	
	ArrayList<ArtworkDTO> obras = new ArrayList<>();

	ArtworkDTO ar = new ArtworkDTO(1, 1, "hola soy la descripción uno", "Titulo1");
	ArtworkDTO ar2 = new ArtworkDTO(2, 2, "hola soy la descripción dos", "Titulo2");
	ArtworkDTO ar3 = new ArtworkDTO(3, 1, "hola soy la descripción tres", "Titulo3");
	ArtworkDTO ar4 = new ArtworkDTO(4,3, "hola soy la descripción cuatro","Titulo4");


	public void ArtworkServiceImpl() {

	obras.add(ar);

	obras.add(ar2);

	obras.add(ar3);

	obras.add(ar4);

	}
	
	public ArrayList<ArtworkDTO> getAllArtworks() {
		return obras;
	}

	

	@Override
	public void createArtwork(ArtworkDTO artwork) {
		ArtistServiceImp ar=new ArtistServiceImp(); 
		ArtistDTO a;
         a = ar.getArtistbyid(artwork.artistID());
         if(artwork.artistID() == a.getId()) {
        	 obras.add(artwork);
         }
         else {
        	 throw new ArtworkCreationException("el artista no esta comprendido entre la élite");


         }
		
	}

	@Override
	public ArrayList<ArtworkService> VerArtworkService() {
		// TODO Auto-generated method stub
		return null;
	}


	

}