import java.util.Scanner;
public class ValoresParesEImpares {
    public static void main(String[] args) {
  Scanner teclado=new Scanner(System.in);
        int val,num, modu, par,impar;
  par=0;
  impar=0;
  do {
  System.out.print("Ingrese cualquier número para continuar o ingrese 0 para finalizar programa): ");
  val = teclado.nextInt();
  if(val!=0){
    System.out.print("Ingrese un número: ");
    num = teclado.nextInt();
    modu=num%2;
    if (modu==0){
        par=par+1;
    } else {
        impar=impar+1;
    }
  }
  }  while (val!=0);
  System.out.println("La cantidad de numeros pares es: "+par+". y la de impares es: "+impar+"."); 
  System.out.print(" Gracias por utilizar el programa");
     }
}
