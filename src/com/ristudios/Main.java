package com.ristudios;


import com.ristudios.objectoriented.Rectangle;
import com.ristudios.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        Rectangle rect1 = new Rectangle(3, 4);
        Rectangle rect2 = new Rectangle(2);
        Rectangle rect3 = rect1.reverse();
        System.out.println(rect1.area());
        System.out.println(rect1.diagonal());

         */
        TreeNode n1 = new TreeNode(0, null, null);
        TreeNode n2 = new TreeNode(-2, null, null);
        TreeNode n3 = new TreeNode(-3, n1, n2);
        TreeNode n5 = new TreeNode(5, null, null);
        TreeNode n4 = new TreeNode(3, n3, n5);
        System.out.println(n4.count());
    }

    //ADP WS2122
    //2.1
    public static int[] add(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        /**for (int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++){
            c[i+a.length] = b[i];
        }
         */

        for (int i = 0; i < c.length; i++){
            /*if (i < a.length){
                c[i] = a[i];
            } else{
                c[i] = b[i - a.length];
            }*/

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

    //4.1
    /*
    N       0   1   2   3   4   5   6   7

    F(N)    0
    */

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

    //4.2

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
}
