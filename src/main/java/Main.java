public class Main {
    public static void main(String[] args) {
        Ejercicio1 hebra1 = new Ejercicio1('A');
        Ejercicio1 hebra2 = new Ejercicio1('B');
        Ejercicio1 hebra3 = new Ejercicio1('C');

        hebra1.start();
        hebra2.start();
        hebra3.start();


    }
}
