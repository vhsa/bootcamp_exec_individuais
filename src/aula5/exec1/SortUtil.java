package aula5.exec1;

import java.util.Arrays;

public class SortUtil {
    public static <T> T sort (Precedente <T>[] arr){
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j].precedeA((T) arr[j + 1]) < 0 ) {
                    Precedente<T> aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
        return (T) Arrays.toString(arr);
    }
}
