public class AgendaFactory {

    public static Agenda getAgenda(String type, String codPais, String direccion, String telefono){

        "Pais".equalsIgnoreCase(type);
        return new Pais(codPais, direccion, telefono);

    }
}
