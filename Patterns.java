// Specific Patterns
public class Patterns {public static void main(StringsDataType[] agrs) {
//    Scanner sc = new Scanner(System.in);
//    int num = sc.nextInt();
    int n = 5;
    int m = 8;
    // filled rectangle
    System.out.println("filled rectangle");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    //hollow rectangle
    System.out.println("hollow rectangle");
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            if (i == 1 || j == 1 || i == n || j == m) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }

        }
        System.out.println();
    }
    // half pyramid
    System.out.println("Half Pyramid");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    //Invert Half Pyramid
    System.out.println("Invert Half Pyramid");
    for (int i = n; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    //Mirrored half Pyramid
    System.out.println("Mirrored half Pyramid");
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    // half numeric pyramid
    System.out.println("Half Numeric Pyramid");
    for (int i = 0; i < n; i++) {
        int k = 1;
        for (int j = 0; j <= i; j++) {
            System.out.print(k + " ");
            k += 1;
        }
        System.out.println();
    }
    //Invert Half Numeric Pyramid
    System.out.println("Invert Half Numeric Pyramid");
    for (int i = n; i > 0; i--) {
        int k = 1;
        for (int j = 0; j < i; j++) {
            System.out.print(k + " ");
            k++;
        }
        System.out.println();
    }
    // half BinaryAl pyramid
    System.out.println("Half BinaryAl Pyramid");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            if ((i + j) % 2 == 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
    int s = 4;
    // Butterfly
    System.out.println("Buterfly");
    for (int i = 1; i <= s; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        for (int j = 1; j <= 2 * s - 2 * i; j++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print(" *");
        }
        System.out.println();
    }
    for (int i = s; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        for (int j = 1; j <= 2 * s - 2 * i; j++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print(" *");
        }
        System.out.println();
    }

    // Homework
    System.out.println("HomeWork-Rhombus");
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 5 - i; j++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= 5; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println("HomeWork-Num_Pyramid");
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 5 - i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    System.out.println("HomeWork-Panlindrom_pyramid");
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 5 - i; j++) {
            System.out.print("  ");
        }int k =i;
        for (int j = 1; j <= i; j++) {
            System.out.print(k+" ");
            k-=1;
        }k=k+2;
        for(int j=1;j<=i-1;j++){
            System.out.print(k+" ");
            k++;
        }

        System.out.println();
    }
}}
