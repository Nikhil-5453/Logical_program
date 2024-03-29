import java.util.*;

public class LinearSearchExample {
  public static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String a[]) {
    Scanner sc = new Scanner(System.in);
    int[] a1 = { 10, 20, 30, 50, 70, 90 };
    System.out.println("enter element to search");
    int key = sc.nextInt();
    System.out.println(key + " is found at index: " + linearSearch(a1, key));
  }
}