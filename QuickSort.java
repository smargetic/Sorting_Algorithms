public class QuickSort {
    private double[] array;
    private int capacity;
    private int numElements;
    private double[] orig;

    //I create the array of doubles
    public QuickSort(){
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

    public void QuickSortData() throws EmptyArrayException{
        if(numElements==0){
            throw new EmptyArrayException();
        }
        double pivot = array[0];


    }
}
