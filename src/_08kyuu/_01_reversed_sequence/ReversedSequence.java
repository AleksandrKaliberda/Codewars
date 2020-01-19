package _08kyuu._01_reversed_sequence;

/*
Description:
Get the number n (n>0) to return the reversed sequence from n to 1.
Example : n=5 >> [5,4,3,2,1]

JUnit test: OK
 */
public class ReversedSequence {

    public static void main(String[] args) {

        int[]arr=reverse(5);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

        public static int[] reverse(int n){
            int[]arr=new int[n];
            //i will count from 0 to <n
            //x will count from n to 1
            for(int i=0, x=n; i<n; i++){
                arr[i]=x;
                x--;
            }
            return arr;
        }
}
