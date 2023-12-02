package practical11.p1;

class Verify {

    public static void main(String[] args) {

        String s1 = "SoftServe";
        String s2 = "SoftServe Academy";
        verify(s1, s2);

    }
    public static void verify(String s1, String s2) {
        System.out.println("Is the first variable a substring of the second variable?");
        if (s2.contains(s1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}