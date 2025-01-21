import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first matrix:");
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the second matrix:");
        int[][] b = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the operation (+, -, *):");
        char operation = scanner.next().charAt(0);

        int[][] c = new int[3][3];
        switch (operation) {
            case '+':
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
                break;

            case '-':
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        c[i][j] = a[i][j] - b[i][j];
                    }
                }
                break;

            case '*':
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        c[i][j] = 0;
                        for (int k = 0; k < 3; k++) {
                            c[i][j] += a[i][k] * b[k][j];
                        }
                    }
                }
                break;

            default:
                System.out.println("Invalid operation");
                scanner.close();
                return;
        }

        System.out.println("The resultant matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
