package code.simple;

/**
 * @author zouzhihua
 * @date 2019/10/12 14:15
 * @description q7
 * @since 2019-10-12
 **/
public class q7 {

    public static int reverse(int x) {
        int rpc = 0;
        while (x != 0) {
            int newrpc = rpc * 10 + x % 10;
            if ((newrpc - x % 10) / 10 != rpc) {
                return 0;
            }
            rpc = newrpc;
            x = x / 10;
        }
        return rpc;
    }

    public static void main(String args[]) {
        System.out.println(reverse(-123456));
    }

}
