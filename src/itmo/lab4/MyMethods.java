package itmo.lab4;

import java.util.Calendar;
import java.util.Scanner;

public class MyMethods
{
    public static int[] GetArrayByFromToNumbers(int n1, int n2)
    {
        if (n2 > n1)
        {
            int q = n2 - n1 + 1;

            int[] arr_rez = new int[q];

            int n = n1;
            for (int i = 0; i < q; i++)
            {
                arr_rez[i] = n;
                n++;
            }

            return arr_rez;
        }
        else
        {
            int[] arr_rez = new int[1];
            arr_rez[0] = n1;
            return arr_rez;
        }
    }

    public static int[] GetUnEvenNumbers (int [] nums)
    {
        int q = 0;
        for (int num : nums)
        {
            if (num % 2 != 0) q++;
        }

        int[] nums_new = new int[q];
        int i = 0;

        for (int num : nums)
        {
            if (num % 2 != 0)
            {
                nums_new[i] = num;
                i++;
            }
        }

        return nums_new;
    }

    public static void ShowNumbers (int [] nums)
    {
        for (int num : nums)
        {
            System.out.print(num + " ");
        }

        System.out.println("");
    }

    public static void ShowNumbersOnNewStrings (int [] nums)
    {
        for (int num : nums)
        {
            System.out.println(num);
        }
    }

    public static int[] GetNumbersWhichCanBeDividedByThree(int a, int b)
    {
        int q = 0;
        for (int i = a; i <= b; i++)
        {
            if (i % 3 == 0)
            {
                q++;
            }
        }

        int[] ints_new = new int[q];

        int j = 0;
        for (int i = a; i <= b; i++)
        {
            if (i % 3 == 0)
            {
                ints_new[j] = i;
                j++;
            }
        }

        return ints_new;
    }

    public static int[] GetNumbersWhichCanBeDividedByFive(int a, int b)
    {
        int q = 0;
        for (int i = a; i <= b; i++)
        {
            if (i % 5 == 0)
            {
                q++;
            }
        }

        int[] ints_new = new int[q];

        int j = 0;
        for (int i = a; i <= b; i++)
        {
            if (i % 5 == 0)
            {
                ints_new[j] = i;
                j++;
            }
        }

        return ints_new;
    }

    public static int[] GetNumbersWhichCanBeDividedByThreeAndFive(int a, int b)
    {
        int q = 0;
        for (int i = a; i <= b; i++)
        {
            if ((i % 3 == 0) && (i % 5 == 0))
            {
                q++;
            }
        }

        int[] ints_new = new int[q];

        int j = 0;
        for (int i = a; i <= b; i++)
        {
            if ((i % 3 == 0) && (i % 5 == 0))
            {
                ints_new[j] = i;
                j++;
            }
        }

        return ints_new;
    }

    public static void PrintNumbersWhichCanBeDividedByThreeAndFive(int a, int b)
    {
        System.out.println("");
        System.out.println("Начальное число последовательности: " + a);
        System.out.println("Конечное число последовательности: " + b);
        System.out.print("Делится на 3: ");
        int[] nums1 = GetNumbersWhichCanBeDividedByThree(a, b);
        ShowNumbers(nums1);

        System.out.print("Делится на 5: ");
        int[] nums2 = GetNumbersWhichCanBeDividedByFive(a, b);
        ShowNumbers(nums2);

        System.out.print("Делится и на 3, и на 5: ");
        int[] nums3 = GetNumbersWhichCanBeDividedByThreeAndFive(a, b);
        ShowNumbers(nums3);
    }

    public static boolean CheckSum(int n1, int n2, int n3)
    {
        int sum = n1 + n2;

        boolean rez = (sum == n3);

        return rez;
    }

    public static void InputNumbersAndCheckSum()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Введите первое число: ");
        int n1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int n2 = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int n3 = scanner.nextInt();

        boolean b = CheckSum(n1, n2, n3);

        System.out.println("Результат: ");
        System.out.println(b);
        System.out.println("");
    }

    public static boolean CheckCondition(int n1, int n2, int n3)
    {
        boolean rez = ( (n2>n1) && (n3>n2) );
        return rez;
    }

    public static void InputNumbersAndCheckCondition()
    {
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("");
        System.out.println("Введите первое число: ");
        int n1 = scanner2.nextInt();

        System.out.println("Введите второе число: ");
        int n2 = scanner2.nextInt();

        System.out.println("Введите третье число: ");
        int n3 = scanner2.nextInt();

        boolean b = CheckCondition(n1, n2, n3);

        System.out.println("Результат: ");
        System.out.println(b);
        System.out.println("");
    }

    public static boolean CheckFirstAndLastNumbersOfArray(int[] someArray, int n)
    {
        boolean isFirst = false;
        boolean isLast = false;

        int q = 0;
        for (int a : someArray)
        {
            if ((q == 0)&&(a == n))
            {
                isFirst = true;
            }
            q++;
        }

        int i = 0;
        for (int a : someArray)
        {
            if ( (i == (q-1) ) && (a == n) )
            {
                isLast = true;
            }
            i++;
        }

        return ( isFirst || isLast );
    }

    public static boolean CheckArrayContains(int[] arr, int n1, int n2)
    {
        for (int a : arr)
        {
            if (a == n1 || a == n2) return true;
        }

        return false;
    }

    public static boolean CheckArraySort(int[] arr)
    {
        int a1 = 0;

        int i = 0;
        for (int a : arr)
        {
            if (i > 0)
            {
                if (a < a1)
                {
                    System.out.println("Please, try again");
                    return false;
                }
            }

            a1 = a;
            i++;
        }

        System.out.println("OK");
        return true;
    }

    public static void ArrayInput()
    {
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("");
        System.out.println("Введите длину массива: ");
        int q = scanner3.nextInt();

        int[] arr = new int[q];

        int i = 0;

        for (int a : arr)
        {
            System.out.println("");
            System.out.println("Введите " + (i+1) + " элемент массива: ");
            arr[i] = scanner3.nextInt();

            i++;
        }

        System.out.println("");
        System.out.println("Результат: ");
        ShowNumbers(arr);
    }

    public static void ReplaceFirstAndLastElementsOfArray(int[] arr)
    {
        int q = 0;

        for (int a : arr)
        {
            q++;
        }

        int firstElement = arr[0];
        int lastElement = arr[q-1];

        arr[0] = lastElement;
        arr[q-1] = firstElement;
    }

    public static int GetFirstUniqueNumber(int[] arr)
    {
        for (int n : arr)
        {
            int a1 = 0;

            int q = 0;
            for (int a : arr)
            {
                if (a == n)
                {
                    a1 = a;
                    q++;
                }
            }
            if (q == 1)
            {
                return a1;
            }
        }

        return 0;
    }
}
