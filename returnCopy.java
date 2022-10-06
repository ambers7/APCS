public class returnCopy{
  public static int[] returnCopy(int[]ary) {
    int[] copy = new int[ary.length];
    for (int i = 0;i<ary.length;i++) {
      copy[i]=ary[i];
    }
    return copy;
  }
  public static String aryToString(int[] nums) {
    String copy = "";
    for (int i = 0;i<nums.length;i++) {
      if (i!= nums.length-1) {
        copy += nums[i] + ", ";
      } else {
        copy += nums[i];
      }
    }
  }
  public static void main(String[] args) {
    int[] ary = {1,2,3};
    System.out.println(returnCopy(ary));
  }
}
