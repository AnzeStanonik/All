import java.util.Scanner;
class nizi{
    public static void main(String[] args) {
        char[] znaki = new char[] {'A', 'v', 't', 'o', '!'};
        for (int i = 0; i<znaki.length; i++) {
            System.out.print(znaki[i]);
        }
        System.out.println();
        String niz = null;
        String pozdrav = "Pozdravljen, svet!";
        String pozdrav2 =  new String(pozdrav);
        String pozdrav3 = new String(
            new char[] {'p', 'o', 'z', 'd', 'r', 'a', 'v', 'l', 'j', 'e', 'n',
            ' ', 's', 'v', 'e', 't', '!'
            }
        );
        String pozdrav4 = new String("Pozdravljen svet!");
        System.out.println(pozdrav + pozdrav2 + pozdrav3 + pozdrav4);
    }
}