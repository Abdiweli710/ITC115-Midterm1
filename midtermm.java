public class PowerOfTwo {
       // main not required for the answer on the test
       public static void main(String[] args) {
for (int i=0; i<100; i++) { if (isPowerOfTwo(i)) {
System.out.println(i); }
if (isPowerOfTwoA(i)) { System.out.println(i);
} }
}
       // a couple of possible solutions
       public static boolean isPowerOfTwo (int n) {
int reduced = n; if (n<1) {
               return false;
           }
while (reduced>1) {
if (reduced%2 == 0) {
reduced = reduced/2; } else {
                   return false;
               }
}
           return true;
       }
public static boolean isPowerOfTwoA (int n) { int pow = 1;
while (pow<=n) { if (n==pow) {
                   return true;
               }
pow = 2*pow; }
           return false;
       }
}
