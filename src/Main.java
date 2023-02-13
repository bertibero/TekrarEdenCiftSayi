import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for(int i: arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int [] list = {2, 2, 5, 6, 7, 9, 15, 12, 12, 20, 27, 30, 30};
        int [] evenDuplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++ ){
                if((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)){
                    if(!isFind(evenDuplicate, list[i])){
                        evenDuplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value :evenDuplicate){
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}