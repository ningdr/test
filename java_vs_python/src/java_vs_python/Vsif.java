package java_vs_python;

/**
 * if对比
 *
 * @author ning.dr@foxmail.com
 * @date 2021/8/11 18:09
 */
public class Vsif {

    public static void main(String[] args) {
        int x = 4, y = 3;
        int small = x;
        if (x > y) {
            small = y;
        }
        System.out.println("small = " + small);

        String a = "\u0020  aaa";
        System.out.println(a.length() + "--" + a.strip().length());
        System.out.println(a.length() + "--" + a.trim().length());
        System.out.println("  aaa  ".stripLeading());
    }

}
