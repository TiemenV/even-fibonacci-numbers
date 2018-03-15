package be.tiemenvermote.projecteuler002;

public class Main{
    public static void main(String[] args) {
        new Main().run();
    }
        private void run(){
            Calculator c = new Calculator(4000000);
            System.out.println(c);
        }
}