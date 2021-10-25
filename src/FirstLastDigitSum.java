public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int num2 = number;
        int firstDigit = 0;
        int lastDigit = number % 10;

        if(   num2 < 0   ){
            return -1;
        }
        if (num2 > 0 && num2 < 10){
            return num2++;
        }
            while (num2 >= 10){
            num2 /= 10;
            firstDigit = num2;
        }
        
        return firstDigit + lastDigit;
        
    }
}
