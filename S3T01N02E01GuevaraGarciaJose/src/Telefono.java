public class Telefono extends Agenda {

    private String codPais;
    private String direccion;
    private String telefono;

    public Telefono(String codPais, String direccion, String telefono){
        this.codPais=codPais;
        this.direccion=direccion;
        this.telefono=telefono;
    }
    @Override
    public String getCodPais() {
        return this.codPais;
    }

    @Override
    public String getDireccion() {
        return this.direccion;
    }

    @Override
    public String getTelefono() {
        return this.telefono;
    }

}
