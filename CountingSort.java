public class CountingSort {
    private double[] array;
    private int capacity;
    private int numElements;
    private double[] orig;

    //I create the array of doubles
    public CountingSort(){
        numElements = 0;
        capacity=1;
        array = new double[capacity];
    }

    public void add(double newNum){
        //I add values to the array
        if(numElements==0){
            //there is nothing present in the array
            array[0] = newNum;
            numElements++;
        } else {
            //I expand the capacity and add the new element
            int length = array.length;
            double[] temp = new double[length+1];
            for(int i=0;i<length;i++){
                temp[i] = array[i];
            }
            temp[length] = newNum;
            array = temp;
            numElements++;

        }
    }

    public void CountingSortData() throws EmptyArrayException{
        if(numElements==0){

            throw new EmptyArrayException();
        }
        int length = array.length;
        int[] count = new int[0];
        //int tick = 0;
        for(int i =0; i<length; i++){
            int length2 = count.length;

            int temp = (int)array[i];

            if(temp>=length2){

                //I expand the array size
                int[] newTemp = new int[temp+1];
                for(int m=0;m<newTemp.length;m++){
                    System.out.print("\nM: " + m);
                }
                for(int j=0; j<length2; j++){
                    newTemp[j] = count[j];
                }
                count = newTemp;
            }
            count[temp] = count[temp] + 1;

        }
        int countLength = count.length;

        int[] start = new int[countLength];
        for(int m=0;m<countLength;m++){
            //I find the starting position

            if(m==0){
                start[m] = 0;
            } else {
                start[m] = start[m-1] + count[m-1];
            }
        }

        for(int j=0; j<countLength;j++){

            if(count[j]>0){
                for(int t=0; t<count[j];t++){

                    array[start[j] + t] = j;
                }
            }
        }
    }

    public void printDataAfter() throws EmptyArrayException{
        if(numElements==0){
            throw new EmptyArrayException();
        }
        System.out.print("\n");
        for(int i=0; i<=numElements; i++){
            System.out.print("\t" + array[i]);
        }
    }
}
