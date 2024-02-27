//package DSA;

class Factorial {
    // factorial of no 4! = 4*3*2*1=24
    static int fact(int num)
    {
        int res =  1;
        for (int i = 1;i<=num;i++)
        res = res * i;
        return res;
    }
    public static void main (String []args){
        int num = 5;
        System.out.println (fact(5));

    }
}
