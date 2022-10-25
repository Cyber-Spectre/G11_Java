public class recur {

    public static void main(String[] args){
        //System.out.println(m(8));
        //System.out.println(r(8));
        //System.out.println(gR(687421));
        //System.out.println(r2(11));
        //System.out.println(r3(13));
        dW(2);
    }

    public static double m(int x){
        if(x > 0){
            return x + m(x - 1);
        }
        return x;
    }

    public static int r(int x){
        if(x > 15){
            return x / 2;
        }
        else{
            return r(r(x * 3));
        }
    }

    public static int gR(int num){
        //System.out.println(num);
        if (num < 100){
            return 10 * ((num + 5) / 10);
        }
        return 10 * gR(num / 10);
    }

    public static int r2(int x){
        //GAHBAJ METHOD
        if(x >= 0){
            return x + r2(x - x % 2);
        }
        return 0;
    }

    public static String r3(int val){
        if(val == 0){
            return "";
        }
        if(val % 2 == 0){
            return r3(val / 2) + "f";
        }
        else{
            return r3(val / 2) + "t";
        }
    }

    public static void dW(int num){
        if(num < 15){
            dW(num + 4);
            System.out.println(num + " ");
        }
    }

}