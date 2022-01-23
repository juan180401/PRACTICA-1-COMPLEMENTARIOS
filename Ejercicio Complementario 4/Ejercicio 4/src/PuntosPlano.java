import java.util.Scanner;
public class PuntosPlano {
    public static void main(String[] args) throws Exception {
        Scanner teclado= new Scanner(System.in);
        int cont,cantpun,x,y,cuad1,cuad2,cuad3,cuad4;
        cuad1=0;
        cuad2=0;
        cuad3=0;
        cuad4=0;
        System.out.print("Ingrese la cantidad de puntos a evaluar: ");
        cantpun=teclado.nextInt();
        for (cont=1;cont<=cantpun;cont++){
        System.out.print("Ingrese la coordenada en X: ");
        x=teclado.nextInt();
        System.out.print("Ingrese la coordenada en Y: ");
        y=teclado.nextInt();
        if(x>0 && y>0){
            cuad1=cuad1+1;
        }else if (x<0 && y>0){
            cuad2=cuad2+1;
        }else if (x<0 && y<0){
            cuad3=cuad3+1;
        }else if (x>0 && y<0){
            cuad4=cuad4+1;
        }
        }
        System.out.println("La cantidad de puntos en el cuadrante 1 es: "+cuad1+".");
        System.out.println("La cantidad de puntos en el cuadrante 2 es: "+cuad2+".");
        System.out.println("La cantidad de puntos en el cuadrante 3 es: "+cuad3+".");
        System.out.println("La cantidad de puntos en el cuadrante 4 es: "+cuad4+".");
    }
}
