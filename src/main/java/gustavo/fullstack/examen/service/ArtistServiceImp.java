package gustavo.fullstack.examen.service;

import java.util.ArrayList;


import org.springframework.stereotype.Service;

import gustavo.fullstack.examen.model.ArtistDTO;
import gustavo.fullstack.examen.model.ArtworkDTO;

@Service
public class ArtistServiceImp implements ArtistService  {
    ArrayList<ArtistDTO> Artistas = new ArrayList<>();

    ArtistDTO art1 = new ArtistDTO(1, "Manuel Cruz");

    ArtistDTO art2 = new ArtistDTO(2, "Antonio López");

    ArtistDTO art3 = new ArtistDTO(3, "Soroya");

    ArtistDTO art4 = new ArtistDTO (4, "Monet");

    public ArtistServiceImp(){
    	Artistas.add(art1);

    	Artistas.add(art2);

    	Artistas.add(art3);

    	Artistas.add(art4);

    }
@Override
    public ArtistDTO getArtistbyid(Integer id) {
        for (ArtistDTO art : Artistas ) {
        	if(art.getId()==id) {
            return art;
        }
        }
        return null;
}
@Override
public ArrayList<ArtworkDTO> getAllArtwok() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void createArtwork(ArtworkDTO a) {
	// TODO Auto-generated method stub
	
}
@Override
public ArtistService getArtworkById(Integer id) {
	// TODO Auto-generated method stub
	return null;
}
}
