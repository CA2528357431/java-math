public class new01 {
    public static void main(String[] args){
        double pi = Math.PI;
        System.out.println(pi);

        int hk = Math.abs(-9);
        System.out.println(hk);

        int a = 10;
        int b = 20;
        int big = Math.max(a,b);
        System.out.println(big);
        int small = Math.min(a,b);
        System.out.println(small);


        long mid = Math.round(1.5);
        System.out.println(mid);
        // 四舍五入

        double up = Math.ceil(1.5);
        System.out.println(up);
        // 上入

        double down = Math.floor(1.5);
        System.out.println(down);
        // 下舍

        double ran = Math.random();
        System.out.println(ran);
        // 随机0-1
        // 用乘法加法控制范围随机
        // 想要随机整数？ 强制转化即可

        double p = Math.pow(3,5);
        System.out.println(p);
        // 指数

        double cos = Math.cos(pi);
        System.out.println(cos);
        // 弧度制求 各种 三角函数

        double acos = Math.acos(0);
        System.out.println(acos);
        // 弧度制求 各种 反三角函数

        double deg = Math.toDegrees(pi);
        System.out.println(deg);
        // 弧度转角度

        double rad = Math.toRadians(180);
        System.out.println(rad);
        // 角度转弧度


    }
}
