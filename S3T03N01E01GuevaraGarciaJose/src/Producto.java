public class Producto {

    protected String tipoProducto;
    protected String colorPlanta;

    protected String material;
    protected int tamañoPlanta;

    protected int precio;
    protected int stock;

    public Producto(String tipoProducto, String colorPlanta, String material, int tamañoPlanta, int precio, int stock) {
        this.tipoProducto = tipoProducto;
        this.colorPlanta = colorPlanta;
        this.material = material;
        this.tamañoPlanta = tamañoPlanta;
        this.precio = precio;
        this.stock = stock;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getColorPlanta() {
        return colorPlanta;
    }

    public void setColorPlanta(String colorPlanta) {
        this.colorPlanta = colorPlanta;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTamañoPlanta() {
        return tamañoPlanta;
    }

    public void setTamañoPlanta(int tamañoPlanta) {
        this.tamañoPlanta = tamañoPlanta;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getSubtotal() {
        return stock * precio;
    }
}