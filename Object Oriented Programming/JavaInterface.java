/**
 * 
 * Andreu Garcies Ramon 19-10-2021
 * 
 * A Java interface can only contain method signatures and fields. The interface can be used to achieve
 * polymorphism. In this problem, you will practice your knowledge on interfaces. You are given an interface
 * AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to write a class
 * called MyCalculator which implements the interface. divisorSum function just takes an integer as input and
 * return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12.
 * The value of n will be at most 1000.
 * 
 * SAMPLE INPUT: 6
 * 
 * SAMPLE OUTPUT:
 * I implemented: AdvancedArithmetic
 * 12
 */

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}


class MyCalculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int divisorSum = 0;
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                divisorSum += i;
            }
        }
        return divisorSum;
    }
}

public class JavaInterface {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceName(calculator);

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(calculator.divisorSum(number));
        scan.close();
    }

    static void ImplementedInterfaceName(Object o) {
        Class[] interfaces = o.getClass().getInterfaces();
        for (int i = 0; i < interfaces.length; i++) {
            String interfaceName = interfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
