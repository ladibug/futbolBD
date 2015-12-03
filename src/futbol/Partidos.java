/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

import java.sql.Date;

public class Partidos {
   String fecha;
   String id_local;
   int goles_L;
   String id_visita;
   int goles_V;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   
    public String getId_local() {
        return id_local;
    }

    public void setId_local(String id_local) {
        this.id_local = id_local;
    }

    public int getGoles_L() {
        return goles_L;
    }

    public void setGoles_L(int goles_L) {
        this.goles_L = goles_L;
    }

    public String getId_visita() {
        return id_visita;
    }

    public void setId_visita(String id_visita) {
        this.id_visita = id_visita;
    }

    public int getGoles_V() {
        return goles_V;
    }

    public void setGoles_V(int goles_V) {
        this.goles_V = goles_V;
    }
   
}
