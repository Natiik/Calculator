package com.example.calculator;


class Solution {

    public static String solve(String input) {
        String[] math = splitString(input);
        int action = getAction(math);
        int equal= getEqual(math);
        double number1 = getNumber(math, 0, action);
        double number2 = getNumber(math, action + 1, equal);
        return ""+ result(math[action],number1,number2);
    }

    public static String[] splitString(String problem) {
        String[] single = new String[problem.length()];
        single = problem.split("");
        return single;
    }

    public static int getAction(String[] single) {
        int a = 0;
        for (int i = 0; i < single.length; i++) {
            if ((single[i].equalsIgnoreCase("+")) || (single[i].equalsIgnoreCase("-")) || (single[i].equalsIgnoreCase("*")) || (single[i].equalsIgnoreCase("_"))) {
                a = i;
            }
        }
        return a;
    }

    public static int getEqual(String[] single) {
        int a = single.length;
        for (int i = 0; i < single.length; i++) {
            if (single[i].equalsIgnoreCase("=")) {
                a=i;
            }
        }
        return a;
    }


    public static double getNumber(String[] single, int startPoint, int endPoint) {
        String number = "";
        for (int i = startPoint; i < endPoint; i++) {
            number = number + single[i];
        }
        return Double.parseDouble(number);
    }

    public static double result(String operator, double number1, double number2) {
        double result=0;
        if (operator.equalsIgnoreCase("+")) {
            result=number1 + number2;
        } else if (operator.equalsIgnoreCase("-")) {
            result= number1 - number2;
        } else if (operator.equalsIgnoreCase("*")) {
            result=number1 * number2;
        } else if (operator.equalsIgnoreCase("_")) {
            result= number1 / number2;
        }
        return result;
    }
}
