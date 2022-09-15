package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        int s=0;
        int b;
        
        b= (t < 0) ? -1*t: t;
        String str = "" + b;

        for (int i = 0; i < str.length(); i++) {
            s+= b%10;
            b = b/10;
        }
        System.out.println(s);
    }


}
