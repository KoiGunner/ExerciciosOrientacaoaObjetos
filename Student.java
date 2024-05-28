package Entities;

public class Student {
    public String name;
    public int mat;
    public double av1;
    public double av2;
    public double av3;
    final double passMedia = 60;
    public double media;

    public void mediaStudent(){
        media = av1 + av2 + av3;

        if(media < 60){
            System.out.print("FINAL GRADE: " + media);
            System.out.println();
            System.out.print("FAILED");
            System.out.println();
            System.out.println("MISSING " + (passMedia - media) + " POINTS");
        }
        else {
            System.out.print("FINAL GRADE " + media);
            System.out.println();
            System.out.print("PASS");
        }
    }
}
