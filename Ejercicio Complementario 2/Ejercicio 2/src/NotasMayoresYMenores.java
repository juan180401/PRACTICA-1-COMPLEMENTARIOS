import java.util.Scanner;

public class NotasMayoresYMenores {
    public static void main(String[]ar){
    Scanner teclado = new Scanner(System.in);
    int numnotas, nota, mayo, meno;
    mayo=0;
    meno=0;
    for (numnotas=1;numnotas<=10;numnotas++){
    System.out.print("Ingrese nota: ");
    nota = teclado.nextInt();
    if(nota>=7){
        mayo=mayo+1;
    }else{
        meno=meno+1;
    }
    }
    System.out.print("Cantidad de notas menores a 7: "+meno+" Notas. Cantida de notas mayores o iguales a 7: "+mayo+" Notas.");
}
}