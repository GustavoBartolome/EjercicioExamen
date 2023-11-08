package gustavo.fullstack.examen.model;

public class ArtistDTO {
    Integer id;
    String Nombre;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public ArtistDTO(Integer id, String nombre) {
        super();
        this.id = id;
        Nombre = nombre;
    }
    public ArtistDTO() {
        super();
    }

}