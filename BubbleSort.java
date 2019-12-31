public class BubbleSort {


    public static void sort(double[] array) {
        int length = array.length;
//        if(length==0){
//            throw new EmptyArrayException();
//        }
        for(int i=0; i<length-1;i++){
            for(int j=0; j<length-i-1;j++){
                if(array[j]>array[j+1]){
                    double temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }

}
