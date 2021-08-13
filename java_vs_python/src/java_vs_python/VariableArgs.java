package java_vs_python;

import java.util.List;

/**
 * 可变参数
 *
 * @author ning.dr@foxmail.com
 * @date 2021/8/13 20:04
 */
public class VariableArgs {

    public static void main(String[] args) {
        testVariableArgs("111");
        testVariableArgs("222", 1, 2, 3, 4);
    }

    public static void testVariableArgs(String arg1,  Integer... args) {
        System.out.println(arg1);
        if (args != null && args.length > 0) {
            List.of(args).forEach(System.out::println);
        }
    }

}
