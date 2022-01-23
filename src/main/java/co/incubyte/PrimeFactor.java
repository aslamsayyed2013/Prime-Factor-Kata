package co.incubyte;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public static List<Integer> isPrimeFactor(int number) {
        List<Integer> primeFactors = new ArrayList();
        int divisor=2;
        while(number > 1){
            while(number%divisor==0){
                primeFactors.add(divisor);
                number=number/divisor;
            }
            divisor++;
        }
        return primeFactors;
    }
}
