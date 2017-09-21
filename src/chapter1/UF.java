package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/15 10:49
 */
public abstract class UF {

    protected int[]id;
    protected int count;


    public UF(int N){
        count = N;
        id = new int[N];
        for(int i = 0; i < N; i++ ){
            id[i] = i;
        }
    }


    public int count(){
        return count;
    }

    public boolean connected(int p, int q){
        return  find(p) == find(q);
    }

    public abstract void union(int p, int q);

    public abstract int find(int p);




}
