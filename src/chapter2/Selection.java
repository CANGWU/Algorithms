package chapter2;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/19 10:24
 */
public class Selection extends Example {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;


        for(int i=0; i< N; i++){
            int min = i;
            for(int j = i+1; j< N; j++){
                if(less(a[j], a[min])){
                    min = j;
                }
            }
            exch(a, i, min);
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
