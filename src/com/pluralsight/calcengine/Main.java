package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        double[] leftVals = {100.0D, 25.0D, 225.0D, 11.0D};
        double[] rightVals = {50.0D, 92.0D, 17.0D, 3.0D};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        for(int i = 0; i < opCodes.length; ++i) {
            switch(opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 'd':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    results[i] = 0.0D;
            }
        }

     for (double theResult : results) {
            System.out.println("result = " + theResult);
        }

    }
}
