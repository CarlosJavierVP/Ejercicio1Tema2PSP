
public class Ejercicio1 extends Thread{
    char letters;

    public Ejercicio1(char letters) {
        this.letters = letters;
    }

    @Override
    public synchronized void run(){

        for (int i = 0; i<10; i++){
            char l = this.letters;
            System.out.println(l);
        }


    }

}
