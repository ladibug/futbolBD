
package futbol;

import java.util.Date;
import java.util.Scanner;


public class Menu {
    Conexion con=new Conexion();
    Scanner in=new Scanner(System.in);
    public void mostarMenu(){
    System.out.println("1. ingresar equipo");
    System.out.println("2. ingresar partido");
    System.out.println("3. eliminar equipo");
    System.out.println("4. eliminar partido");
    System.out.println("5. actualizar equipo");
    System.out.println("6. actualizar partido");
    System.out.println("7. mostrar equipos");
    System.out.println("8. mostrar tabla de partidos");
    System.out.println("9. salir");
    System.out.println("SELECIONAR OPCION");
    }
    public void insertarEq(){
    Equipos e=new Equipos();
    System.out.println("Ingresar ID_equipo, no debe surerar los 2 caracteres");
    String id=in.nextLine();
    e.setId_equipo(id);
    System.out.println("ingrese nombre de equipo");
    String name=in.nextLine();
    e.setNombre(name);
    System.out.println("ingrese ciudad");
    String cd=in.nextLine();
    e.setCiudad(cd);
    con.ejecutarInDeUp("Insert into equipos(id_equipo,Nombre,Ciudad)"
            + " values('"+id+"','"+name+"','"+cd+"');");
   
    }
    public void insertarPd(){
    Partidos pd=new Partidos();
    System.out.println("ingresar fecha , DD/MM/AAAA");
    String fecha=in.nextLine();
    pd.setFecha(fecha);
    System.out.println("Ingresar ID equipo local");
    String idlocal=in.nextLine();
    pd.setId_local(idlocal);
    System.out.println("ingresar Goles equipo local");
    int gl=Integer.parseInt(in.nextLine());
    pd.setGoles_L(gl);
    System.out.println("ingresar ID equipo visita");
    String idvisita=in.nextLine();
    pd.setId_visita(idvisita);
    System.out.println("ingresar Goles equipo visita");
    int gv=Integer.parseInt(in.nextLine());
    pd.setGoles_V(gl);
    
    }
    public void mostrarEq(){
    con.ejecutarSe("select * from equipos;");
        try{
            while(con.getResultSet().next()){
            Equipos e=new Equipos();
            System.out.println("_________________________________________________________________________________");
            System.out.print("| Id: "+con.getResultSet().getString("id_equipo"));
            System.out.print("| Nombre: "+con.getResultSet().getString("nombre"));
            System.out.print("| Ciudad: "+con.getResultSet().getString("ciudad"));
            System.out.print("| Puntos: "+con.getResultSet().getString("puntos"));
            System.out.println("| Dif.Goles: "+con.getResultSet().getString("diferencia_goles")+"|");
            System.out.println("_________________________________________________________________________________");
            }
        }
        catch(Exception ex){
        System.out.println("ERROR"+ex.getMessage());
        }
    
            
    }
    public void eliminarEq(){
    Equipos e=new Equipos();
    System.out.println("ingrese ID a eliminar");
    String id=in.nextLine();
    con.ejecutarInDeUp("delete from equipos where id_equipo='"+id+"';");
   
    }
    public void actualizar(){
    Equipos e=new Equipos();
    System.out.println("ingrese ID a actualizar");
    String id=in.nextLine();
    System.out.println("ingrese nombre nuevo");
    String name=in.nextLine();
    e.setNombre(name);
    con.ejecutarInDeUp("update equipos set nombre='"+name+"' where id_equipo='"+id+"';");
    }
    
}
