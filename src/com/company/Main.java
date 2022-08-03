package com.company;

public class Main {

    public static void main(String[] args) {
	funsaoSoma(2,2);
    funsaosubtrair(2,5);
    }
    public static void funsaosubtrair(double x, double y){
        double z = x -y;
    }
    public static void funsaoSoma(int x, int y){
        int z = x+y;
        System.out.println("a soma de" + x +"mais"+y+"é igual a"+z);
    }
}
