package chapter1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/15 10:06
 */
public class ThreeSum {

    public static void main(String[]args){

        int [] a = In.readInts(args[0]);
        StdOut.println(count(a));



    }

    public static int count(int[] a){
        int N = a.length;
        int count = 0;


        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                for(int k = 0; k < N; k++){
                    if(a[i] + a[j] + a[k] == 0){
                        count++;
                    }
                }
            }
        }
        return  count;
    }


}
