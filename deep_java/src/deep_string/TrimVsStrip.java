package deep_string;

/**
 * trim与strip比较
 *
 * @author ning.dr@foxmail.com
 * @date 2021/8/12 20:43
 */
public class TrimVsStrip {

    public static void main(String[] args) {
        // \u2000 对应字符：\
        // python的strip与java的strip效果一致，java的trim不识别\u2000（对应字符：\）为空字符
        String testStr = "\u2000 345";
        System.out.println(testStr.length() + "==" + testStr.strip().length());
        // 5==3
        System.out.println(testStr.length() + "==" + testStr.trim().length());
        // 5==5

        // \u0020 对应字符：\
        testStr = "\u0020 345";
        System.out.println(testStr.length() + "==" + testStr.strip().length());
        // 5==3
        System.out.println(testStr.length() + "==" + testStr.trim().length());
        // 5==3

        testStr = "\t 345";
        System.out.println(testStr.length() + "==" + testStr.strip().length());
        // 5==3
        System.out.println(testStr.length() + "==" + testStr.trim().length());
        // 5==3

        testStr = "\r 345";
        System.out.println(testStr.length() + "==" + testStr.strip().length());
        // 5==3
        System.out.println(testStr.length() + "==" + testStr.trim().length());
        // 5==3

        testStr = "\n 345";
        System.out.println(testStr.length() + "==" + testStr.strip().length());
        // 5==3
        System.out.println(testStr.length() + "==" + testStr.trim().length());
        // 5==3
    }

}
