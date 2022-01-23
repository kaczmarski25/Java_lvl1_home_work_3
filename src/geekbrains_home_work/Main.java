package geekbrains_home_work;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        numberSubstitution();
        array1to100();
        arrayX6();
        diagonals();
        len_initialValue();
        arrayMinMax();
        arraySumm();
//        shiftArray();
        }
    public static void numberSubstitution(){
        int[] arr1 = {0,1,0,1,1,0,0,1,1};
        System.out.println("Первоначальный массив "  + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++){
            if (arr1 [i] == 0)
                arr1 [i] = 1;
            else arr1 [i] = 0;
        }
        System.out.println("Измененный массив " + Arrays.toString(arr1));
    }

    public static void array1to100(){
        int[] arr2 = new int[100];
        for ( int i = 0; i < arr2.length; i++){
            arr2[i] = i +1;
        }
        System.out.println("Полученный массив " + Arrays.toString(arr2));
    }

    public static void arrayX6(){
        int[] arr3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println("Первоначальный массив "  + Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++){
            if (arr3 [i] < 6)
                arr3 [i] = arr3[i] * 2;
        }
        System.out.println("Измененный массив " + Arrays.toString(arr3));
    }

    public static void diagonals(){
        int [][] arr4 = new int [5][5];
        for (int i = 0; i < arr4.length; i ++){
            for (int j = 0; j < arr4.length; j ++) {
                if (i == j || i + j == 4)
                    arr4[i][j] = 1;
                else arr4[i][j] = 0;
                System.out.print(arr4[i][j]);
            }
            System.out.println();
            }


    }

    public static void len_initialValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите числовое значение для заполнения массива: ");
        int initialValue = scanner1.nextInt();
        scanner.close();
        scanner1.close();
        int [] arr5 = new int[len];

        for (int i = 0; i < arr5.length; i++){
            arr5[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr5));
    }

    public static void arrayMinMax(){
        int arr6[] = {1,6,0,12,6,9,10};
        System.out.println(Arrays.toString(arr6));
        int maxarr = arr6 [0];
        for (int i = 0 ; i < arr6.length; i++){
            if (arr6[i] > maxarr)
                maxarr = arr6[i] ;
        }
        System.out.println("Максимальное  число массива  " + maxarr);
        int minarr = arr6[0];
        for (int i = 0; i < arr6.length; i++){
            if (arr6[i] < minarr)
                minarr = arr6[i];
        }
        System.out.println("Минимальное число массива  " + minarr);
    }

    public static boolean arraySumm(){
        int arr7 [] = {1,3,4,2,2,1,2,1};
        int sumLeftToRight = 0;
        for (int i = 0 ; i < arr7.length; i++) {
            sumLeftToRight = sumLeftToRight + arr7[i];
        }
        int sumRightTiLeft = 0;
        for (int j = 0; j > arr7.length; j--){
            sumRightTiLeft = sumRightTiLeft + arr7[j];
        }
        if (sumLeftToRight == sumRightTiLeft);
        return true;
    }

//    public static void shiftArray(){
//            int arr8[] = {1,4,7,0,3,2,5,6};
//            int arr9[] = new int[7];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите числовое значение для заполнения массива: ");
//        int shiftValue = sc.nextInt();
//        System.out.println("Первоначальный вид массива " + Arrays.toString(arr8));
//        int n = shiftValue;
//        if (n >= 0){
//        for (int i = 0; i < arr8.length; i ++ ) {
//            arr9[i] = arr8[i + n];
//        }
//        }
////        }else if (n < 0){
////        for (int i = n; i < arr8.length; i --){
////            arr8[i] = arr8[i-n];
////        }
////        }
//        System.out.println("Измененный массив " + Arrays.toString(arr9));
//    }


    }

