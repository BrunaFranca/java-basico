public class TestaSomatoria {
    public static void main(String[] args) {
        int contador = 0;
        int total = 0;
        while(contador <= 10) {
            //total = total + contador;
            total += contador;
            contador++;
        }
        System.out.println(total);
    }
}

// total = 0 + 1
//total = 1 + 2
//total = 3 + 3
//total = 6 + 4
//total = 10 + 5
//total = 15 + 6
//total = 21 + 7
//total = 28 + 8
//total = 36 + 9
//total = 45 + 10
//total = 55
