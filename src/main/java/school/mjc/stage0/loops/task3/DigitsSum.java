package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        int s=0;
        int c,a,b;
        
        b= (t < 0) ? -1*t: t;
        String str = "" + b;
        while (b>0) {
            a = b%10;
            s+=a;
            b = b/10;
        }

        // String[] arrOfStr =  String.valueOf(b).split("");

        // for (String k: arrOfStr){
        //     c = Integer.parseInt(k);
        //     s+=c;

        // }
        // int i=str.length();
        // while ( i >0) {
        //     s+= b%10;
        //     b = b/10;
        //     i--;
        // }

        System.out.println(s);
    }


    public static void main(String[] args){
        DigitsSum m = new DigitsSum();
        m.printDigitsSum(2234);
    }
}
