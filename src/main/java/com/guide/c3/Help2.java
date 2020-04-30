package com.guide.c3;

/**
 * This is 3-2
 *
 * An improved help system that uses a
 * do-while to process a menu selection.
 */
public class Help2 {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;

        do {
            System.out.println("Help on:");
            System.out.println("   1. if");
            System.out.println("   2. switch");
            System.out.println("   3. for");
            System.out.println("   4. while");
            System.out.println("   5. do-while\n");
            System.out.print("Choose one: ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' | choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:");
                System.out.println("switch(expression) {");
                System.out.println(" case constant:");
                System.out.println("   statement sequence");
                System.out.println("   break;");
                System.out.println("   // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for:\n");
                System.out.println("for(init; condition; iteration)");
                System.out.println(" statement");
                break;
            case '4':
                System.out.println("The while:\n");
                System.out.println("while(condition) statement;");
                break;
            case '5':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println(" statement;");
                System.out.println("} while (condition);");
                break;
            default:
                System.out.print("Selection not found.");
        }
    }
}
