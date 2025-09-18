package com.company;

import java.util.Random;
import java.util.Scanner;

public class CWH_41_Game {
    public static void main(String[] args) {
        //0  Rock
        //1  paper
        //2 Seassr
        Scanner sc = new Scanner(System.in);
        System.out.println("Entere 0 for Rock,1 for paper,2 for Seassr");
        int userinput= sc.nextInt();

        Random random =new Random();
        int computerinput = random.nextInt(4);
        if (userinput==computerinput){
            System.out.println("Dwaw");
        } else if (userinput == 0 && computerinput == 2 || userinput==1 && computerinput == 0 || userinput == 2 && computerinput == 1) {
            System.out.println("You Win");
        }else{
            System.out.println("Computer win");
        }

    }
}
