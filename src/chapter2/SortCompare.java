package chapter2;

import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/21 10:44
 */
public class SortCompare {

    private static Insertion insertion = new Insertion();
    private static Selection selection = new Selection();
    private static Shell shell = new Shell();



    public static double time(String alg, Comparable[] a){
        Stopwatch timer = new Stopwatch();

        if(alg.equals("Insertion")){
            insertion.sort(a);
        }else if(alg.equals("Selection")){
            selection.sort(a);
        }else if(alg.equals("Shell")){
            shell.sort(a);
        }else if(alg.equals("Merge")){

        }else if(alg.equals("Quick")){

        }else if(alg.equals("Heap")){

        }

        return timer.elapsedTime();


    }


    public static double timeRandomInput(String alg, int N, int T){
        double total = 0.0;
        Double[] a = new Double[N];

        for(int t = 0; t < T ; t++){
            for(int i=0; i< N; i++){
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);

        }

        return total;

    }


    public static void main(String[]args){
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);

        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);

        StdOut.printf("For %d random Doubles\n    %s is ", N, alg1);
        StdOut.printf("%.1f times faster than %s\n", t2/t1, alg2);


    }
}
