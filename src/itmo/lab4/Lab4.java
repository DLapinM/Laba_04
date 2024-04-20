package itmo.lab4;

import java.util.Calendar;

public class Lab4
{
    public static void main(String[] args)
    {
        /** Лаба 4. Часть 1. Упражнение 1. */

        int[] myInts1 = MyMethods.GetArrayByFromToNumbers(1, 99);
        MyMethods.ShowNumbers(myInts1);

        int[] unEvenNumbers = MyMethods.GetUnEvenNumbers(myInts1);
        MyMethods.ShowNumbersOnNewStrings(unEvenNumbers);


        /** Лаба 4. Часть 1. Упражнение 2. */

        MyMethods.ShowNumbersWhichCanBeDividedByThreeAndFive();
        System.out.println("");

        /** Лаба 4. Часть 1. Упражнение 3. */

        MyMethods.InputNumbersAndCheckSum();


        /** Лаба 4. Часть 1. Упражнение 4. */

        MyMethods.InputNumbersAndCheckCondition();


        /** Лаба 4. Часть 1. Упражнение 5. */

        int[] arr1 = {3, 3, 8, 55, 54, 9, 10};
        int[] arr2 = {10, 3, 8, 55, 54, 9, 3};
        int[] arr3 = {3, 5, 3, 55, 54, 9, 3};
        int[] arr4 = {10, 5, 8, 55, 54, 3, 10};

        boolean bArr1 = MyMethods.CheckFirstAndLastNumbersOfArray(arr1, 3);
        boolean bArr2 = MyMethods.CheckFirstAndLastNumbersOfArray(arr2, 3);
        boolean bArr3 = MyMethods.CheckFirstAndLastNumbersOfArray(arr3, 3);
        boolean bArr4 = MyMethods.CheckFirstAndLastNumbersOfArray(arr4, 3);

        System.out.println(bArr1);
        System.out.println(bArr2);
        System.out.println(bArr3);
        System.out.println(bArr4);


        /** Лаба 4. Часть 1. Упражнение 6. */

        int[] arr5 = {3, 2, 7, 13, 8, 2, 7, 23};
        int[] arr6 = {4, 2, 37, 13, 8, 2, 7, 1};
        int[] arr7 = {4, 2, 3, 13, 8, 2, 1, 23};
        int[] arr8 = {4, 2, 5, 13, 8, 2, 55, 23};

        boolean bArr5 = MyMethods.CheckArrayContains(arr5, 1, 3);
        boolean bArr6 = MyMethods.CheckArrayContains(arr6, 1, 3);
        boolean bArr7 = MyMethods.CheckArrayContains(arr7, 1, 3);
        boolean bArr8 = MyMethods.CheckArrayContains(arr8, 1, 3);

        System.out.println("");
        System.out.println(bArr5);
        System.out.println(bArr6);
        System.out.println(bArr7);
        System.out.println(bArr8);


        /** Лаба 4. Часть 2. Упражнение 1. */

        int[] arr9 = {1, 3, 5, 6, 7, 10, 40, 50};
        int[] arr10 = {1, 3, 555, 6, 7, 10, 40, 50};
        int[] arr11 = {555, 3, 5, 6, 7, 10, 40, 50};
        int[] arr12 = {1, 3, 5, 6, 7, 10, 40, 0};
        System.out.println("");
        MyMethods.CheckArraySort(arr9);
        MyMethods.CheckArraySort(arr10);
        MyMethods.CheckArraySort(arr11);
        MyMethods.CheckArraySort(arr12);


        /** Лаба 4. Часть 2. Упражнение 2. */

        MyMethods.ArrayInput();


        /** Лаба 4. Часть 2. Упражнение 3. */

        int[] arr13 = {1, 3, 5, 6, 7, 10, 40, 50};
        System.out.println("");
        MyMethods.ShowNumbers(arr13);
        MyMethods.ReplaceFirstAndLastElementsOfArray(arr13);
        MyMethods.ShowNumbers(arr13);


        /** Лаба 4. Часть 2. Упражнение 4. */

        int[] arr14 = {2, 2, 7, 7, 7, 3, 3, 4, 8, 8, 11, 12, 15, 15};
        int[] arr15 = {1, 2, 3, 1, 2, 4};
        int[] arr16 = {1, 2, 3, 4, 5, 6, 7};

        int i1 = MyMethods.GetFirstUniqueNumber(arr14);
        int i2 = MyMethods.GetFirstUniqueNumber(arr15);
        int i3 = MyMethods.GetFirstUniqueNumber(arr16);

        System.out.println("");
        MyMethods.ShowNumbers(arr14);
        System.out.println(i1);
        MyMethods.ShowNumbers(arr15);
        System.out.println(i2);
        MyMethods.ShowNumbers(arr16);
        System.out.println(i3);
    }
}
