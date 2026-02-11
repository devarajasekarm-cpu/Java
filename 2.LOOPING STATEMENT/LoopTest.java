public class LoopTest {
    public static void main(String[] args) {
        int n = 4; // middle row length
        int totalRows = 2 * n - 1;

        for (int i = 1; i <= totalRows; i++) {
            int countInRow = i <= n ? i : totalRows - i + 1; // numbers in this row
            int spaces = n - countInRow; // leading spaces

            // print leading spaces
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            // print numbers sequentially for top half
            int startNum = 1;
            for (int j = 1; j < i && i <= n; j++) {
                startNum += j;
            }
            if (i > n) {
                startNum = 1;
                for (int j = 1; j <= n - 1; j++) {
                    startNum += j;
                }
                for (int j = n; j < totalRows - i + 1; j++) {
                    startNum -= j;
                }
            }

            // print numbers in row
            int num = startNum;
            for (int j = 1; j <= countInRow; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
