import java.util.*;
class Main {
  public static void main(String[] args) {
    int testScore = 0;
    String grade;
    System.out.println("Jeremy is NOT the goat");
    Scanner input = new Scanner( System.in );
    testScore = input.nextInt();
    if ( testScore >= 90 ){
      grade = "A";
    }else if ( testScore >= 80){
      grade = "B";
      }else if ( testScore >= 70){
      grade = "C";
      }else if ( testScore >= 60){
      grade = "D";
    }else{
      grade = "F ur a dum dum";
    }
    System.out.println("Grade=" +grade);
  }
}
//jeremy is a dum dum poopy nose so idiot i swaer not even OG sigma rizz
