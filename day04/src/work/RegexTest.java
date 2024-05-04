package work;

import java.util.Arrays;

import static java.util.regex.Pattern.matches;

public class RegexTest {
    public static void main(String[] args) {

        String number = "18577446185";


//        String regex = "1[8-9][3-9][1-9]{6}\\d{2}";
//        System.out.println("regex.matches(number) = " + matches(regex,number));

        String qqNumberRegex = "^[1-5]\\d{4,11}";

        String qq = "3439754981";

        System.out.println("Qq.matches(QqNumberRegex) = " + qq.matches(qqNumberRegex));

        String content = "當面對1挑戰時4，堅持努5力很重要。逆境中的堅持和努8力能5夠塑造8更9堅強的自我，" +
                "也讓人34更有成就感。不論遇8777到多大的困3難，都要65相信自己8的能力0，積極面對並找31出解決63方法。努力不懈，終將收獲成功。";

        System.out.println("content.replaceAll(\"\\\\d\", \"\") = " + content.replaceAll("\\d", ""));

        System.out.println("Arrays.toString(content.split(\"\\\\d\")) = " + Arrays.toString(content.split("\\d")));

    }


}
