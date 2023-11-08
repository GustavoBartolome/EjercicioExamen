package gustavo.fullstack.examen.model;


import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArtworkDTO { 


	public ArtworkDTO(int i, int j, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	private Integer id; //Identificador para la obra de arte
	
	private String titulo;//Titulo para la obra de arte
	
	
	private String descripcion;//Describe la obra
	

	public Integer artistID;//Identificador del artista

	public Integer artistID() {
		// TODO Auto-generated method stub
		return null;
	}

	


	public void setReservado(boolean b) {
		// TODO Auto-generated method stub
		
	}




	public Map<String, ?> getId() {
		// TODO Auto-generated method stub
		return null;
	}
}


