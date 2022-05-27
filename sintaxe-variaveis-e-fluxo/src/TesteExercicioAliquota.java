public class TesteExercicioAliquota {
    public static void main(String[] args) {

        double salario = 4500.0;

        if(salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("O seu IR é de 7.5%, pode deduzir em sua declaração o valor de 142 reais.");
        } else if(salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("O seu IR é de 15%, pode deduzir em sua declaração o valor de 350 reais.");
        } else if(salario >= 3751.01 && salario <= 4664.0) {
            System.out.println("O seu IR é de 22.5%, pode deduzir em sua declaração o valor de 636 reais.");
        }
    }
}
