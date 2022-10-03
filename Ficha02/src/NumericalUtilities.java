public class NumericalUtilities {
    public static int powerOf(int base, int exponent){
        int result = base;
        for (int i = 1; i < exponent; i++){
            result = result * base;
        }
        return result;
    }

    public static int sumOfNaturalNumbersUpTo(int limit){
        int total = 1;
        for (int i = 2; i <= limit;i++){
            total += i;
        }
        return total;
    }

    public static int sumOfNaturalNumbersBetween(int start, int end){
        int total = start;
        for (int i = start + 1; i <= end;i++){
            total += i;
        }
        return total;
    }

    public static int sumOfEvenNumbersBetween(int start, int end){
        int total = 0;
        for (int i = start; i <= end;i++){
            if (i % 2 == 0){
                total += i;
            }
        }
        return total;
    }
    public static int numberOfDivisorsOf(int number) {
        int count = 0;
        for (int i = 1; i <= (number*number); i++) {
            if (number % i == 0) {
                if (number / i == i){
                    count++;
                }


                else {
                    count += 2;
                }
            }
        }
        return count;
    }
    public static void isPrime(int n){
        int m = 0, flag = 0;
        m = n / 2;
        if( n == 0 || n == 1){
            System.out.println(n+" is not prime number");
        }
        else{
            for(int i = 2; i <= m; i++){
                if(n % i == 0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag == 0)  {
                System.out.println(n+" is prime number");
            }
        }
    }
}
