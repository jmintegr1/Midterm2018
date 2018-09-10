package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /   Implement a large Pyramid of stars in the screen with java.

                        *
                       * *
                      * * *
                     * * * *
                    * * * * *
                   * * * * * *
         */

            public static void main(String[] args) {
                for (int x = 0; x < 10; x++) {
                    for (int y = 0; y < 10 - x; y++) {
                        System.out.print(" ");
                    }
                    for (int z = 0; z <= x; z++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

            }
        }
