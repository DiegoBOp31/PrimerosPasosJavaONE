import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while(nota != -1){//Si se cumple esto el ciclo se rompe
            System.out.println("Escribe la nota que le darías a la película matrix");
            nota = teclado.nextDouble();
            if(nota != -1){
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }
        }

        System.out.println("La media de evaluaciones para matrix es: " + mediaEvaluaciones / totalEvaluaciones);




    }
}
