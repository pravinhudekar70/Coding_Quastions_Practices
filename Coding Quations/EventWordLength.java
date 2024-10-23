public class EventWordLength {
    public static void main(String[] args) {
        String str = "hi rahul have you lunch";

        for (String s : str.split(" ")) {
            if (s.length() % 2 == 0)
                System.out.println(s);
        }
    }
}
