public class NumberService {

    public static int rangeSum( int start, int finish ){
        int sum = 0;
        if(start > finish){
            for (int i=start; i>=finish; i--){
                sum = sum + i;
            }
        }else if(finish > start){
            for (int i=finish; i>=start; i--){
                sum = sum + i;
            }
        }else{
            if(start%2 == 0){sum = start;}
        }
        System.out.println("Start = " + start + " Finish = " + finish);
        System.out.println("The sum value of start + finish = " + sum);
        return sum;
    }


    public static int rangeEvenCount(int start, int finish) {
        int count = 0;
        if (start < finish)    {
            for (int i = start + 1; i <= finish; i++) {
                if (i % 2 == 0) count += i;
            }
        } if (finish < start) {
            for (int i = finish + 1; i <= start; i++) {
                if (i % 2 == 0) count += i;
            }
        }


        System.out.println("Start = " + start + " Finish = " + finish);
        System.out.println("Even number count: " + count );
        return count;
    }
}
