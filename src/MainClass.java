import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainClass {
    public static void main(String[] args) {

    Problems A = new Problems();
   /* int arr[] = {2,3,4,10,40};
    int n = arr.length;
    int x= 10;
    int result = A.BinarySearchR(arr, 0, n - 1, x);
    if (result == -1) System.out.println("Nu a fost gasit numarul");
        else System.out.println("Numarul a fost gasit la " + result);
     */

   /*int arr[] = {2 ,3,4, 10, 40,56,100,200,500,700};
   int n = arr.length;
   int x = 105;
   int result = A.BinarySearchI(arr, x);
    if (result == -1) System.out.println("error"    );
    else System.out.println("a fost gasit la index =" + result);*/

   //A.Palindrome();

    /*    List<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(11);
        list.add(22);
        list.add(33);
        System.out.println(list);
        System.out.println(A.findMax(list));
        System.out.println(A.findMin(list));*/

//int a[] = {1,2,3,4,5,6,7};
  //      System.out.println(A.minimum(a));

        Stack<Integer> stack = new Stack<Integer>();
        A.stack_push(stack);
        A.stack_pop(stack)  ;
        A.stack_peek(stack) ;


    }
}
