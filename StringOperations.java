//Luke Mason
//Ap Comp Sci A Pd 3
//8/28/19
public class StringOperations{
  public static void main(String args[]){
    //Challenge 1 Reverses word such that the second half comes before the first
    String word = "Scissors";
    int length = word.length();
    int halfLength = length/2;
    String reverse = word.substring(halfLength+1) + word.substring(0,halfLength);
    System.out.println(reverse);

    //Challenge 2 I kind of did the ascii art, didn't really feel like doing the whole thing
    System.out.println("   ------------\n   /           /\n  /      -----/\n /     /\n/_____/");
  }

}
//backslash