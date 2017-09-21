package chapter1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/15 10:29
 */
public class ThreeSumFast {

    public static int count(int [] a){
        int N = a.length;
        int count = 0;

        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N ; j++){
                if(BinarySearch.rank(-a[i]-a[j],  a) > j){
                    count++;
                }
            }
        }


        return count;
    }

    public static  void main(String[]args){

        int [] a = In.readInts(args[0]);
        Stopwatch stopwatch = new Stopwatch();
        StdOut.println(count(a));
        StdOut.println("runtime is " + stopwatch.elapsedTime());
    }

}
