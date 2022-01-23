import java.util.Scanner;
public class ModuloDeNumero {

    public static void main(String[]ar){
    Scanner teclado = new Scanner(System.in);
    int num1,num2,modu;
    System.out.print("Ingrese primer número: ");
    num1 = teclado.nextInt();
    System.out.print("Ingrese segundo número: ");
    num2 = teclado.nextInt();
    modu = num1 % num2;
    if (modu == 0)
    {
        System.out.print("El número " +num1+" SI es divisible con el número "+num2+".");
    }else{
        System.out.print("El número " +num1+" NO es divisible con el número "+num2+"."); 
    }
    }
}