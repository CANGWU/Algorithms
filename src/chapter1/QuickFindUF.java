package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/15 11:08
 */
public class QuickFindUF extends UF {
    public QuickFindUF(int N) {
        super(N);
    }

    @Override
    public void union(int p, int q) {

        int pId = find(p);
        int qId = find(q);

        if(pId == qId) return;

        for(int i = 0 ; i < id.length ;i++){
            if( pId == id[i]) id[i] = qId;
        }
        count--;



    }

    @Override
    public int find(int p) {
        return id[p];
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
