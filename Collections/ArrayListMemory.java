import java.util.*;

public class ArrayListMemory {

        void main(){
            ArrayList list = new ArrayList();
            print(list);
            Object[] arr = new Object[10];
            int size = 0;
            print(arr);
            //list.add(10);
            arr[size++] = 10;
            //list.add("deva");
            arr[size++]="deva";
            print(arr);
            list.add(10);
            list.add("Deva");
            print(list);
        }

        void print(ArrayList list){
            System.out.print("[");
            for(Object l:list){
                System.out.print(" "+l+" ");
            }
            System.out.print("]");
            System.out.println();
        }
        void print(Object[] arr){
            System.out.print("{");
            for(Object a:arr){
                System.out.print(" "+a+" ");
            }
            System.out.println("}");
            System.out.println();
        }

}
