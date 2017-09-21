package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/15 11:31
 */
public class QuickUnionUF extends UF{
    public QuickUnionUF(int N) {
        super(N);
    }

    @Override
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);


        if(pRoot == qRoot) return;

        id[pRoot] = qRoot;
        count--;



    }

    @Override
    public int find(int p) {
        while ( p != id[p]) p = id[p];
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
