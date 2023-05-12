public abstract class Agenda {

    public abstract String getCodPais();
    public abstract String getDireccion();
    public abstract String getTelefono();

    @Override
    public String toString(){
        return "Clave Pais= "+this.getCodPais()+", Dirección="+this.getDireccion()+", Telefono="+this.getTelefono();
    }
}