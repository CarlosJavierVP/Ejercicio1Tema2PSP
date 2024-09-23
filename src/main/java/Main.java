public class Main {
    public static void main(String[] args) {
        Ejercicio1 hebra1 = new Ejercicio1('A');
        Ejercicio1 hebra2 = new Ejercicio1('B');
        Ejercicio1 hebra3 = new Ejercicio1('C');

        hebra1.start();
        hebra2.start();
        hebra3.start();

        /*
        * En la primera ejecución de programa comenzaron mezclados al menos una letra del B con otra del C
        * En las siguientes ejecuciones de programa han aparecido agrupadas las iteraciones por el mismo hilo, aunque ha ido
        * alternando el orden, es decir, (BBB,CCC,AAA)
        * Al modificar código y meter más iteraciones (10) transcurre de forma similar, con la salvedad que algunas iteraciones
        * se muestran al final.
        * Entiendo que esto ocurre por la falta de sincronización y los hilos interfieren entre ellos,
        * para solucionarlo tendríamos que utilizar synchronized junto con los métodos wait() y notify()
        * y a su vez mejorar el código para imprimir los valores que queremos y que los hilos estén sincronizados
        *
        */

    }
}
