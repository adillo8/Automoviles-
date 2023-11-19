package presentacion;
import user_interface.*;
import java.util.Scanner;

public class Aplicacion {
    static Scanner sc = new Scanner(System.in);
    static Interface i = new Interface();
    public static void main(String[] args) {
        String input = getInput();
        if(input.split(" ")[0].equalsIgnoreCase("salir")){
            i.Save();
        }
        else{
            i.run(input);
            main(args);
        }
    }
    public static String getInput(){
        String input = null;
        System.out.println("Que quieres hacer");
        input = sc.nextLine();
        return input;
    }
}