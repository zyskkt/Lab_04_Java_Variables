public class Main {

    public static void main(String[] args) {
        //Initialize variables
        int intOperandA = 1;
        int intOperandB= 3;
        int intSum = 1;
        int intProduct = 4;
        int intDifference = 0;
        int intQuotient = 1;
        int intModulo = 5;

        double doubleOperandA = 2;
        double doubleOperandB = 3;
        double doubleModulo = 0;
        double doubleSum = 3;
        double doubleProduct = 4;
        double doubleDifference = 3;
        double doubleQuotient = 5;

        //Math
        intSum = intOperandA + intOperandB;
        intDifference = intOperandB - intOperandA;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;
        doubleSum = doubleOperandA + doubleOperandB;
        doubleDifference = doubleOperandB - doubleOperandA;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleQuotient = doubleOperandB / doubleOperandA;
        doubleModulo = doubleOperandB % doubleOperandA;
        
        //Output results
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The difference between " + intOperandB + " and " + intOperandA + " is " + intDifference);
        System.out.println("The difference between " + doubleOperandB + " and " + doubleOperandA + " is " + doubleDifference);
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);    
        System.out.println("The remainder between " + intOperandA + " and " + intOperandB + " is " + intModulo);    
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);    
        System.out.println("The difference between " + doubleOperandB + " and " + doubleOperandA + " is " + doubleDifference);       
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);      
        System.out.println("The quotient of " + doubleOperandB + " and " + doubleOperandA + " is  " + doubleQuotient);    
        System.out.println("The remainder between " + doubleOperandB + " and " + doubleOperandA + " is " + doubleModulo);

        }

    }
