/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eve.mathutil.core;

/**
 *
 * @author PC
 */
//clne cái class java.util.Math của jdk
public class MathUtility {
    public static  final double PI=3.1415;
    
    //ham tinh n! =1,2,..n
    //0!=1!=1
    //k giai thua am
    //21! vuot kieu long
    //khong chap nhan n > 20
    //gài ràng buộc đầu cho hàm 
//    public  static long getFactorial(int n){
//        //TODO
//        long product =1 ;//tích ban đầu bằng 1
//        if(n<0 || n>20) throw new IllegalArgumentException("Invalid n . n must be between 0..20,plasese!!!");
//        
//        if(n==0 || n==1){
//            return 1;
//        }else{
//            for (int i = 2; i <= n; i++) {
//                product*=i;
//            }
//        }
//        return  product;
//        //return sớm để hàm không báo lỗi
//    }
        public  static long getFactorial(int n){
        if(n<0 || n>20) throw new IllegalArgumentException("Invalid n . n must be between 0..20,plasese!!!");
        
        if(n==0 || n==1){
            return 1;
        }
        return  n*getFactorial(n-1);
    }
}
