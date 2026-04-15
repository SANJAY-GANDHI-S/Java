package com.leetcode;

public class Patterns {

    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.pattern(5);
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
            int star = i <= 5 ? i : n - (i - n);
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
            int space = i < n ? i : n - (i - n) - 1;
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
    public void pattern(int n) {
        int row = n * 2 - 1;
        for (int i = 0; i < row; i++) {
            int space = i < n ? n - i - 1 : i - n + 1;
            int star = i < n ? i * 2 + 1 : (n - ( i - n) - 2) * 2 + 1;
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
}
