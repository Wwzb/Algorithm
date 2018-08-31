/**
 * 递归的应用
 */
public class Recursion {
    //三角数
    public static int triangle(int n){
        if(n == 1){
            return 1;
        }else {
            return n + triangle(n - 1);
        }
    }
    //斐波那契数列
    public static int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }else {
            return fibonacci(n - 1) + fibonacci(n -2);
        }
    }
    //汉诺塔
    public static void solvHanoiTower(int topN,char from,char inter,char to){
        if(topN == 1){
            System.out.println("圆盘1从"+from+"塔到"+to+"塔");
        }else {
            solvHanoiTower(topN - 1, from, to, inter);
            System.out.println("圆盘"+topN+"从"+from+"塔到"+to+"塔");
            solvHanoiTower(topN - 1, inter, from, to);
        }
    }
}
