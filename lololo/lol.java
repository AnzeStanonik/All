import java.util.Scanner;
import java.util.random;
class lol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vnesi velikost tabele: ");
        int velikost1 = sc.nextInt();
        if(velikost1 <= 0) {
            System.out.println("Napaka pri vnosu!,");
            System.out.println("velikost mora biti vecja od 0");
            System.exit(1);
        }
            if(velikost1 % 2 != 0) {
            System.out.println("Napaka pri vnosu!,");
            System.out.println("velikost mora biti vecja od 0");
            System.exit(2);
        }
                boolean[] logicne = new boolean[velikost1];
        for(int i /*spremenljivka za indeks*/ = 0; i < velikost1; i++) {
            System.out.println(velikost1.length);
        }
        random r
        int[] a;
        a = new int[4];
        if(a.length > 2) {
        a[0] = 10;  /* offset 0 */
        a[1] = 50;  /* offset 1 */
        a[2] = 100; /* offset 2 */
        /* a[3] = 0 Privzeta vrednost 0, ki jo definira primitiven podatkoven tip */
        System.out.println(a[3]);
        String[] nizi = new String[5];
        System.out.println(nizi[3]);
        }
        int[] a2;
        a2 = new int[] { 15, 20, 30, 40};
        System.out.println(a2[2]);
        int a3 = a2[2] + a2[3];
        System.out.println(a3);
        final int velikost = 10;
        boolean[] logicne2 = new boolean[velikost];
        System.out.println(logicne2.length);
        System.out.println(velikost);
    }
}