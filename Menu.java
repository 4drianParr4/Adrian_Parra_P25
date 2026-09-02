import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        boolean continuar = true;
        System.out.println("Cuantos productos desea registrar");
        int n = sc.nextInt();
        ObjSuper[]a = new ObjSuper[n];

        while (continuar) {
            System.out.println("Bienvenido Supermercado AA");
            System.out.println("1) Llenar Inventadrio");
            System.out.println("2) Mostrar Inventario");
            System.out.println("3) Mostrar Estado Del Producto");
            System.out.println("Salir");
            System.out.println();
            System.out.println("Ingrese la opcion que desea: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    a = m.LlenarInventario(a);
                    break;
                case 2:
                    m.MostrarInventario(a);
                    break;
                case 3:
                    m.MostrarInforme(a);
                    break;
                case 4:
                    System.out.println("Vuelva Pronto!!");
                    continuar = false;
                    break;
            
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }


        
    }
}
