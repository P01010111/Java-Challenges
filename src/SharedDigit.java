public class SharedDigit {
    public static boolean hasSharedDigit(int firstNum, int secondNum){

        int digit2 = firstNum % 10;
        int digit = firstNum / 10;
        int digita2 = secondNum % 10;
        int digita = secondNum / 10;

        if(   (firstNum < 10 || firstNum > 99)   ||   (secondNum < 10 || secondNum > 99)   ){
            return false;
        }
        if(
            (digit2 == digita) ||
            (digit == digita) ||
            (digit2 == digita2) ||
            (digit2 == digita)
        ){
            return true;
        }
        return false;
    }
}