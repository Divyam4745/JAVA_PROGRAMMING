package com.company;
import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputnumber;
    public int noofGuess = 0;

    public int getNoofGuess() {
        return noofGuess;
    }

    public void setNoofGuess(int noofGuess) {
        this.noofGuess = noofGuess;
    }

    void game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

     void takeinput() {
        System.out.println("Guess the Number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

    boolean iscorrect() {
        noofGuess++;
        if (inputnumber == number) {
            System.out.format("Yes you Guess it Right,it was %d\n You guess it in %d attemps", number, noofGuess);
            return true;
        } else if (inputnumber < number) {
            System.out.println("Too low...");
        } else if (inputnumber > number) {
            System.out.println("Too high...");
        }
        return false;
    }
}
    public class CWH_50_exe3_solv {
        public static void main(String[] args) {
            Game g = new Game();
            g.game();
            boolean b = false;
            while (!b) {
                g.takeinput();
                b = g.iscorrect();
                System.out.println(b);
            }

        }
    }

