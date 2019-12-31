import java.util.Scanner;

public class Main extends SelectionSort {
    public static Scanner stdin = new Scanner(System.in);
  //  public static SelectionSort ss = new SelectionSort();

    public static void main(String[] args){
        SelectionSort ss = new SelectionSort();
        BubbleSort bs = new BubbleSort();
        CountingSort cs = new CountingSort();
        InsertionSort is = new InsertionSort();

        boolean truth = true;
        while(truth){
            System.out.print("\n\nMenu:");
            System.out.print("\n(1)Add");
            System.out.print("\n(2)Sort");
            System.out.print("\n(3)Quit");

            System.out.print("\n\nWhat would you like to do?: ");

            String tempNum = stdin.nextLine().trim();
            int num = Integer.parseInt(tempNum);

            switch(num){
                case 1:
                    System.out.print("\nPlease provide the number of elements you would like to add: ");
                    String tempNumToAdd = stdin.nextLine().trim();
                    int numToAdd = Integer.parseInt(tempNumToAdd);

                    for(int i=0; i<numToAdd;i++){
                        System.out.print("\nWhat number would you like to add: ");
                        String tempNewNum = stdin.nextLine().trim();
                        double newNum = Double.parseDouble(tempNewNum);
                        ss.add(newNum);
                        bs.add(newNum);
                        cs.add(newNum);
                        is.add(newNum);
                        try {
                            is.printDataAfter();
                        } catch (Exception EmptyArrayException){
                            System.out.print("");
                        }
                    }
                    break;
                case 2:
                    System.out.print("\nHow would you like to sort the data: ");
                    System.out.print("\n\t(1) Selection Sort");
                    System.out.print("\n\t(2) Bubble Sort");
                    System.out.print("\n\t(3) Counting Sort");
                    System.out.print("\n\t(4) Insertion Sort");

                    System.out.print("\n\nWhat would you like to do?: ");
                    String tempAnswer = stdin.nextLine().trim();
                    int answer = Integer.parseInt(tempAnswer);
                    switch (answer){
                        case 1:
                            try {
                            ss.selectionSortData(); }
                            catch (Exception EmptyArrayException){
                                System.out.print("\nThere is nothing to sort.");
                            }
                            try{
                                ss.printDataAfter();
                            } catch (Exception EmptyArrayException){
                                System.out.print("");
                            }
                            break;
                        case 2:
                            try{
                                bs.BubbleSortData();
                            } catch (Exception EmptyArrayException){
                                System.out.print("\nThere is nothing to sort.");
                            }
                            try {
                                bs.printDataAfter();
                            } catch (Exception EmptyArrayException){
                            System.out.print("");
                              }
                            break;
                        case 3:
                            try{
                                cs.CountingSortData();
                            } catch (Exception EmptyArrayException){
                                System.out.print("\nThere is nothing to sort.");
                            }
                            try {
                                cs.printDataAfter();
                            } catch (Exception EmptyArrayException){
                                System.out.print("");
                            }
                        case 4:
                            try{
                                is.InsertionSortData();
                            } catch (Exception EmptyArrayException){
                                System.out.print("\nThere is nothing to sort.");
                            }
                            try {
                                is.printDataAfter();
                            } catch (Exception EmptyArrayException){
                                System.out.print("");
                            }
                            break;
                        default:
                            System.out.print("\nSorry that is not an option.");
                    }

                    break;
                case 3:
                    System.out.print("\nSorry to see you go. Have a good day!");
                    truth = false;
                    System.exit(0);
                    break;
                default:
                    System.out.print("\nSorry, that is not an option");
            }
        }
    }
}
