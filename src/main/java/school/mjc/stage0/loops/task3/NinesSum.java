package school.mjc.stage0.loops.task3;
import java.lang.Math;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int s=0,k=0;
        double a=9;
        for (int i = 1; i <= lengthOfLastNumber; i ++) {
            s+=a;
            a = Math.pow(10, i)*9; 
            k+=s;
        } 
        System.out.println(k);

        
    }

    public static void main(String[] args){
        NinesSum m = new NinesSum();
        m.calculateSum(5);
    }
}
