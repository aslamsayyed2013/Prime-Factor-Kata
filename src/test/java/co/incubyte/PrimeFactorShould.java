package co.incubyte;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorShould {

    @Test
    void check_for_prime_factor_for_1(){
        assertEquals(List.of(),PrimeFactor.isPrimeFactor(1));
    }

    @Test
    void check_for_prime_factor_for_2(){
        assertEquals(List.of(2),PrimeFactor.isPrimeFactor(2));
    }
    @Test
    void check_for_prime_factor_for_3(){
        assertEquals(List.of(3),PrimeFactor.isPrimeFactor(3));
    }
    @Test
    void check_for_prime_factor_for_4(){
        assertEquals(List.of(2,2),PrimeFactor.isPrimeFactor(4));
    }
    @Test
    void check_for_prime_factor_for_5(){
        assertEquals(List.of(5),PrimeFactor.isPrimeFactor(5));
    }
    @Test
    void check_for_prime_factor_for_6(){
        assertEquals(List.of(2,3),PrimeFactor.isPrimeFactor(6));
    }
    @Test
    void check_for_prime_factor_for_8(){
        assertEquals(List.of(2,2,2),PrimeFactor.isPrimeFactor(8));
    }
    @Test
    void check_for_prime_factor_for_9(){
        assertEquals(List.of(3,3),PrimeFactor.isPrimeFactor(9));
    }
    @Test
    void check_for_prime_factor_for_12(){
        assertEquals(List.of(2,2,3),PrimeFactor.isPrimeFactor(12));
    }
    @Test
    void check_for_prime_factor_for_64(){
        assertEquals(List.of(2,2,2,2,2,2),PrimeFactor.isPrimeFactor(64));
    }
    @Test
    void check_for_prime_factor_for_74(){
        assertEquals(List.of(2,37),PrimeFactor.isPrimeFactor(74));
    }
}
