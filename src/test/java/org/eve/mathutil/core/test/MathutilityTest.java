/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.eve.mathutil.core.test;

import static org.eve.mathutil.core.MathUtility.*;//để khai báo các hàm static
//import org.eve.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author PC
 */
public class MathutilityTest {
    //test ngoai lệ:
    @Test
    public void testFactorialGivenWrongArgumentThrowEeception(){
        //hãy đưa đoạn code gây ra ngoại lệ 
        //exceptedType : ngoại lệ cần bắt
        //exectuable: đoạn code đưa ra ngoại lệ : là đưa 1 object chứa đoạn code gây E : --> lambda experesionn

        
        //interface chứa 1 hàm anonymust
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                getFactorial(-5);
            }
        };
        //lambda
        Executable exLambda = () -> getFactorial(-5);
        
        //bắt ngoại lệ
        assertThrows(IllegalArgumentException.class, exLambda);
        //cách chuyên nghiệp
        assertThrows(IllegalArgumentException.class, ()->getFactorial(-5));
    }

    @Test
    public void testFactorialGivenRightArguementReturnWell() {
        //assertEquals(69, 70);
//        assertEquals(1, MathUtility.getFactorial(0));
//        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));

    }
}
