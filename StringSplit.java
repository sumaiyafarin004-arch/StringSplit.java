public class StringSplit {
    public static void main(String[] args) {
        String text = "Java is very easy";
        String[] words = text.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}