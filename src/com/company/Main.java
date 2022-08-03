package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	funsaoSoma(2,2);
    funsaosubtrair(2,5);
    List<String> x = nomeDeAluno("lucas","Pedro");
    for (String s: x){
        System.out.println(s);
    }
    }
    public static List<String> nomeDeAluno(String s, String str){
        List<String> listString = new ArrayList<>();
        listString.add(s);
        listString.add(str);
        return listString;

    }
    public static void funsaosubtrair(double x, double y){
        double z = x -y;
    }
    public static void funsaoSoma(int x, int y){
        int z = x+y;
        System.out.println("a soma de " + x + " mais " +y+ " é igual a " +z);
    }
}
