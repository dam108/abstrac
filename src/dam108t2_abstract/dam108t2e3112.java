/*
Se desea hacer la gestión de las habitaciones de un hotel. Todas las habitaciones tienen un
número de habitación y un proceso de check-in y check-out.. En el hotel hay estas habitaciones:
1) 3 habitaciones Lowcost (cuesta 50 euros todo el año).
2) 10 habitaciones dobles. Tienen una tarifa normal de 100 euros y un incremento del 20% si el día
de salida es abril, julio o agosto.
3) 5 habitaciones Suite. Tienen la misma tarifa todo el año, 150 euros por persona, es decir, a la hora
de facturar, no es lo mismo si hay un huésped o tres en la habitación.
• El programa inicialmente meterá las 18 habitaciones en un ArrayList y las marcará como “no
ocupadas”.
• El programa tendrá un menú para hacer check-in entre las habitaciones libres, check-out entre las
ocupadas y listar habitaciones libres y ocupadas
*/
package dam108t2_abstract;
import java.util.*;

public class dam108t2e3112 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Hotel arrHotel = new Hotel();
        int n = 0; 
        do{
            System.out.println("1. Para Entrar al Hotel.\n2. Para Salir del Hotel.\n3. Para ver Lista de habitaciones disponibles.\n0. Para salir del programa.\n");
            n = teclado.nextInt();
            
            switch(n){
                case 1: 
                    boolean check;
                    int opt;
                    boolean bandera = false;
                    System.out.print("1. Para habitacion LowCost\n2. Para habitacion doble.\n3. Para Suite.\n0. Para Salir\n");
                    opt = teclado.nextInt();
                    switch(opt){
                        case 1: 
                            for (int i = 0; i < arrHotel.habitaciones.size(); i++) {
                                if( arrHotel.habitaciones.get(i) instanceof Lowcost ){
                                    if(arrHotel.habitaciones.get(i).estaOcupada() == false &&
                                            ((Lowcost)arrHotel.habitaciones.get(i)).lowcost == true ){
                                       check = arrHotel.habitaciones.get(i).chekIn();
                                        if(check){
                                            System.out.println("Se ha asignado la habitacion numero "+(i+1)+" de tipo lowcost");
                                            bandera = true;
                                            break;
                                        }
                                        else System.out.println("No se ha podido ocupar la habitación");
                                        break;
                                    }
                                }
                            }
                            if(bandera) bandera = false;
                            else System.out.println("No hay habitaciones Lowcost libres");
                            break;
                        case 2:
                            for (int i = 0; i < arrHotel.habitaciones.size(); i++) {
                                if( arrHotel.habitaciones.get(i) instanceof Hdoble ){
                                    if(arrHotel.habitaciones.get(i).estaOcupada() == false &&
                                            ((Hdoble)arrHotel.habitaciones.get(i)).Hdoble == true ){
                                        check = arrHotel.habitaciones.get(i).chekIn();
                                        if(check){
                                            System.out.println("Se ha asignado la habitacion numero "+(i+1)+" de tipo doble");
                                            bandera = true;
                                            break;
                                        }
                                        else System.out.println("No se ha podido ocupar la habitación");
                                        break;
                                    }
                                }
                            }
                            if(bandera) bandera = false;
                            else System.out.println("No hay habitaciones dobles libres");
                            break;
                        case 3:
                            int h;
                            System.out.println("Cuantas personas se van alojar en la Suite?");
                            h = teclado.nextInt();
                            for (int i = 0; i < arrHotel.habitaciones.size(); i++) {
                                if( arrHotel.habitaciones.get(i) instanceof Suite ){
                                    if(arrHotel.habitaciones.get(i).estaOcupada() == false &&
                                            ((Suite)arrHotel.habitaciones.get(i)).suite == true ){
                                        check = arrHotel.habitaciones.get(i).chekIn();
                                        if(check){
                                            ((Suite)arrHotel.habitaciones.get(i)).huespedes = h;
                                            ((Suite)arrHotel.habitaciones.get(i)).actualizarCoste();
                                            System.out.println("Se ha asignado la habitacion numero "+(i+1)+" de tipo Suite");
                                            bandera = true;
                                            break;
                                        }
                                        else System.out.println("No se ha podido ocupar la habitación");
                                        break;
                                    }
                                }
                            }
                            if(bandera) bandera = false;
                            else System.out.println("No hay habitaciones Suite libres");
                            break;
                        default: 
                            System.out.println("Has introducido un numero que no tiene nada asignado, salimos al menu anterior");
                            break;
                    }
                    break;
                case 2:
                    int hab;
                    double precio;
                    System.out.println("Que habitación quieren liberar?");
                    hab = teclado.nextInt();
                    if (arrHotel.habitaciones.get(hab-1).ocupada == true){
                        precio = Hab_Hotel.checkOut(arrHotel.habitaciones.get(hab - 1));
                        if (precio > 0) System.out.println("El importe a pagar es de "+precio+" euros.");
                        else System.out.println("no hay importe a pagar");
                        System.out.println("Se ha liberado la habitacion numero " +(hab)+".");
                    }
                    else System.out.println("Esta habitacion no se puede liberar por que no esta ocupada");
                    break;
                case 3:
                    for (int i = 0; i < arrHotel.habitaciones.size(); i++) {
                        if( arrHotel.habitaciones.get(i) instanceof Lowcost ){
                            if(arrHotel.habitaciones.get(i).estaOcupada() == false) System.out.println("La habitacion "+(i+1)+"esta vacia y es de tipo Lowcost");
                            else System.out.println("La habitacion "+(i+1)+"esta ocupada y es de tipo Lowcost");
                        }
                        if( arrHotel.habitaciones.get(i) instanceof Hdoble ){
                            if(arrHotel.habitaciones.get(i).estaOcupada() == false) System.out.println("La habitacion "+(i+1)+"esta vacia y es de tipo doble");
                            else System.out.println("La habitacion "+(i+1)+"esta ocupada y es de tipo doble");
                        }
                        if( arrHotel.habitaciones.get(i) instanceof Suite ){
                            if(arrHotel.habitaciones.get(i).estaOcupada() == false) System.out.println("La habitacion "+(i+1)+"esta vacia y es de tipo Suite");
                            else System.out.println("La habitacion "+(i+1)+"esta ocupada y es de tipo Suite");
                        }
                    }
                    break;

                    default: System.out.println("No has introducido un numero valido");break;
                       
            }
            
            




        }while(n != 0);
        //menu para hacer checkin- check-out, listar habitaciones libre y ocupdas

    } // Fin main
    
    
    
}