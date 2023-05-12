public class Main {
    public static void main(String[] args) {

        Agenda pais = AgendaFactory.getAgenda("Pais","+52","Mexico","551111111");
        Agenda direccion = AgendaFactory.getAgenda("Direccion","+32","España","670000000");
        Agenda telefono = AgendaFactory.getAgenda("Direccion","+39","Italia","570000000");

        System.out.println("Factory Alta por Pais:"+pais);
        System.out.println("Factory Alta por Direccion:"+direccion);
        System.out.println("Factory Alta por Telefono:"+telefono);
    }
}