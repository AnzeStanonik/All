class Vaja {
    public static void main(String[] args) {
        int[] a = new int[] {12, 13, 14, 15, 20};
        int[] b = new int[10];
        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < b.length; i++){
                if (i < a.length) {
                b[i] = a[i];
                }else{
                    b[i] = a[i-5];
                }
            System.out.println(b[i]);
        }
        String newStr = "hello";
char[] newCharArray = new char[] { 'h', 'e', 'l', 'l', 'o' };
String strFromChar = new String(newCharArray); // ustvarimo niz iz tabele znakov
System.out.println(strFromChar);
String helloStr = "Hello, world!"; // inicializacija
System.out.println(helloStr.substring(0, 5)); // niz po izrezu
if (newStr.equals("hello")) {
    System.out.println("niza se ujemata");
} // preverimo ujemanje in ugotovimo, da se niza ujemata
String str = null;
if (str == null) { // str lahko primerjamo z null
    System.out.println("vrednost spremenljivke str je null");
} else {
    // ta blok dosežemo samo kadar ima spremenljivka str nastavljen niz
    System.out.println(str.length());
}
String first = "Hello";
String second = "world";
String combined = first + ", " + second + "!";
System.out.println(combined);
String niz = "vrednost1";
        String niz2 = new String("vrednst2");
        String prazenNiz = null;

        //charAt
        String nizCharAt = "CharAt";
        System.out.println(
            nizCharAt.charAt(2)
        );

        //compareTo
        String nizCompareTo = "compareTo";
        System.out.println(
            nizCompareTo.compareTo(nizCharAt)
        );

        //concat
        String nizConcat = "concat";
        System.out.println(
            nizConcat.concat(" nova vrednost")
        );
        System.out.println(
            nizConcat + " nova vrednost"
        );
        System.out.println(nizConcat);

        StringBuffer sb = new StringBuffer("niz");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);

        //contains
        String nizContains = "contains";
        System.out.println(
            nizContains.contains("tac")
        );

        //endsWith - startsWith
        String nizEndsWith = "endsWith";
        System.out.println(
            nizEndsWith.endsWith("th")
        );

        //split
        String nizSplit = "split1 split2";
        String[] vrednost = nizSplit.split(" ");
        System.out.println(vrednost.length);
        System.out.println(vrednost[1]);
        System.out.println(vrednost[0]);

        //join
        System.out.println(
            String.join(" ", "split1", "split2")
        );

        //replace- replaceAll
        String nizReplace = "replace";
        System.out.println(
            nizReplace.replace('r', ' ')
        );
        System.out.println(
            nizReplace.replaceAll("re", "  ")
        );

        //trim
        String nizTrim = "   tr    im    ";
        System.out.println(
            nizTrim.trim().concat("med")
        );

        //toUpperCase - toLowerCase
        String toUpperCase = "toUpperCase";
        System.out.println(
            toUpperCase.toUpperCase()
        );
        StringBuilder sl = new StringBuilder("world");
sl.insert(0, "Hello");
System.out.println(sl);
sl.insert(5, ", ");
System.out.println(sl);
System.out.println(sl.append('!'));
System.out.println(sl);

String slStr = sl.toString();
System.out.println(slStr);
// Največja vrednost
System.out.println (Long.MAX_VALUE + "\n" +
Integer.MAX_VALUE+ "\n"+
Byte.MAX_VALUE+"\n"+
Short.MAX_VALUE+"\n"+
Double.MAX_VALUE+"\n"+
Float.MAX_VALUE+"\n"+
Character.MAX_VALUE+"\n"+

// Najmanjša vrednost
Long.MIN_VALUE+"\n"+
Integer.MIN_VALUE+"\n"+
Byte.MIN_VALUE+"\n"+
Short.MIN_VALUE+"\n"+
Double.MIN_VALUE+"\n"+
Float.MIN_VALUE+"\n"+
Character.MIN_VALUE+"\n"+

// Velikost v bitih, ki jo zaseda vrednost
Long.SIZE+"\n"+
Integer.SIZE+"\n"+
Byte.SIZE+"\n"+
Short.SIZE+"\n"+
Double.SIZE+"\n"+
Float.SIZE+"\n"+
Character.SIZE 

// Vrednost ključne funkcionalnosti podatkovnega tipa
);
int o = 9;
System.out.println(Math.round(Math.sqrt(o)));
    }
}