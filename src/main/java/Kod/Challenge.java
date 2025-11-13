package Kod;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Challenge {
    // Simple function to evaluate the equation
    private static int evaluateEquation(String equation) {
        return Integer.parseInt(equation);
    }

    public static int missingDigit(String inputStr) {
        for (int digit = 0; digit <= 9; ++digit) {
            String modifiedEquation = inputStr.replace("x", String.valueOf(digit));
            if (evaluateEquation(modifiedEquation) == 1) {
                return digit;
            }
        }

        // Return -1 if no missing digit is found
        return -1;
    }

    public static void main(String[] args) {
        String inputEquation = "3x + 12 = 46";
        int result = missingDigit(inputEquation);

        if (result != -1) {
            System.out.println("Missing digit is: " + result);
        } else {
            System.out.println("No missing digit found.");
        }
    }
    
}
