/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.eve.mathutil.core.test;

import org.eve.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author PC
 */
public class MathUtility_DDT_Test {
    
    public static Object[][] initTestData(){
        
        Integer testData[][]={{0,1},
                              {1,1},
                              {2,2},
                              {3,6},
                              {5,120}};
        
        return testData;
    }
    //nhồi data ở trên vào hàm assertEquals(expected-cột 1, getF(cột 0))
    
    //tham số hóa
    @ParameterizedTest
    //lấy data ở mãng
    @MethodSource("initTestData")
    public void testFactorialDrivenRightAgumentReturnWell(int n, long expected){
        assertEquals(expected,MathUtility.getFactorial(n));
    }

}
//kĩ thuật DDT :Data Driven Testing : tách data ra khỏi câu lệnh Assert() cho dễ theo dõi và bảo trì 
//thường dùng mãng 2 chiều để chứa bộ test
//mãng 2 chiều thường gồm các INPUT và EXPECTED
//các UNIT test FRAMEWORK tự động biết cách trích từng cặp 
//INPUT/EXPECTED ở trong mãng rồi nhòi vào hàm so sánh.

//Mãng dữ liệu test case phải là PUBLIC STATIC - QUY ƯỚC