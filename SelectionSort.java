public class SelectionSort {

    public static void sort(double[] array){
        int length = array.length;
//        if(length==0){
//            throw new EmptyArrayException();
//        }

        for (int i=0; i<length; i++){

            double min;
            int locationMin = i;

            for(int j=(i+1);j<length; j++){
                    //I found a value that is less than the one I'm looking at
                    //I check if the value is less than the min
                if(array[locationMin]>array[j]){
                    locationMin = j;

                }
            }

            //I swap the present value with the min

            min = array[locationMin];
            array[locationMin] = array[i];
            array[i] = min;


        }
    }

}
