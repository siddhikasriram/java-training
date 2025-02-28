public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr1.length];
        
        // Copy elements of arr1 to arr2
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        System.out.println("Array 2 elements:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}




// arraycopy() parameters and what they mean:
// 1. arr1 (source array) - The array from which elements are to be copied.
// 2. 0 (starting index in the source array) - The index in arr1 from where copying starts.
// 3. arr2 (destination array) - The array where the elements from arr1 will be copied to.
// 4. 0 (starting index in the destination array) - The index in arr2 where the elements will be placed.
// 5. arr1.length (number of elements to copy) - The number of elements to copy from arr1 to arr2.
// 