public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        // int reverse = 0;
        // int firstDigit = 0;
        // while(number > 0)
        // {
        //     int lastDigit = number % 10;
        //         while(number > 0){
        //             firstDigit += lastDigit;
        //             firstDigit *= 10;
        //             reverse += firstDigit;
        //     }
        //     number /= 10;
        // }

        // if(number == reverse){
        //     return true;
        // } return false;

 number = Math.abs(number);
int number2 = number;
int reverse = 0;
 
while (number2 > 0) {
reverse = (number2 % 10) + (reverse * 10);
number2 /= 10;
 }
 }
}
