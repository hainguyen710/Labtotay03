package labTotay;

		public class Client {
			public static void main(String[] args) {
				Student studentA;
				Student studentB;
				Student studentC;
				studentA= new Student();
				studentB=new Student(1,"Nguyen Văn A",true);
				studentC=new Student(2,"Nguyen Van C", true);
				studentC.printInfo();
				studentB.printInfo();
				
				studentB.setName("Nguyen Van B");
				studentB.setMale(true);
				studentB.printInfo();
		}
	}

