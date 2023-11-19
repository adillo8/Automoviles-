package interfaz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import dominio.*;


public class Interfaz {
    public Interface(){
        ObjectInputStream obj;
        File f = new File("vehicles.txt");
        try{
            obj = new ObjectInputStream(new FileInputStream(file));
            try{Concesionario.vehicles = (ArrayList<Vehicle>)obj.readObject();}catch(Exception e){System.out.println(e);}
            obj.close();
            System.out.println("Leido.");
        }catch(Exception e){
            System.out.println("No leido.");
            Concesionario.vehicles = new ArrayList<Vehicle>();
        }
    }

    public void run(String input){
        String[] split = input.split(" ");
        if(split[0].equalsIgnoreCase("precio")){
           System.out.println(Concesionario.getVehicleTotal());
        }
        else if(split[0].equalsIgnoreCase("agregar")){
            if(split[1].equalsIgnoreCase("coche")){
                String brand = split[2];
                String model = split[3];
                int base = Integer.parseInt(split[4]);
                int seats = Integer.parseInt(split[5]);
                Car c = Concesionario.createCar(brand,model,base,seats);
                Concesionario.vehicles.add(c);
                System.out.println("Coche agregado");
            }
            if(split[1].equalsIgnoreCase("furgo")||split[1].equalsIgnoreCase("furgoneta")){
                String brand = split[2];
                String model = split[3];
                int base = Integer.parseInt(split[4]);
                int capacity = Integer.parseInt(split[5]);
                int seats = Integer.parseInt(split[6]);
                Van v = Concesionario.createVan(brand, model, base, capacity, seats);
                Concesionario.vehicles.add(v);
            }
        }
        else if(split[0].equalsIgnoreCase("mostrar")){
            System.out.println(Concesionario.getVehicles());
        }
    }


public void Save(){
    ObjectOutputStream obj;
            File file = new File("vehicles.txt");
            try{
                obj = new ObjectOutputStream(new FileOutputStream(file));
                obj.writeObject(Concesionario.vehicles);
                obj.close();
                System.out.println("Guardado.");
            }catch(Exception e){
                System.out.println("Error al guardar");
                System.out.println(e);
            }
    }
}
    
}

import dominio.Concesionario;