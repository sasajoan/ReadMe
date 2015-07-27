public class SimpleAddition {
  public static void main(String[] args) {
    if(args.length == 2) {
      int arg1 = Integer.parseInt(args[0]);
      int arg2 = Integer.parseInt(args[1]);
      int sum = arg1 + arg2;
      System.out.println(arg1 + " + " + arg2 + " = " + sum);
    } else {
      System.out.println("Usage: java SimpleAddition <int1> <int2>");
      System.out.println("Prints the sum of int1 and int2.");
      System.out.println("Example: java SimpleAddition 3 4");
      System.out.println("7");
  }
}
