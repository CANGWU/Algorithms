package chapter2;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/19 13:15
 */
public class Insertion extends Example {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;


        for(int i=1; i< N; i++){
            int j=i;
            Comparable t = a[j];
            for(; j > 0 && less(t,a[j-1]);j--){
                a[j] = a[j-1];
            }
            a[j] = t;
        }
    }


    public static void main(String[]args){
        Example example = new Selection();

        String[] temp = {"bed", "bug","yes", "zoo", "all", "bad", "yet"};

        example.sort(temp);

        assert example.isSorted(temp);

        example.show(temp);


    }
}
