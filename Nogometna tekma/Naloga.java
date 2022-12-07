import java.util.Scanner;
class Naloga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dogodek = new String[Byte.MAX_VALUE];
        String[] cas = new String[Byte.MAX_VALUE];
        String[] kaj = new String[Byte.MAX_VALUE];
        String[] min1 = new String[Byte.MAX_VALUE];
        String[] min2 = new String[Byte.MAX_VALUE];
        int i = 0;
        dogodek[0] = "Vnesi podatke:";
        System.out.println(dogodek[0]);
        while (!dogodek[i].equals("konec")) {
            i++;
            dogodek[i] = sc.nextLine();
            String[] del = dogodek[i].split("-");
            cas[i] = del[0].trim();
            kaj[i] = del[1].trim();
            String[] min = cas[i].split(".");
            min1[i] = min[0];
            min2[i] = min[1];
        }
        System.out.println("Vsi dogodki tekme:");
        for(int j = 1; j < dogodek.length; j++ ) {
            System.out.println(j + ". " + kaj[j] + " (" + min1[j] + min2[j] + "Minut)");
        }
    }
}