package com.company;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> myList1 = new MyList<>((a, b) -> {
            if (((int)a.getValue() - (int)b.getValue()) > 0) {
                return 1;
            }
            else if (((int)a.getValue() - (int)b.getValue()) < 0) {
                return -1;
            }
            else
                return 0;
        });

        myList1.add(12);
        myList1.add(15);
        myList1.add(2);
        myList1.add(9);
        myList1.add(1);
        myList1.add(19);

        System.out.println(myList1);
        myList1.sort();
        System.out.println(myList1);





        MyList<String> myList2 = new MyList<>( (a, b) -> {
            char[] s1 = a.getValue().toString().toCharArray();
            char[] s2 = b.getValue().toString().toCharArray();
            int i = 0;
            while ( (i < (s1).length) && (i < (s2).length) ) {
                if (s1[i] > s2[i])
                    return 1;
                else if (s1[i] < s2[i])
                    return -1;
                else
                    i++;
            }
            return 0;
        });

        myList2.add("bfgh");
        myList2.add("sxf");
        myList2.add("nm");
        myList2.add("gxf");
        myList2.add("axgn");
        myList2.add("cg");

        System.out.println(myList2.toString());
        myList2.sort();
        System.out.println(myList2.toString());

    }
}
