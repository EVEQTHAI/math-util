/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.eve.mathutil.main;

import org.eve.mathutil.core.MathUtility;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tets thông qua các test case:

        // testcase 1 :(tên, mục đích của test case) check if getF() return well with n = 0
        //Steps/Procedures(các bước tiến hành)
        //      1.Given n=0
        //      2.execute getF(n=0)
        //expected value :getF(0) : 0! must return 1
        //      OR
        //      input n = 0 to the function/method
        //      run the method to get the actual value of 0
        //      expected 0! must be is 1, expected value = 1
        System.out.println("Check getF(0) | Expected: 1 | actual: " + MathUtility.getFactorial(0));

        //test case 2: check if getF() return well with n = 1
        //Steps/Procedures(các bước tiến hành)
        //      1.Given n=1
        //      2.execute getF(n=2)
        //expected value :getF(0) : 1! must return 1
        System.out.println("Check getF(1) | Expected: 1 | actual: " + MathUtility.getFactorial(1));

        //test case 3: check if getF() return well with n = 2
        System.out.println("Check getF(2) | Expected: 2 | actual: " + MathUtility.getFactorial(2));

        //test case 4: check if getF() return well with n = 3
        System.out.println("Check getF(3) | Expected: 6 | actual: " + MathUtility.getFactorial(3));

        //test case 5: check if getF() return well with n = 5
        System.out.println("Check getF(5) | Expected: 120 | actual: " + MathUtility.getFactorial(5));
        
        //Âm giai thừa
        //thiết kế hàm giai thừa ÂM và lớn hon 20! thì sẽ không tính được và ném ra ngoại lệ
        //test case 6: check if getF() return well with n = -1
        System.out.println("Check getF(-1) | Expected: Exception | actual: ");
        MathUtility.getFactorial(-1);//vì ngoại lệ sẽ ngắt câu lệnh println() nên in trước rồi check 
        

    }
    //TDD: test Driven Development: viết code, làm app theo stype
    //code và test song hàng với nhau
    //code và test là cặp bài trùng, code liên tục được test
    //phải nghĩ ngay các bộ test case dù đang viết code
    //Đặt trưng: xanh - đỏ

}
