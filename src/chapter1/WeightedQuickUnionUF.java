package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/19 9:24
 */
public class WeightedQuickUnionUF extends UF{
    private int[] id;
    private int[] sz;
    private int count;


    public WeightedQuickUnionUF(int N){
        super(N);
        count = N;

        id = new int[N];
        sz = new int[N];

        for(int i= 0; i< N ; i++){
            id[i] = i;
            sz[i] = 1;

        }
    }


    public int count(){
        return count;
    }

    @Override
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if(i == j) return;

        if( sz[i] < sz[j]){
            id[i] = id[j];
            sz[j] += sz[i];
        }else {
            id[j] = id[i];
            sz[i] += sz[j];
        }
        count--;

    }


    public int find(int p) {
        while (p != id[p]){
              p = id[p];
        }

        return p;
    }


    public static void main(String[]args){
        int N = StdIn.readInt();
        UF uf = new QuickFindUF(N);

        for(int i=0; i< N; i++){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if( uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }

        StdOut.println(uf.count() + " components");



    }




}
