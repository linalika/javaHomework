package homework2;

public class Task1 {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] myarr = {{"3","4","5"}, {"erf"}, {"rf"}};
        checkArrLength(myarr);

    }

    public static void checkArrLength( String arr[][] ) throws MyArraySizeException, MyArrayDataException {
        int sum =0;
        int number = 0;
        if(arr.length!=4 && arr[0].length!=4){
            throw new MyArraySizeException("Неверный размер массива");
        }

        for(int i =0;i<arr.length;i++){
            for (int j=0;j< arr[i].length;i++){
                try {
                     number =  Integer.parseInt(arr[i][j].trim());
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j);
                }

                sum += number;
            }
        }
    }
}
