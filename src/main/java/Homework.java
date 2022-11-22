
public class Homework {
    public static void main(String[] args) {
        taskVar();
        System.out.println("a * (b + (c / d))= " + taskExp(1, 150, 300, 2));
        taskExam(10, 10);
        taskPosOrNeg(0);
        taskBool(-10);
        taskStr("Андрей");
        taskYears(200);

    }

    private static void taskYears(int a) {
        if (a % 400 == 0) {
            System.out.println("Год високосный");
        } else if (a % 100 == 0) {
            System.out.println("Год невисокосный");
        } else if (a % 4 == 0)
            System.out.println("Год високосный");
        else {
            System.out.println("Год невисокосный");
        }
    }

    private static void taskStr(String str) {
        System.out.println("Привет, " + str);
    }

    private static boolean taskBool(int a) {
        return a < 0;
    }

    private static void taskPosOrNeg(int a) {
        if (a >= 0) System.out.println("a is positive");
        else System.out.println("a is negative");
    }

    private static boolean taskExam(double a, double b) {
        if (a + b >= 10 || a + b <= 20)
            return true;
        else
            return false;
    }

    public static double taskExp(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    private static void taskVar() {
        char a = 'a';
        byte b = 10;
        short c = 25;
        int d = 50;
        long e = 500L;
        boolean f = true;
        float g = 0.5f;
        double h = 5.5;
        String i = "text";
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n" + g + "\n" + h + "\n" + i);
    }
}
