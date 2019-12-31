public class InsertionSort {

    public static void sort(double[] array) {
        int length = array.length;
//        if(length==0){
//            throw new EmptyArrayException();
//        }
        for(int i=1; i<=length; i++){
            int location = 0;
            boolean truth = false;
            //If the number I'm looking at is less than the max number of the sorted section,
            //I need to find out where to place it
            if(array[i]<array[i-1]){
                for(int j=0; j<i; j++){
                    if(array[j]>array[i]){
                        //I figure out the spot to put the number
                        location = j;
                        truth = true;
                        break;
                    }
                }
                //I shift the array
                double[] temp = new double[length];
                if(truth ==true) {

                    for (int m = 0; m < location; m++) {
                        //I transfer the values of the old array
                        temp[m] = array[m];
                    }
                    temp[location] = array[i];

                    for (int t = (location + 1); t <= i; t++) {
                        temp[t] = array[t-1];
                    }
                    for (int t = (i + 1); t < length; t++) {
                        temp[t] = array[t];
                    }
                    array = temp;
                }
            }
        }
    }

}
