package chapter2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/19 9:59
 */
public abstract class Example {


    public abstract void sort(Comparable[] a);

    protected boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    protected void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    protected void show(Comparable[] a){
        for(int i=0; i < a.length; i++){
            StdOut.print(a[i] + " ");
        }
        StdOut.println();

    }

    public boolean isSorted(Comparable [] a){
        for(int i=1; i< a.length; i++){
            if(less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }



}
