// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class ArrayApplications {
    public static void main(String[] args) {
        // Finding element in array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int search = 5;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        // Finding maximum element in array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array is: " + max);

        // Finding minimum element in array
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in array is: " + min);

        // Finding sum of elements in array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements in array is: " + sum);

        // Finding second largest element in array
        int max1 = arr[0];
        int max2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println("Second largest element in array is: " + max2);

        // Rotating array by left to right
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        System.out.println("Array after rotating left to right: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        // Inserting an element in array
        int insert = 10;
        int pos = 3;
        int arr1[] = new int[arr.length + 1];
        for (int i = 0; i < arr1.length; i++) {
            if (i < pos) {
                arr1[i] = arr[i];
            } else if (i == pos) {
                arr1[i] = insert;
            } else {
                arr1[i] = arr[i - 1];
            }
        }
        System.out.println("Array after inserting element: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        // Deleting an element in array
        int del = 3;
        int arr2[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < del) {
                arr2[i] = arr[i];
            } else if (i > del) {
                arr2[i - 1] = arr[i];
            }
        }
        System.out.println("");
        System.out.println("Array after deleting element: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        // Copying array
        int arr3[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        System.out.println("");
        System.out.println("Array after copying: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        // Copy array in reverse order
        int arr4[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr4[i] = arr[arr.length - i - 1];
        }
        System.out.println("");
        System.out.println("Array after copying in reverse order: ");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }
    }
}
