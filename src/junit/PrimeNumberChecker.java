package junit;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumberChecker {


           public static void main(String[] args) {
            int start = 1;
            int end = 100;

            System.out.println("Prime numbers between " + start + " and " + end + ":");
            int primeCount = 0;
            for (int num = start; num <= end; num++) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    primeCount++;
                }
            }
            System.out.println("\nTotal prime numbers found: " + primeCount);
        }

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        @Test
        public void testIsPrime() {
            assertTrue(isPrime(2));
            assertTrue(isPrime(3));
            assertTrue(isPrime(5));
            assertTrue(isPrime(7));
            assertTrue(isPrime(11));

            assertFalse(isPrime(1));
            assertFalse(isPrime(4));
            assertFalse(isPrime(6));
            assertFalse(isPrime(8));
            assertFalse(isPrime(9));
            assertFalse(isPrime(10));
        }
    }

