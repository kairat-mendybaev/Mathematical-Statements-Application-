import java.util.Scanner;

public class LogicalOperations {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean A, B;
        System.out.println("Welcome to the Logical Operations App!");

        while (true) {
            System.out.print("Enter boolean value for A (true/false): ");
            A = scanner.nextBoolean();
            System.out.print("Enter boolean value for B (true/false): ");
            B = scanner.nextBoolean();

            displayResults(A, B);
            generateTruthTable();

            System.out.print("Do you want to try again? (true/false): ");
            if (!scanner.nextBoolean()) {
                break;
            }
        }
    }

    private static void displayResults(boolean A, boolean B) {
        System.out.println("Results:");
        System.out.println("A AND B: " + and(A, B));
        System.out.println("A OR B: " + or(A, B));
        System.out.println("NOT A: " + not(A) + ", NOT B: " + not(B));
        System.out.println("A IF...THEN B: " + implies(A, B));
        System.out.println("A IF AND ONLY IF B: " + iff(A, B));
    }

    private static void generateTruthTable() {
        boolean[] values = {true, false};
        System.out.println("Truth Table:");
        System.out.println("A\tB\tAND\tOR\tNOT A\tNOT B\tA->B\tA<->B");
        for (boolean A : values) {
            for (boolean B : values) {
                System.out.println(A + "\t" + B + "\t"
                        + and(A, B) + "\t" + or(A, B) + "\t"
                        + not(A) + "\t" + not(B) + "\t"
                        + implies(A, B) + "\t" + iff(A, B));
            }
        }
    }

    static boolean and(boolean A, boolean B) {
        return A && B;
    }

    static boolean or(boolean A, boolean B) {
        return A || B;
    }

    static boolean not(boolean A) {
        return !A;
    }

    static boolean implies(boolean A, boolean B) {
        return !A || B;
    }

    static boolean iff(boolean A, boolean B) {
        return (A && B) || (!A && !B);
    }
}
