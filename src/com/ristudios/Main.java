package com.ristudios;


import com.ristudios.objectoriented.*;
import com.ristudios.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        System.out.println("Reischer weg");
    }

    //region ADP WS2122 Altklausur https://elearning.uni-regensburg.de/pluginfile.php/2332747/mod_folder/content/0/ADP-WS2122.pdf?forcedownload=1

    //Teilaufgaben liegen in den packages objectoriented und tree

    //2.1
    public static int[] add(int[] a, int[] b){
        int[] c = new int[a.length+b.length];

        //double for approach

        //CODE
        // for (int i = 0; i < a.length; i++){
        //      c[i] = a[i];
        //  }
        //  for (int i = 0; i < b.length; i++){
        //      c[i+a.length] = b[i];
        //  }

        //for plus if-else approach

        for (int i = 0; i < c.length; i++){

            //CODE
            // if (i < a.length){
            //      c[i] = a[i];
            //  } else{
            //      c[i] = b[i - a.length];
            //  }

            //for plus ?-operator approach

            int z = (i < a.length) ? (c[i] = a[i]) : (c[i] = b[i - a.length]);

        }
        return c;
    }

    //2.2
    public static int[] mul(int[] ints, int i){
        int j = 1;
        int[] ints1 = ints;
        while (j < i){
            ints1 = add(ints1, ints);
            j++;
        }
        return ints1;
    }

    //2.2 (ohne 2.1 als Hilfe)
    public static int[] mul2(int[] ints, int n){
        int index = 0;
        int[] modified = new int[n * ints.length];
        for (int i = 0; i < modified.length; i++){
            if (index % ints.length == 0) index = 0;
            modified[i] = ints[index];
            index++;
        }
        return modified;
    }

   //4.1

    public static int f1(int n){
        if (n == 0){
            return 0;
        }
        else {
            return f1(n-1)+f2(n);
        }
    }
    public static int f2(int n){
        return (n-1) + f1(0);
    }


    //endregion


    //region SS21 Altklausur https://elearning.uni-regensburg.de/pluginfile.php/2332747/mod_folder/content/0/ADP-SS21.pdf?forcedownload=1

    //THEORY
    // 1.1 Funktionsorientiert, Anwendungsorientiert, Logik orientiert
    // 1.2 serieller ablauf, explizite angabe der aktionen, eigenständige Lösung
    // 1.3 Ein Objekt ist eine Instanz einer Klasse, welche wiederum als "Bauplan" für Objekte dient.
    // 1.4 equals(Object anotherObject) und toString()

    //2.1
    public static String multi(String s, int n) {
        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()){
            builder.append(String.valueOf(c).repeat(Math.max(0, n)));
        }
        return builder.toString();
    }

    //2.2
    public static char[] zip(char[] a, char[] b){
        int count = Math.min(a.length, b.length);
        String result = "";
        for (int i = 0; i < count; i++){
            result = result + a[i] + b[i];
        }
        return result.toCharArray();
    }

    //3.1 siehe com.ristudios.objectoriented.Interval

    //THEORY
    // 4.1 Immer 0, da die Funktion selbst so lange rekursiv aufgerufen wird, bis N == 0 true ist
    // 4.2 Lineare Rekursion, da die Methode genau einmal von sich selbst aufgerufen wird.
    //     Finalrekursion, da die Rekursion das letzte statement ist.
    //     Unilateral, weil sie nur auf sich selbst Bezug nimmt.
    // 4.3 O(n), da es sich um eine lineare Rekursion handelt.
    // 4.4 return 0, wegen Integer-Overflow?!?!

    public static int f(int n){
        System.out.println(n);
        if (n == 0){
            return n;
        }
        else
            return (n % 2 == 0) ? (f(n * 2)) : (f((n -1)));
    }




    //endregion

    //region SS16 Altklausur https://elearning.uni-regensburg.de/pluginfile.php/2332747/mod_folder/content/0/ADP-SS16.pdf?forcedownload=1

    //1.1
    //THEORY
    // Von abstrakten Klassen kann kein Objekt erzeugt werden. Abstrakte Klassen werden daher meist als Superklasse
    // für andere Klassen benutzt (Beispielsweise die abstrakte Klasse Mensch, welche die Superklasse von Mann und Frau ist)

    //1.2
    //THEORY
    // Methoden können abstrakt sein, in diesem Fall werden diese nicht implementiert, sondern müssen von den erbenden
    // Klassen überschrieben werden (ähnlich wie interface-Methoden). Variablen hingegen können nicht abstrakt sein.

    //1.3
    //THEORY
    // Ja, es ist möglich Konstruktoren für abstrakte Klassen zu schreiben. Diese werden allerdings nur in den Konstruktoren
    // der erbenden Klassen mit dem keyword super aufgerufen.

    //1.4
    /*
    THEORY
     Abstrakte Klassen können von anderen abstrakten Klassen erben. Nützlich wäre dies bei komplexeren Strukturen. Bsp.:
     Die Klassen Mann und Frau erben von der abstrakten Klasse Mensch, welche wiederum von der abstrakten Klasse
     Säugetier erbt.
     */

    //2

    public static boolean compareMatrices(int[][] matrix, int[][] matrix2){
        if (matrix == null || matrix2 == null) return false;
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i].length != matrix2[i].length) return false;
            for (int j = 0; j <matrix[i].length; j++){
                if (matrix[i][j] != matrix2[i][j]) return false;
            }
        }
        return true;
    }

    //3.1 Siehe package objectoriented

    //3.2 CODE
    public Bundy[] createBundies(){
        return new Bundy[] {new MaleBundy("Al"), new MaleBundy("Bud"), new FemaleBundy("Peg"),
        new FemaleBundy("Kelly")};
    }

    //endregion

    //region Übungsaufgaben von blatt https://elearning.uni-regensburg.de/mod/resource/view.php?id=2145558

    public static boolean isDualNumber(String s) {
        for (Character c : s.toCharArray()) {
            if (!c.equals('1') && !c.equals('0')) {
                return false;
            }
        }
        return true;
    }

    public static String mixString(String a, String b) {
        if (a.length() != b.length()) {
            return null;
        }
        StringBuilder mixed = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            mixed.append(a.charAt(i)).append(b.charAt(i));
        }
        return mixed.toString();
    }

    public static String transCode(String s, int i) {
        StringBuilder builder = new StringBuilder();
        for (Character c : s.toCharArray()) {
            char upped = (char) (c + i);
            if (upped > 'Z') {
                int dif = upped - 'Z' - 1;
                upped = 'A';
                upped = (char) (upped + dif);
            } else if (upped < 'A') {
                int dif = upped - 'A' + 1;
                upped = 'Z';
                upped = (char) (upped + dif);
            }
            builder.append(upped);
        }
        return builder.toString();
    }

    public static int sumOfOdds(int start, int end) {
        if (start < 0 || start > end) return 0;
        int sum = 0;
        while (start <= end) {
            if (start % 2 != 0) {
                sum += start;
            }
            start++;
        }
        return sum;
    }

    public static int sumOfBoozes(int start, int end) {
        if (start < 0 || start > end) return 0;
        if (start < 11) start = 11;
        int sum = 0;
        while (start <= end) {
            boolean isBoozeNumber = true;
            String valueString = String.valueOf(start);
            for (char c : valueString.toCharArray()) {
                if (c != valueString.charAt(0)) {
                    isBoozeNumber = false;
                    break;
                }
            }
            if (isBoozeNumber) sum+= start;
            start++;
        }
        return sum;
    }

    public static void increase (double[] numbers, double increaser){
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] + increaser;
            System.out.println(numbers[i]);
        }
    }

    public static double[] square(double[] base){
        double[] squared = new double[base.length];
        for (int i = 0; i < base.length; i++){
            squared[i] = base[i] * base[i];
        }
        return squared;
    }

    public static boolean charWithinBounds(char c, String s){
        if (s.isEmpty()) return false;
        s = s.toUpperCase();
        c = Character.toUpperCase(c);
        char min = s.charAt(0), max = s.charAt(0);

        for (char character : s.toCharArray()){
            if (min > character) min = character;
            if (max < character) max = character;
        }
        return c >= min && c <= max;
    }

    public static boolean isInInterval(int i, int[][] intervals){
        for (int[] interval : intervals){
            if (i >= interval[0] && i <= interval[1]){
                return true;
            }
        }
        return false;
    }

    //endregion
}
