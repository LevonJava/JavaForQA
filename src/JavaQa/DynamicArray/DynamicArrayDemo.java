package JavaQa.DynamicArray;

import java.util.ArrayList;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray arr1 = new DynamicArray(7);
        arr1.add(0, 11);
        arr1.add(1, 22);
        arr1.add(2, 33);
        arr1.add(3, 44);
        arr1.add(4, 55);
        arr1.add(5, 11);
        arr1.add(6, 55);

        DynamicArray arr2 = new DynamicArray(10);
        arr2.add(0, 125);
        arr2.add(1, -1);
        arr2.add(2, 127);
        arr2.add(3, 127);
        arr2.add(4, 333);
        arr2.add(5, 44);
        arr2.add(6, 127);
        arr2.add(7, 125);
        arr2.add(8, 12);
        arr2.add(9, 128);

        DynamicArray arr3 = new DynamicArray();

        System.out.println("arr1: " + arr1);
        System.out.println("arr2: " + arr2);
        System.out.println("arr3: " + arr3);
        arr2.addArr(new int[]{200, 201, 202, 203});
        System.out.println(arr2);
//        System.out.println(arr1.indexOf(55));
//        System.out.println(arr2.lastIndexOf(55));
//        System.out.println(arr1);
//        arr1.removeByValue(55);
//        System.out.println(arr1);
//        arr1.removeByValue(55);
//        System.out.println(arr1);
//        System.out.println(arr2);

//        System.out.println(arr2.getCapacity());
//        System.out.println(arr2.getLength());
////        System.out.println("index of this value " + arr2.getIndex(777));

//
//        arr2.contains(arr1);
//        System.out.println("After arr2.add(arr1): " + arr2.contains(arr1));
//
//        arr1.add(arr3);
//        System.out.println(arr1);
//
//        System.out.println("After arr1.add(arr3): " + arr1.contains(arr3));

//        System.out.println("Before add " + arr2.contains(arr1));
//
//        arr2.add(10, arr1);
//        System.out.println(arr2);
//        arr2.add(16, arr1);
//        System.out.println(arr2);
//        int[] newMasiv = {9, 10, 11};
//        arr2.addArr(newMasiv);
//        System.out.println(arr2);


//        arr1.add(arr2);

//        arr1.addArr(24, new int[]{-9, -10, -11, -12, -13,-14,-15,-16, -17, -18});
//        arr2.addArr(new int[]{9, 10, 11, 1234});
//        System.out.println(arr1.contains(arr2));
//        System.out.println(arr2.contains(arr3));

//        System.out.println(arr2.contains(arr2));

//        System.out.println("After add " + arr2.contains(arr1));

//        try {
//            arr1.valueOf(-1);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
////        System.out.println(arr1.valueOf(23));
//        System.out.println("After call valueOf");

    }
}
