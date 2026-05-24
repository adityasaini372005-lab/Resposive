public class Recursion2 {
  public static void towerofHanoi(int n, String src, String helper, String dest) {
    if (n == 1) {
      System.out.println("transfer disk" + n + "from" + src + "to" + dest);
      return;
    }
    towerofHanoi(n - 1, src, dest, helper);
    System.out.println("transfer disk" + n + " from " + src + " to " + dest);
    towerofHanoi(n - 1, helper, src, dest);
  }
}
// public static void printRev(String str, int idx){
// if(idx==0){
// System.out.println(str.charAt(idx));
// return;
// }
// System.out.print(str.charAt(idx));
// printRev(str, idx-1);
// }
// public static void main(String[] args) {
// int n=3;
// towerofHanoi(n,"S","H","D");
// String str="abcdefgh";
// printRev(str,str.length()-1);
// }
// }
