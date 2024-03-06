import javax.print.DocFlavor;
import java.lang.StringBuilder;

public class StringBufferBuilder {
    public static void main(String[] args) {
    String str = "JAVA-CLASS";

    //1: Reverse the input word and change it to lowercase
    StringBuilder reversedstr = new StringBuilder();
    reversedstr.append(str.toLowerCase()).reverse();
    System.out.println("1. Splitting the word: " + reversedstr);

    //2 & 3: Split the reversed word
        int hyphenIndex = reversedstr.indexOf("-");
        String firststr = reversedstr.substring(0, hyphenIndex);
        String secondstr = reversedstr.substring(hyphenIndex + 1);

        System.out.println("2. Splitter First: "+ firststr);
        System.out.println("3. Splitter Second: "+ secondstr);

        // 4: Reverse first and second string
        StringBuilder reversedFristStr = new StringBuilder(firststr).reverse();
        StringBuilder reversedSecondStr = new StringBuilder(secondstr).reverse();

        System.out.println("4. Splitter First in Correct Order: " + reversedFristStr);
        System.out.println("5. Splitter Second in Correct Order: " + reversedSecondStr);

        //6: Replace '-' with '_' and convert to UPPERCASE
        String finalStr = reversedSecondStr + "_" + reversedFristStr;
        System.out.println("6. Final Word: " + finalStr.toUpperCase());
    }
}
