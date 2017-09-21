package chapter2;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/21 11:12
 */
public class Shell extends Example{
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;

        int h = 1;

        while( h < N/3){
            h = 3*h + 1;
        }

        while(h >= 1){


            for(int i=h; i< N ;i++){
                int j=i;
                Comparable t = a[j];
                for(; j >= h && less(t, a[j-h]); j-=h){
                    a[j] = a[j-h];
                }
                a[j] = t;
            }

            h = h/3;
        }



    }
}
