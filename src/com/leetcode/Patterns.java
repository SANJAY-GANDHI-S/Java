package com.leetcode;

public class Patterns {

    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.pattern(4);
    }

    // 1.  *****
    //     *****
    //     *****
    //     *****
    //     *****
    public void pattern01(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 2.  *
    //     **
    //     ***
    //     ****
    //     *****
    public void pattern02(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3.  *****
    //     ****
    //     ***
    //     **
    //     *
    public void pattern03(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4.  1
    //     1 2
    //     1 2 3
    //     1 2 3 4
    //     1 2 3 4 5
    public void pattern04(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 5.  *
    //     **
    //     ***
    //     ****
    //     *****
    //     ****
    //     ***
    //     **
    //     *
    public void pattern05(int n) {
        int row = (n * 2) - 1;
        for (int i = 1; i <= row; i++) {
            int star = i <= 5 ? i : 2 * n - i;
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 6.       *
    //         **
    //        ***
    //       ****
    //      *****
    public void pattern06(int n) {
        for (int i = 0; i < n; i++) {
            int space = n - i - 1;
            int star = i + 1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 7.   *****
    //       ****
    //        ***
    //         **
    //          *
    public void pattern07(int n) {
        for (int i = 0; i < n; i++) {
            int star = n - i;
            int space = i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 8.      *
    //        ***
    //       *****
    //      *******
    //     *********
    public void pattern08(int n) {
        for (int i = 0; i < n; i++) {
            int space = n - i - 1;
            int star = i * 2 + 1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 9.  *********
    //      *******
    //       *****
    //        ***
    //         *
    public void pattern09(int n) {
        for (int i = 0; i < n; i++) {
            int star = (n - i) * 2 - 1;
            int space = i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 10.      *
    //         * *
    //        * * *
    //       * * * *
    //      * * * * *
    public void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            int space = n - i - 1;
            int star = i + 1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 11.  * * * * *
    //       * * * *
    //        * * *
    //         * *
    //          *
    public void pattern11(int n) {
        for (int i = 0; i < n; i++) {
            int star = n - i;
            int space = i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 12.  * * * * *
    //       * * * *
    //        * * *
    //         * *
    //          *
    //          *
    //         * *
    //        * * *
    //       * * * *
    //      * * * * *
    public void pattern12(int n) {
        int row = n * 2;
        for (int i = 0; i < row; i++) {
            int star = i < n ? n - i : i - n + 1;
            int space = i < n ? i : 2 * n - i - 1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 13.      *
    //         * *
    //        *   *
    //       *     *
    //      *********
    public void pattern13(int n) {
        for (int i = 0; i < n; i++) {
            int space = n - i - 1;
            int star = i * 2 + 1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                if ( i == n - 1 || k == 0 || k == star - 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 14.  *********
    //       *     *
    //        *   *
    //         * *
    //          *
    public void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            int star = (n - i) * 2 - 1;
            int space = i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                if ( i == 0 || k == 0 || k == star - 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 15.      *
    //         * *
    //        *   *
    //       *     *
    //      *       *
    //       *     *
    //        *   *
    //         * *
    //          *
    public void pattern15(int n) {
        int row = n * 2 - 1;
        for (int i = 0; i < row; i++) {
            int space = i < n ? n - i - 1 : i - n + 1;
            int star = i < n ? i * 2 + 1 : (2 * n - i - 2) * 2 + 1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                if ( k == 0 || k == star - 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 16.           1
    //             1   1
    //           1   2   1
    //         1   3   3   1
    //       1   4   6   4   1

    // 17.      1
    //         212
    //        32123
    //       4321234
    //        32123
    //         212
    //          1
    public void pattern17(int n) {
        int row = n * 2 - 1;
        for (int i = 0; i < row; i++) {
            int space = i < n ? n - i - 1 : i - n + 1;
            int number = i < n ? i : 2 * n - i - 2;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = number; k >= 0; k--) {
                System.out.print(k + 1);
            }
            for (int k = 1; k <= number; k++) {
                System.out.print(k + 1);
            }
            System.out.println();
        }
    }

    // 18.   **********
    //       ****  ****
    //       ***    ***
    //       **      **
    //       *        *
    //       *        *
    //       **      **
    //       ***    ***
    //       ****  ****
    //       **********
    public void pattern18(int n) {
        for (int i = 0; i < n * 2; i++) {
            int star = i < n ? n - i : i - n + 1;
            int space = i < n ? i * 2 : 2 * (2 * n - i - 1);
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 19.    *        *
    //        **      **
    //        ***    ***
    //        ****  ****
    //        **********
    //        ****  ****
    //        ***    ***
    //        **      **
    //        *        *
    public void pattern19(int n) {
        for (int i = 0; i < n * 2 - 1; i++) {
            int star = i < n ? i + 1 : 2 * n - i - 1;
            int space = i < n ? 2 * (n - i - 1) : 2 * (i - n + 1);
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 20.    ****
    //        *  *
    //        *  *
    //        *  *
    //        ****
    public void pattern20(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i == 0 || j == 0 || j == n - 1 || i == n - 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 21.    1
    //        2  3
    //        4  5  6
    //        7  8  9  10
    //        11 12 13 14 15
    public void pattern21(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    // 22.    1
    //        0 1
    //        1 0 1
    //        0 1 0 1
    //        1 0 1 0 1
    public void pattern22(int n) {
        for (int i = 1; i <= n; i++) {
            int num = i % 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num == 0 ? 1 : 0;
            }
            System.out.println();
        }
    }

    // 25.       *****
    //          *   *
    //         *   *
    //        *   *
    //       *****
    public void pattern25(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if ( i == 0 || j == 0 || j == n - 1 || i == n - 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 26.   1 1 1 1 1 1
    //       2 2 2 2 2
    //       3 3 3 3
    //       4 4 4
    //       5 5
    //       6
    public void pattern26(int n) {
        int count = 1;
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(count + " ");
            }
            count++;
            System.out.println();
        }
    }

    // 27.   1 2 3 4  17 18 19 20
    //         5 6 7  14 15 16
    //           8 9  12 13
    //             10 11
    public void pattern(int n) {
        int count = 1;
        int lastNum = n * n + n;
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - row; j++) {
                System.out.print(count++ + " ");
            }
            int number = lastNum - count + 2;
            for (int j = 0; j < n - row; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    // 28.      *
    //         * *
    //        * * *
    //       * * * *
    //      * * * * *
    //       * * * *
    //        * * *
    //         * *
    //          *
    public void pattern28(int n) {
        for (int row = 0; row < n * 2 - 1; row++) {
            int col = row < n ? n - row - 1 : row - n + 1;
            int star = row < n ? row + 1 : 2 * n - row - 1;
            for (int space = 0; space < col; space++) {
                System.out.print(" ");
            }
            for (int i = 0; i < star; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 30.         1
    //           2 1 2
    //         3 2 1 2 3
    //       4 3 2 1 2 3 4
    //     5 4 3 2 1 2 3 4 5
    public void pattern30(int n) {
        for (int i = 0; i < n; i++) {
            int space = n - i - 1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 0; k--) {
                System.out.print(k + 1);
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + 1);
            }
            System.out.println();
        }
    }

    // 31.   4 4 4 4 4 4 4
    //       4 3 3 3 3 3 4
    //       4 3 2 2 2 3 4
    //       4 3 2 1 2 3 4
    //       4 3 2 2 2 3 4
    //       4 3 3 3 3 3 4
    //       4 4 4 4 4 4 4
    public void pattern31(int n) {
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }

    // 32.    E
    //        D E
    //        C D E
    //        B C D E
    //        A B C D E
    public void pattern32(int n) {
        for (int i = n; i > 0; i--) {
            char letter = (char) (64 + i);
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }
    }

    // 33.    a
    //        B c
    //        D e F
    //        g H i J
    //        k L m N o
    public void pattern33(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if ( count%2 == 0 ) {
                    System.out.print((char) (97 + count) + " ");
                } else {
                    System.out.print((char) (65 + count) + " ");
                }
                count++;
            }
            System.out.println();
        }
    }

    // 34.    E D C B A
    //        D C B A
    //        C B A
    //        B A
    //        A
    public void pattern34(int n) {
        for (int i = n; i > 0; i--) {
            char letter = (char) (64 + i);
            for (int j = 0; j < i; j++) {
                System.out.print(letter + " ");
                letter--;
            }
            System.out.println();
        }
    }

    // 35.    1      1
    //        12    21
    //        123  321
    //        12344321
    public void pattern35(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            for (int space = 0; space < 2 * (n - i)- 2; space++) {
                System.out.print(" ");
            }
            for (int j = i + 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
