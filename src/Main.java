public class Main {
    public static void main(String[] args) {

        Publications doc1 = new Books ("10", "A.S. Pushkin", 56, "Globus");
        Publications doc2 = new Journal("20", "Murzilka", "ABS");
        Publications doc3 = new Books();

        System.out.println("***** method 1: number1 from Books *****");
        doc1.number1();
        System.out.println();

        System.out.println("***** method 2: number2 from Books *****");
        doc1.number2();
        System.out.println();

        System.out.println("***** method 3: number1 from Journal *****");
        doc2.number1();
        System.out.println();

        System.out.println("***** method 4: number2 from Journal - Publications *****");
        doc2.number2();

    }
}
