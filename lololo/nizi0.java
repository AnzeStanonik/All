class nizi0 {
    public static void main(String[] args) {
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
        System.out.println(nizConcat);

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
            String.join("", "split1", "split2")
        );

        //replace- rešlaceAll
        String nizReplace = "replace";
        System.out.println(
            nizReplace.replace('r', ' ')
        );
        System.out.println(
            nizReplace.replaceAll("re", "")
        );

        //trim
        String nizTrim = "trim";
        System.out.println(
            nizTrim.trim().concat("med")
        );

        //toUpperCase - toLowerCase
        String toUperCase = "toUpperCase";
        System.out.println(
            nizToUpperCase.toUpperCase()
        );
    }
}