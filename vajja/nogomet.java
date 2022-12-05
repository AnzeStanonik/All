import java.util.Scanner;
class nogomet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dogodek = null;
        int pricakovanDogodek = 2;
        String[] opisi = new String[2];
        int[] minute2 = new int[pricakovanDogodek];
        int[] minute3 = new int[pricakovanDogodek];
        int zaporednoStevilo = 0;
        while (dogodek == null || !dogodek.equals("konec")) {
            if (zaporednaStevila >= pricakovanDogodek) {
                pricakovanDogodek = pricakovanDogodek * 2;
                String[] opisiNovaTabela = new String[pricakovanDogodek];
                for(int i = 0; i < opisi.length; i++) {
                    opisiNovaTabela[i] = opisi[i];
                }
            }
            if(dogodek != null) {

            }
            dogodek = sc.nextLine();
            String[] vrednosti = dogodek.split("-");
            System.out.println(vrednosti[0] + ";" + vrednosti[1]);

            if (vrednosti.length != 2 ) {
                System.out.println("vpisali ste napacno!");
            } else {
                String minute = vrednosti[0].trim();
                String[] min = vrednosti[0].split(",");
                if (min.length != 2) {
                    System.out.println("vpisali ste napacno!");
                } else {
                    minute2[zaporednoStevilo] = Integer.parseInt(min[0]);
                    minute3[zaporednoStevilo] = Integer.parseInt(min[1]);
                    String dogodek2 = vrednosti[1].trim();
                }
            }
        }
        for (int i = 0; i < pricakovanDogodek; i++)
        System.out.println((i+1) + ": ");
        System.out.println(opisi[i]);
        System.out.println("(" + minute2[i]);
        if ( minute3[i] != 0) {
        System.out.println("Podajte minuto tekme:");
        }
        dogodek = sc.nextLine();
    }
}