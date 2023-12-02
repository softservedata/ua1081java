package practical11.p3;

class Validation{

    public static void main(String[] args) {
        String[] name= { "Zunuk_1210", "Ev", "Very Long Name and s", "Bad name", "Зеник"};

        for (String s : name) {
            String regex = "_\\w{3,15}";
            if (s.matches(regex)) {
                System.out.println(s + " is a valid username");
            } else {
                System.out.println(s + " is not a valid username");
            }
        }
    }
}