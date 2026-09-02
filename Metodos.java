import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    public ObjSuper[] LlenarInventario(ObjSuper[]a){
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese el nombre del producto " + (i+1));
            String nombre = sc.nextLine();
            System.out.println("Ingrese el precio del producto " + (i+1));
            double precio = sc.nextDouble();
            System.out.println("Ingrese la cantidad disponible del producto " + (i+1));
            int cantDisp = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el estado del producto " + (i+1));
            String estado = sc.nextLine();
            ObjSuper o = new ObjSuper(nombre, precio, cantDisp, estado);
            a[i] = o;
        }
        return a;
    }

    public void MostrarInventario(ObjSuper[]a){
        for (int i = 0; i < a.length; i++) {
            System.out.println("Producto: " + a[i].getNombre());
            System.out.println("Precio: " + a[i].getPrecio());
            System.out.println("Cantidad Disponible: " + a[i].getCantDisp());
            System.out.println("Estado: " + a[i].getEstado());
        }
        System.out.println("-------------------------------------------------------------");
    }
    public void MostrarInforme(ObjSuper[]a){
        System.out.println("Cual es la cantidad disponible que necesita por producto");
        int cant = sc.nextInt();
            for (int i = 0; i < a.length; i++) {
                //int cantdisponible = a[i].getCantDisp();
                if (a[i].getCantDisp() >= cant) {
                    System.out.println("Producto: " + a[i].getNombre());
                    System.out.println("Precio: " + a[i].getPrecio());
                    System.out.println("Cantidad Disponible: " + a[i].getCantDisp());
                    System.out.println("Estado: " + a[i].getEstado());
                }
            }
            System.out.println("---------------------------------------------------------");
    }
}
