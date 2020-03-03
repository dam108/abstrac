import java.util.*;

public class examen_tipo {
    public static Scanner teclado;
    public static ArrayList <Pacientes> lista;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        boolean salir = false; char opcion;
        
        lista = new ArrayList<>();
        do{
            System.out.println("\n\n---Consulta médico-----");
            System.out.println("a)Llega paciente");
            System.out.println("b)Llama paciente");
            System.out.println("c)Estadistica");
            System.out.println("d)Salir");
            opcion = teclado.next().charAt(0);
            switch (opcion) {
                case 'a': llegaPaciente(); break;
                case 'b': llamaPaciente(); break;
                case 'c': estadistica(); break;
                case 'd': salir = true; break;
                default: System.out.println("Opción");
            }
        }while(!salir);
    } // Fin main
    
    public static void llegaPaciente(){
        char opt;
        System.out.println("a)Consulta\nb)Recetas");
        opt = teclado.next().charAt(0);
        System.out.println("Introduce dni");
        teclado.nextLine();
        String dni = teclado.nextLine();
    
        if(opt == 'a'){
            System.out.println("Introduce Fecha de Nacimiento (YYYY-MM-dd)");
            String fecha = teclado.nextLine();
            
            lista.add(new Consulta(dni, fecha));
        }
        else if (opt == 'b'){
            System.out.println("Introduce Cantidad de recetas");
            int cantRec = teclado.nextInt();
            
            lista.add(new Recetas(dni, cantRec));
        }
        else System.out.println("Opcion no válida");
        
        System.out.println("Paciente Registrado");
    } 
    
    public static void llamaPaciente(){
        System.out.println("Doctor, introduce dni de paciente");
        teclado.nextLine();
        String dni=teclado.nextLine();
        boolean encontrado = false;
        int imp = 0;
        //no se permite recorrido con for, while, do/while, etc.
        System.out.println(dni);
        Pacientes a = new Consulta(dni, "1111-11-11");

        int pos = lista.indexOf(a);
        System.out.println(pos);
        
        if ( pos == -1) encontrado = false;
        else {
            imp = lista.get(pos).facturar();
            encontrado = true;
        }
            
        if(encontrado){
            System.out.println("Pase a consulta, A pagar"+ imp);
        }
        else
            System.out.println("dni erróneo");
    }
    
    public static void estadistica(){
        int cant=0;
        //calcularlo ahora a partir del arraylist, sin calculos
        // previos cada vez que se una llegada/llamada
        for (Pacientes pac : lista){
            if(pac instanceof Recetas){
                if( ((Recetas)pac).cantRecetas >= 4) cant++;
            }
        }

        System.out.println(cant+" pacientes esperando con 4 o más recetas");
    } 

} // Fin clase
