package m3p17;

import java.util.Scanner;

public class M3P17 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        String key;
        int option = -1;
        keyboard.useDelimiter("\n");
        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//start of switch
                case 1:
                    p1();
                    break;
                case 2:
                    p2();
                    break;
                case 3:
                    p3();
                    break;
                case 7:
                    p7();
                    break;
                case 8:
                    System.out.println("Word?: ");
                    String str = keyboard.next();
                    String result = StringToBinary(str);
                    
                    break;
                case 0:
                    p0();
                    break;
                default:
                    System.out.println("This option isn't valid");

            }//end of switch
            System.out.println();
            System.out.print("Press any key to continue");
            key = keyboard.next();
        }
    }

    private static void userMenu() {
        System.out.println("Option1: ");
        System.out.println("Option2: ");
        System.out.println("Option3: ");
        System.out.println("Option4: ");
        System.out.println("Option5: ");
        System.out.println("Option6: ");
        System.out.println("Option7: ");
        System.out.println("Option8: ");
        System.out.println("Option9: ");
        System.out.println("Option0: (exit):");

        System.out.print("\n\nOption?: ");
    }

    private static void p1() {
        int euro;
        double result;
        System.out.println("Euros?: ");
        euro = keyboard.nextInt();
        double preu = 100, tax = 21, res;
        res = FuncionCLEDERA(preu, tax);
        methodCLEDERA(preu, tax, res);
        result = p1(euro);
        result = p2(euro);

        System.out.println(result);
    }

    private static double FuncionCLEDERA(double price, double iva) {
        double PVP = 0;
        PVP = price + price * (iva / 100);
        return PVP;
    }

    private static float p1(int euro) {
        float result = 0;
        result = Float.valueOf(euro) / 0.91f;
        return result;
    }

    private static double p2(int euro) {
        double result = 0;
        result = Double.valueOf(euro) / 0.91;
        return result;
    }

    public static final String ANSI_GREEN = "\u001B[32m";

    public static void methodCLEDERA(double price, double iva, double res) {
        System.out.println(ANSI_GREEN + "Precio unitario " + price + " Pordentaje iva " + iva + " Precio final " + res);
    }

    private static void p3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void p7() {
        System.out.println("Letter?: ");
        char letter = (keyboard.next()).charAt(0);
        String letterBinary = Integer.toBinaryString(letter);
        System.out.println(letter + "=" + letterBinary);
    }

    private static String p8(String str) {
        String result = "";
        String letterBinary;
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            result = Integer.toBinaryString(ch) + " ";
        }
        return result;
    }

    private static void p0() {

    }

}
