package dominio;
import java.util.ArrayList;

public class Concesionario {
    public static ArrayList<Vehicle> coches = new ArrayList<>();
    public static String getVehicleTotal(){
        double total = 0;
        for(Vehicle c: coches){
            total += v.getPrice();
        }
        String x = "El precio total de todos los vehiculos es "+total+ " €.";
        return x;
    }
    public static String getVehicles(){
        String s = "Vehiculos: ";
        for(Vehicle c : coche){
            if(vehicles.indexOf(v) == (vehicles.size()-2)){
                s += v.toString();
                s += " y ";
            }
            else if(vehicles.indexOf(v) == (vehicles.size()-1)){
                s+= v.toString();
            }   

            else{
                s += v.toString();
                s += ", ";
            }

        }
        return s;
    }

}

     
