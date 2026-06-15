package Assessment;

//Write a program to count the number of vowels in a given string. string="Hello"

public class vowelsCount_in_string {
    public static void main(String[] args) {
        String str = "Hello";
        int count = 0;

        str = str.toLowerCase(); // convert to lowercase

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels in 'Hello' = " + count);
    }
}