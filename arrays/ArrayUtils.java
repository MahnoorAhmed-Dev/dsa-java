public class ArrayUtils {

  public static void reverseInPlace(int[] arr) {
    int j = arr.length - 1;
    int i = 0;

    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }

  }

  public static int findMax(int[] arr) {

    if (arr.length == 0) {
      throw new IllegalArgumentException("Cannot find max of an empty array");
    }

    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int findMin(int[] arr) {
    
    // TODO
  }

  public static boolean hasDuplicates(int[] arr) {
    // TODO
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    reverseInPlace(arr);
    System.out.println(java.util.Arrays.toString(arr));

    System.out.println(findMax(arr));
  }
}