/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**

 */
public class MatrixCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Kami dari kel 6");
            System.out.println("Kelas Informatika-III-A");
            System.out.println("STT Cipasung");
            System.out.println("Aljabar Geometri");
            System.out.println("Menu:");
            System.out.println("1. Penjumlahan dan Pengurangan Matriks");
            System.out.println("2. Matriks Transpose");
            System.out.println("3. Matriks Balikan/Invers");
            System.out.println("4. Determinan");
            System.out.println("5. Sistem Persamaan Linier");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    matrixAdditionAndSubtractionSubmenu(scanner);
                    break;
                case 2:
                    matrixTransposeSubmenu();
                    break;
                case 3:
                    matrixInverseSubmenu(scanner);
                    break;
                case 4:
                    determinantSubmenu(scanner);
                    break;
                case 5:
                    systemOfLinearEquations2x3(scanner);
                    break;
                case 6:
                    System.out.println("Program berakhir. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void matrixAdditionAndSubtractionSubmenu(Scanner scanner) {
        System.out.println("Sub-menu Penjumlahan dan Pengurangan Matriks (2x2):");
        System.out.println("1. Penjumlahan Matriks");
        System.out.println("2. Pengurangan Matriks");
        System.out.print("Pilih sub-menu: ");
        int submenuChoice = scanner.nextInt();

        System.out.println("Masukkan nilai matriks A:");
        System.out.print("a[1][1] : ");
        double a11 = scanner.nextDouble();
        System.out.print("a[1][2] : ");
        double a12 = scanner.nextDouble();
        System.out.print("a[2][1] : ");
        double a21 = scanner.nextDouble();
        System.out.print("a[2][2] : ");
        double a22 = scanner.nextDouble();

        System.out.println("Masukkan nilai matriks B:");
        System.out.print("b[1][1] : ");
        double b11 = scanner.nextDouble();
        System.out.print("b[1][2] : ");
        double b12 = scanner.nextDouble();
        System.out.print("b[2][1] : ");
        double b21 = scanner.nextDouble();
        System.out.print("b[2][2] : ");
        double b22 = scanner.nextDouble();

        switch (submenuChoice) {
            case 1:
                matrixAddition(a11, a12, a21, a22, b11, b12, b21, b22);
                break;
            case 2:
                matrixSubtraction(a11, a12, a21, a22, b11, b12, b21, b22);
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }

    private static void matrixAddition(double a11, double a12, double a21, double a22,
                                       double b11, double b12, double b21, double b22) {
        double resultA11 = a11 + b11;
        double resultA12 = a12 + b12;
        double resultA21 = a21 + b21;
        double resultA22 = a22 + b22;

        System.out.println("Hasil Penjumlahan Matriks:");
        System.out.println(resultA11 + " " + resultA12);
        System.out.println(resultA21 + " " + resultA22);
    }

    private static void matrixSubtraction(double a11, double a12, double a21, double a22,
                                          double b11, double b12, double b21, double b22) {
        double resultA11 = a11 - b11;
        double resultA12 = a12 - b12;
        double resultA21 = a21 - b21;
        double resultA22 = a22 - b22;

        System.out.println("Hasil Pengurangan Matriks:");
        System.out.println(resultA11 + " " + resultA12);
        System.out.println(resultA21 + " " + resultA22);
    }

    private static void matrixTransposeSubmenu() {
        System.out.println("Sub-menu Matriks Transpose:");
        System.out.println("1. Matriks Transpose (2x2)");
        System.out.println("2. Matriks Transpose (3x3)");
        System.out.print("Pilih sub-menu: ");
        Scanner scanner = new Scanner(System.in);
        int submenuChoice = scanner.nextInt();

        switch (submenuChoice) {
            case 1:
                matrixTranspose2x2Submenu(scanner);
                break;
            case 2:
                matrixTranspose3x3Submenu(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }

    private static void matrixTranspose2x2Submenu(Scanner scanner) {
        System.out.println("Masukkan nilai matriks A (2x2):");
        System.out.print("a[1][1] : ");
        double a11 = scanner.nextDouble();
        System.out.print("a[1][2] : ");
        double a12 = scanner.nextDouble();
        System.out.print("a[2][1] : ");
        double a21 = scanner.nextDouble();
        System.out.print("a[2][2] : ");
        double a22 = scanner.nextDouble();

        matrixTranspose2x2(a11, a12, a21, a22);
    }

    private static void matrixTranspose3x3Submenu(Scanner scanner) {
        System.out.println("Masukkan nilai matriks A (3x3):");
        System.out.print("a[1][1] : ");
        double a11 = scanner.nextDouble();
        System.out.print("a[1][2] : ");
        double a12 = scanner.nextDouble();
        System.out.print("a[1][3] : ");
        double a13 = scanner.nextDouble();
        System.out.print("a[2][1] : ");
        double a21 = scanner.nextDouble();
        System.out.print("a[2][2] : ");
        double a22 = scanner.nextDouble();
        System.out.print("a[2][3] : ");
        double a23 = scanner.nextDouble();
        System.out.print("a[3][1] : ");
        double a31 = scanner.nextDouble();
        System.out.print("a[3][2] : ");
        double a32 = scanner.nextDouble();
        System.out.print("a[3][3] : ");
        double a33 = scanner.nextDouble();

        matrixTranspose3x3(a11, a12, a13, a21, a22, a23, a31, a32, a33);
    }

    private static void matrixTranspose2x2(double a11, double a12, double a21, double a22) {
        System.out.println("Hasil Transpose Matriks (2x2):");
        System.out.println(a11 + " " + a21);
        System.out.println(a12 + " " + a22);
    }

    private static void matrixTranspose3x3(double a11, double a12, double a13,
                                           double a21, double a22, double a23,
                                           double a31, double a32, double a33) {
        System.out.println("Hasil Transpose Matriks (3x3):");
        System.out.println(a11 + " " + a21 + " " + a31);
        System.out.println(a12 + " " + a22 + " " + a32);
        System.out.println(a13 + " " + a23 + " " + a33);
    }

    private static void matrixInverseSubmenu(Scanner scanner) {
        System.out.println("Sub-menu Matriks Balikan/Invers (2x2):");
        System.out.println("1. Matriks Balikan/Invers (2x2)");
        System.out.print("Pilih sub-menu: ");
        int submenuChoice = scanner.nextInt();

        System.out.println("Masukkan nilai matriks A:");

        System.out.print("a[1][1] : ");
        double a11 = scanner.nextDouble();
        System.out.print("a[1][2] : ");
        double a12 = scanner.nextDouble();
        System.out.print("a[2][1] : ");
        double a21 = scanner.nextDouble();
        System.out.print("a[2][2] : ");
        double a22 = scanner.nextDouble();

        switch (submenuChoice) {
            case 1:
                matrixInverse2x2(a11, a12, a21, a22);
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }

    private static void matrixInverse2x2(double a11, double a12, double a21, double a22) {
        double determinant = a11 * a22 - a12 * a21;

        if (determinant == 0) {
            System.out.println("Determinan nol, matriks tidak memiliki invers.");
        } else {
            double inverseA11 = a22 / determinant;
            double inverseA12 = -a12 / determinant;
            double inverseA21 = -a21 / determinant;
            double inverseA22 = a11 / determinant;

            System.out.println("Hasil Invers Matriks (2x2):");
            System.out.println(inverseA11 + " " + inverseA12);
            System.out.println(inverseA21 + " " + inverseA22);
        }
    }

    private static void determinantSubmenu(Scanner scanner) {
        System.out.println("Sub-menu Determinan:");
        System.out.println("1. Determinan Matriks (2x2)");
        System.out.println("2. Determinan Matriks (3x3)");
        System.out.print("Pilih sub-menu: ");
        int submenuChoice = scanner.nextInt();

        switch (submenuChoice) {
            case 1:
                determinant2x2(scanner);
                break;
            case 2:
                determinant3x3(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }

    private static void determinant2x2(Scanner scanner) {
        System.out.println("Masukkan nilai matriks A (2x2):");

        System.out.print("a[1][1] : ");
        double a11 = scanner.nextDouble();
        System.out.print("a[1][2] : ");
        double a12 = scanner.nextDouble();
        System.out.print("a[2][1] : ");
        double a21 = scanner.nextDouble();
        System.out.print("a[2][2] : ");
        double a22 = scanner.nextDouble();

        double determinant = a11 * a22 - a12 * a21;
        System.out.println("Determinan Matriks (2x2): " + determinant);
    }

    private static void determinant3x3(Scanner scanner) {
        System.out.println("Masukkan nilai matriks A (3x3):");

        System.out.print("a[1][1] : ");
        double a11 = scanner.nextDouble();
        System.out.print("a[1][3] : ");
        double a12 = scanner.nextDouble();
        System.out.print("a[1][3] : ");
        double a13 = scanner.nextDouble();
        System.out.print("a[2][1] : ");
        double a21 = scanner.nextDouble();
        System.out.print("a[2][2] : ");
        double a22 = scanner.nextDouble();
        System.out.print("a[2][3] : ");
        double a23 = scanner.nextDouble();
        System.out.print("a[1][1] : ");
        double a31 = scanner.nextDouble();
        System.out.print("a[3][2] : ");
        double a32 = scanner.nextDouble();
        System.out.print("a[3][3] : ");
        double a33 = scanner.nextDouble();

        double determinant = a11 * (a22 * a33 - a23 * a32)
                - a12 * (a21 * a33 - a23 * a31)
                + a13 * (a21 * a32 - a22 * a31);

        System.out.println("Determinan Matriks (3x3): " + determinant);
    }

    private static void systemOfLinearEquations2x3(Scanner scanner) {
        System.out.println("Masukkan koefisien matriks A dan vektor B untuk SPL (2x3):");
        System.out.print("a[1][1] : ");
        double a11 = scanner.nextDouble();
        System.out.print("a[1][2] : ");
        double a12 = scanner.nextDouble();
        System.out.print("b[1] : ");
        double b1 = scanner.nextDouble();

        System.out.print("a[2][1] : ");
        double a21 = scanner.nextDouble();
        System.out.print("a[2][2] : ");
        double a22 = scanner.nextDouble();
        System.out.print("b[2] : ");
        double b2 = scanner.nextDouble();

        double determinant = a11 * a22 - a12 * a21;

        if (determinant == 0) {
            System.out.println("Determinan nol, SPL tidak memiliki solusi unik.");
        } else {
            double x = (b1 * a22 - b2 * a12) / determinant;
            double y = (b2 * a11 - b1 * a21) / determinant;

            System.out.println("Solusi SPL (2x3):");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
    
}