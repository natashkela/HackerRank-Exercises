int comfortableNumbers(int L, int R) {
  if(L==R)
        return 0;
 
    int a = L;
    int b = a + 1;
    int sumA = 0;
    int pairs = 0;
    LinkedList<String> listPairs = new LinkedList<String>();
    while (a < R) {
        String aStr = String.valueOf(a);
        int aX = 0;
 
        while (aX < aStr.length()) {
            sumA = sumA + Integer.parseInt(aStr.charAt(aX)+"");
            aX = aX + 1;
        }
        while (b <= R) {
            String bStr = String.valueOf(b);
            int bX = 0;
                int sumB = 0;
 
            while (bX < bStr.length()) {
                sumB = sumB + Integer.parseInt(bStr.charAt(bX)+"");
                bX = bX + 1;
            }
 
            if((b >= a - sumA) && (b <= a + sumA)&&
              (a >= b - sumB) && (a <= b + sumB)) {
                pairs = pairs + 1;
            }
 
            b = b + 1;
        }
 
        a = a + 1;
        b = a + 1;
        sumA = 0;
    }
    return pairs;
}
