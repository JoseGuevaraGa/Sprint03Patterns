import java.util.ArrayList;
import java.util.Scanner;

public class Floristeria {

    static Scanner captura = new Scanner(System.in);
    public static void main(String[] args) {

        boolean sortir = false;
        int posicion = 0;

        ArrayList<Establecimiento> establecimientos = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Venta> ventas = new ArrayList<>();

        Establecimiento floristeria1 = new Establecimiento("Floristeria Rosa", 3000, 10);
        establecimientos.add(floristeria1);

        Establecimiento floristeria2 = new Establecimiento("Floristeria Petalo Feliz", 4000, 20);
        establecimientos.add(floristeria2);

        Establecimiento floristeria3 = new Establecimiento("Floristeria El detalle", 2000, 20);
        establecimientos.add(floristeria3);


        Producto arbol = new Producto("Arbol", "Verde", "Natural", 1, 10,1);
        productos.add(arbol);

        Producto flor = new Producto("Flor", "Rosa Roja", "Natural", 1, 5,10);
        productos.add(flor);

        Producto decoracion = new Producto("Decoracion", "Cesped Verde", "Plastico", 2, 8,15);
        productos.add(decoracion);

        Venta venta1 = new Venta(1,"Flor", "Rojo","Natural",2,5,10);
        ventas.add(venta1);

        do{
            switch(menu()){

                case 1:
                    posicion = buscarFloristeria(establecimientos);
                    crearFloristeria(establecimientos, posicion);
                    break;
                case 2:
                    bajaFloristeria(establecimientos);
                    break;
                case 3:
                    posicion = buscarProducto(productos);
                    crearProducto(productos, posicion);
                    break;
                case 4:
                    bajaProducto(productos);
                    break;
                case 5:
                    posicion = buscarProducto(productos);
                    crearProducto(productos, posicion);
                    break;
                case 6:
                    bajaProducto(productos);
                    break;
                case 7:
                    posicion = buscarProducto(productos);
                    crearProducto(productos, posicion);
                    break;
                case 8:
                    bajaProducto(productos);
                    break;
                case 9:
                    verProductos(productos);
                    break;
                case 10:
                    verStock(productos);
                    break;
                case 11:
                    posicion = buscarFloristeria(establecimientos);
                    verTienda(establecimientos, posicion);
                    break;
                case 12:
                    crearVenta(ventas);
                    break;
                case 13:
                    mostrarTicket(ventas);
                    break;
                case 0: System.out.println("Gràcies per utilitzar l'aplicació");
                    sortir = true;
                    break;
            }
        }while(!sortir);
    }

    public static byte menu(){
        Scanner entrada = new Scanner(System.in);
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 13;

        do{
            System.out.println("\nMENú PRINCIPAL");
            System.out.println("1. Crear Floristeria.");
            System.out.println("2. Eliminar Floristeria.");
            System.out.println("3. Agregar Arbol.");
            System.out.println("4. Quitar Arbol.");
            System.out.println("5. Agregar Flor.");
            System.out.println("6. Quitar Flor.");
            System.out.println("7. Agregar Decoración.");
            System.out.println("8. Quitar Decoración.");
            System.out.println("9. Buscar Producto.");
            System.out.println("10. Ver Stock.");
            System.out.println("11. Valor total Floristeria.");
            System.out.println("12. Venta.");
            System.out.println("13. Ticket.");
            System.out.println("0. Salir de la aplicación.\n");
            opcio = entrada.nextByte();
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }

    public static void crearFloristeria(ArrayList<Establecimiento> establecimientos, int posicion)  {
        String nombreFlor = " ";

        int valorStock, totalProductos;

        System.out.println("Posicion:" + posicion );

        if (posicion < 0){

            System.out.println("Introduce el nombre de la nueva Floristeria: " );
            nombreFlor = captura.nextLine();

            System.out.println("Introduce el valor del Stock:");
            valorStock = captura.nextInt();

            System.out.println("Introduce el total de Productos:");
            totalProductos = captura.nextInt();

            Establecimiento florx = new Establecimiento(nombreFlor, valorStock, totalProductos);
            establecimientos.add(florx);

            System.out.println("Floristeria : " + establecimientos.get(0).getNombreEstablecimiento() );

        }

        System.out.println("Floristeria dada de Alta." + nombreFlor);


    }

    public static void bajaFloristeria(ArrayList<Establecimiento> establecimientos)  {
        String nombreFloristeria = "";
        int posicion = 0;

        posicion = buscarFloristeria(establecimientos);

        if (posicion < 0){
            System.out.println("Floristeria no existe." + nombreFloristeria);

        }else{
            establecimientos.remove(posicion);
            System.out.println("Floristeria eliminada." + nombreFloristeria);
        }

    }

    public static void crearProducto(ArrayList<Producto> productos, int posicion)  {
        String nombreProducto = " ", color = " ", material = " ";

        int tamaño, precio, stock;

        System.out.println("Posicion:" + posicion );

        if (posicion < 0){

            System.out.println("Introduce el nombre del nuevo producto: " );
            nombreProducto = captura.nextLine();

            System.out.println("Introduce el color del nuevo producto: " );
            color= captura.nextLine();

            System.out.println("Introduce el material del nuevo producto: " );
            material= captura.nextLine();

            System.out.println("Introduce el tamaño del producto:");
            tamaño = captura.nextInt();

            System.out.println("Introduce el precio Producto:");
            precio = captura.nextInt();

            System.out.println("Introduce la cantidad del producto:");
            stock = captura.nextInt();


            Producto productox = new Producto(nombreProducto, color, material, tamaño,precio ,stock);
            productos.add(productox);

            System.out.println("Producto : " + productos.get(0).getTipoProducto() );

        }

        System.out.println("Producto dado de Alta." + nombreProducto);


    }

    public static void bajaProducto(ArrayList<Producto> productos)  {
        String nombreProducto = "";
        int posicion = 0;

        posicion = buscarProducto(productos);

        if (posicion < 0){
            System.out.println("Producto no existe." + nombreProducto);

        }else{
            productos.remove(posicion);
            System.out.println("Producto eliminado." + nombreProducto);
        }

    }

    public static int buscarFloristeria (ArrayList<Establecimiento> establecimientos)  {
        boolean existe = false;
        String nombreEstablecimiento;

        int posic = -1, i = 0;

        System.out.println("Introduce el nombre del Establecimiento a buscar: " );
        nombreEstablecimiento = captura.nextLine();

        while ( !existe && i < establecimientos.size()){

            if (nombreEstablecimiento.equalsIgnoreCase(establecimientos.get(i).getNombreEstablecimiento())) {
                posic = i;
                existe = true;
                //        System.out.println("Entra :" );
            }
            i++;
        }
        return posic;
    }

    public static int buscarProducto (ArrayList<Producto> productos)  {
        boolean existe = false;
        String nombreProducto;

        int posic = -1, i = 0;

        System.out.println("Introduce el nombre del producto a buscar: " );
        nombreProducto = captura.nextLine();

        while ( !existe && i < productos.size()){

            if (nombreProducto.equalsIgnoreCase(productos.get(i).getTipoProducto())) {
                posic = i;
                existe = true;
                //        System.out.println("Entra :" );
            }
            i++;
        }
        return posic;
    }


    public static void verProductos(ArrayList<Producto> productos)  {
        String tipoProducto = "";
        int posicion = 0;

        posicion = buscarProducto(productos);

        if (posicion < 0){
            System.out.println("Producto no existe." + tipoProducto);

        }else{
            System.out.println("Tipo Producto: " + productos.get(posicion).getTipoProducto());
            System.out.println("Color: " + productos.get(posicion).getColorPlanta());
            System.out.println("Material: " + productos.get(posicion).getMaterial());
            System.out.println("Tamaño: " + productos.get(posicion).getTamañoPlanta());
            System.out.println("Precio: " + productos.get(posicion).getPrecio());
            System.out.println("Stock: " + productos.get(posicion).getStock());
        }

    }

    public static void verStock(ArrayList<Producto> productos)  {
        String tipoProducto = "";
        int posicion = 0;
        System.out.println("Para cononocer el Stock te pedira el nombre del producto.");
        posicion = buscarProducto(productos);

        if (posicion < 0){
            System.out.println("Producto no existe." + tipoProducto);

        }else{
            System.out.println("Tipo Producto: " + productos.get(posicion).getTipoProducto());
            System.out.println("Stock: " + productos.get(posicion).getStock());
        }
        tipoProducto = "";

        posicion = 0;

        posicion = buscarProducto(productos);

        if (posicion < 0){
            System.out.println("Producto no existe." + tipoProducto);

        }else{
            System.out.println("Tipo Producto: " + productos.get(posicion).getTipoProducto());
            System.out.println("Stock: " + productos.get(posicion).getStock());
        }

        tipoProducto = "";
        posicion = 0;

        posicion = buscarProducto(productos);

        if (posicion < 0){
            System.out.println("Producto no existe." + tipoProducto);

        }else{
            System.out.println("Tipo Producto: " + productos.get(posicion).getTipoProducto());
            System.out.println("Stock: " + productos.get(posicion).getStock());
        }

    }

    public static void verTienda (ArrayList<Establecimiento> floristerias, int posicion)  {

        if (posicion != -1){
            System.out.println("El nombre del establecimiento es: " + floristerias.get(posicion).getNombreEstablecimiento());
            System.out.println("El valor Stock: " + floristerias.get(posicion).getValorStock());
            System.out.println("El total productos: " + floristerias.get(posicion).getTotalProductos());
        }else{
            System.out.println("La floristeria buscada no se encuentra: " );
        }

    }

    public static void crearVenta(ArrayList<Venta> ventas)  {


        String tipoProd = " ", colorP, materialP;

        int numVenta=1, posicion=-1,tamañoP=0, precioP=0, stockP=0;

        numVenta ++;
        System.out.println("Posicion:" + posicion );

        if (posicion < 0){

            System.out.println("Introduce el producto a vender: " );
            tipoProd = captura.nextLine();

            System.out.println("Introduce el color producto: " );
            colorP= captura.nextLine();

            System.out.println("Introduce el material del producto: " );
            materialP= captura.nextLine();

            System.out.println("Introduce el tamaño del producto:");
            tamañoP = captura.nextInt();

            System.out.println("Introduce el precio Producto:");
            precioP = captura.nextInt();

            System.out.println("Introduce la cantidad del producto:");
            stockP = captura.nextInt();

            Venta ventax = new Venta(numVenta,tipoProd, colorP,materialP,tamañoP,precioP,stockP);
            ventas.add(ventax);

            System.out.println("Producto Vendido : " + ventas.get(0).getTipoProducto() );

        }
    }

    public static void mostrarTicket(ArrayList<Venta> ventas) {
        System.out.println("-".repeat(85));
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n", "Tipo Producto", "Precio", "Cantidad", "Subtotal");
        System.out.println("-".repeat(85));
        double total = 0;
        for (Venta p : ventas) {
            System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n", p.getTipoProducto(), p.getPrecio(), p.getStock(),p.getSubtotal());
            total += p.getSubtotal();
        }
        System.out.println("-".repeat(85));
        System.out.printf("|%83s|\n", "Total: " + String.valueOf(total));
        System.out.println("                            **Gracias por su compra**");
    }
}