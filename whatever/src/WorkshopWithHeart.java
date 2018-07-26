
public class WorkshopWithHeart {

    public static void main(String[] args) {
        int start = 9;
        // Line1

        System.out.print(" **   ** ");
        newLine();

        for (int i = 0; i < 9; i++) {
            if (i == start / 2) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }

        newLine();

        for (int round = 0; round < 5; round++) {
            // space
            generateSpace(round);
            // star
            generateStar(start);
            newLine();

            start = start - 2;
        }

    }

    private static void newLine() {
        System.out.println();
    }

    private static void generateStar(int start) {
        for (int i = 0; i < start; i++) {
            System.out.print("*");
        }
    }

    private static void generateSpace(int round) {
        for (int a = 0; a < round; a++) {
            System.out.print(" ");
        }
    }

}
