public class student
 {
 public static void student(String studentName,char grade)
  {
    System.out.println("Student name is "+studentName);
    System.out.println("Student grade is "+grade);
  }
 public static void student(int id,String studentName,char grade)
  {
    System.out.println("Student ID is "+id);
    System.out.println("Student name is "+studentName);
    System.out.println("Student grade is "+grade);
  }
 public static void student(int id,String studentName,char grade,int standerd,String gender)
  {
    System.out.println("Student ID is "+id);
    System.out.println("Student name is "+studentName);
    System.out.println("Student grade is "+grade);
    System.out.println("Student standers is "+standerd);
    System.out.println("Student gender is "+gender);
  }
  public static void main(String[]args)
  {
    //student Obj=new student();
    student("Aftab",'A');
    System.out.println("------------*--------------");
    student(2, "Samir", 'B');
    System.out.println("------------*--------------");
    student(18, "gaurav", 'A',10,"Male");

  }
}