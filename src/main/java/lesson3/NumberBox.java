package lesson3;

public class NumberBox<T extends Number> {
    private T[] numbers;

    public NumberBox(T[] numbers) {
        this.numbers = numbers;
    }

    public T[] getNumbers() {
        return numbers;
    }

    public void setNumbers(T[] numbers) {
        this.numbers = numbers;
    }

    public double calcAverage(){
        double sum = 0.0;
        for (T num : numbers){
            sum  +=num.doubleValue();
        }
        return sum/numbers.length;
    }
}
