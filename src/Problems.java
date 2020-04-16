import java.util.*;

public class Problems {

    public static void Fibbonaci() {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int i;
        int count = 10;
        System.out.print(n1 + " " + n2);

        for (i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }


    public int BinarySearchR(int arr[], int l, int r, int x){

    if (r>=l){
        int mid = l + (r-l) / 2;
            if(arr[mid] == x)
                return mid;
            if(arr[mid] > x)
                return BinarySearchR(arr, l, mid - 1, x);

            if(arr[mid] < x)
                return BinarySearchR(arr, mid + 1, r, x);
    }
        return -1;
    }


    public int BinarySearchI(int arr[], int x){
        int l = 0 , r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) return m;
            if (arr[m] > x) {r = m- 1;} else l = m+ 1;
        }
        return -1;
    }


    public static void Palindrome(){
      int r, sum=0, temp;
      int n = 454;
      temp = n;

      while(n>0){
          r = n%10;
          sum=(sum*10) + r;
          n=n/10;

      }if (temp==sum) System.out.println("Palindrome este");
        else System.out.println("Palindrome nu este");
    }

    public static Integer findMin(List<Integer> list){
            if (list == null || list.size() == 0) {return Integer.MAX_VALUE;}
        //     List<Integer> sortedlist = new ArrayList<>(list );
          //  Collections.sort(sortedlist);
            //return sortedlist.get(0);
        return Collections.min(list);
    }

    public static Integer findMax(List<Integer> list){
        if(list == null || list.size() == 0) return Integer.MIN_VALUE;
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList.get(sortedList.size()-1);
    }

    int maximum (int a[]){
        int max = -1;
        for(int i=0; i<a.length; i++){
            if(a[i] > max) {max= a[i];}
        }
        return max;
    }

    int minimum(int a[]){
        int min = a[0];
        for (int i=0; i<a.length; i++){
            if (a[i] < min) {min = a[i];    }
        } return min;
    }

    static void stack_push(Stack<Integer> stack){
        for(int i = 0 ; i< 5; i++){ stack.push(i);}
    }
    static void stack_pop(Stack<Integer> stack){
        System.out.println(" Pop: ");
        for (int i =0 ; i< 5; i++){
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }
    static void stack_peek(Stack<Integer> stack){
        Integer element = (Integer) stack.peek();
        System.out.println("element on stack top: " + element);
    }




}
