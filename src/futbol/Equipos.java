
package futbol;


public class Equipos {
    String id_equipo;
    String nombre;
    String ciudad;
    int puntos;
    int dif_gol;

    public String getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(String id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getDif_gol() {
        return dif_gol;
    }

    public void setDif_gol(int dif_gol) {
        this.dif_gol = dif_gol;
    }
    
}
