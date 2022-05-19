package labTotay;

public class Student {
	/**
	 * Khai báo các trường dùng để lưu giá trị của các thuộc tính trong lop
	 */
   private int id;
   private String name;
   private boolean gender;
   /**
    * Constructor ko có đối số
    */
   public Student() {
   
   //to do:
   this.id = -1;
   this.name="noname";
   this.gender=true;
   }
   /**
    * Constructor có đối số
    */
   public Student(int id,String name, boolean geander) {
	   this.id=id;
	   this.name=name;
	   this.gender=gender;
   }
   public int getId() {
	   return this.id;
   }
   public void setId(int value) {
	   this.id=value;
   }
   public String getName() {
	   return this.name;
   }
   public void setName(String value) {
	   this.name=value;
   }
   public boolean isMale() {
	   return this.gender;
   }
   public void setMale(boolean value) {
	   this.gender=value;
   }
   public void printInfo() {
	   System.out.println("--------------------");
	   System.out.println("| ID |             NAME            | Male |");
	   System.out.printf("| %d | %s | %b |\n",this.id,this.name,this.gender);

   }
}
/**
 * Lớp Client sử dụng lớp Student để xây dựng chương trình Java theo kịch bản
 *@author(your name)
 *@version(a version number or a date)
**/
