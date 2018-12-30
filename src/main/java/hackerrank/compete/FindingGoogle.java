package hackerrank.compete;

public class FindingGoogle {

    public static void main(String[] args) {
        String google = "g()()GI3";
        //System.out.println(google.replaceAll("E|3", "e"));
        System.out.println(findlingGoogle(google));
    }

    static boolean findlingGoogle(final String input) {
        String google = input;
        String replacedGoogle = google.replaceAll("3", "e")
                .replaceAll("I", "l")
                .replaceAll("\\(\\)|\\[\\]|<>|O|0","o");
        System.out.println(replacedGoogle);
        return replacedGoogle.equalsIgnoreCase("google");
    }
}
