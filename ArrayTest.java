public class ArrayTest{
  public static void main(String[]args){
    int[] anArray = new int[11];

    //1 print the array variable
    System.out.println("part 1:" + anArray);

    //Part 2 Write the loop to initialize it
    for (int i=0;i<anArray.length;i++) {
      anArray[i] = 100 + 10*i;
    }
    //print anArray[0], anArray[5],anArray[10] to see if it worked
    System.out.println("part 2:"+ anArray[0]+" " +anArray[5]+" "+anArray[10]);

    //Part 3 Write a loop to print it out (on one line)
    System.out.println("part 3:");
    for (int i = 0;i<anArray.length;i++) {
      System.out.print(anArray[i]+ " ");
    }
  }
}
