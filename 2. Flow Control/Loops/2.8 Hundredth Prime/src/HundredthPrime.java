public class HundredthPrime {
   public static void main(String[] args) {
      int count = 0;
      int number = 2;

      while (count < 100) {
         boolean isPrime = true;
         if (number <= 1) {
            isPrime = false;
         } else {
            for (int i = 2; i * i <= number; i++) {
               if (number % i == 0) {
                  isPrime = false;
                  break;
               }
            }
         }
   if (isPrime){
      count++; //when the count is 100 the program stops and show the number
      if (count == 100) {
         System.out.println(number); //we show the hundredth prime number.

      }
   }
         number++;
      }
   }
}









