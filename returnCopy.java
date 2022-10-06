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
    return copy;
  }
  public static int[] concatArray(int[]ary1,int[]ary2) {
    int totalLength = ary1.length+ary2.length;
    int[] total = new int[totalLength];
    //add ary1 first
    for (int i = 0;i<ary1.length;i++) {
      total[i]=ary1[i];
    }
    //add ary2
    for (int i=0;i<ary2.length;i++) {
      total[i+ary1.length] = ary2[i];
    }
    return total;
  }
  public static void main(String[] args) {
    //test returnCopy
    int[] ary = {1,2,3};
    System.out.println(aryToString(returnCopy(ary)));

    //test concatArray
    int[] ary1 = {1,2,3};
    int[] ary2 = {4,5,6};
    System.out.println(aryToString(concatArray(ary1,ary2)));
  }
}
