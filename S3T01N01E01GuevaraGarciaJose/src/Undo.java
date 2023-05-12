import java.util.ArrayList;
import java.util.Scanner;

public class Undo {
    private static Undo instance;

    private Undo(){}

    public static Undo getInstance(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Comanda");

        System.out.println("Para añadir comandas introduce: ADD, para borrar UNDO, END salir:");
        Scanner leer = new Scanner(System.in);
        String comanda = "";

        do {
            comanda = leer.next();
            //System.out.println("Para añadir comandas ADD + Datos comanda, para borrar DEL + Datos comanda ");
            if (comanda.equals("ADD"))
                list.add("Comanda");
            else if (comanda.equals("UNDO"))
                if (!list.isEmpty())
                    list.remove(list.size()-1);
                else
                    System.out.println("La lista está vacía. No puedes borrar más elementos.");

            //System.out.println("Hay " + list.size() + " elementos en la lista");
            System.out.println("Lista " + list);
        } while(!comanda.equals("END"));

        if(instance == null) {
            instance = new Undo();
        }
        return instance;
    }
}
