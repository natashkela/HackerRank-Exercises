
/*
Problem Description: https://www.hackerrank.com/challenges/30-class-vs-instance
*/

public class Person {
    private int age;	
  
	public Person(int initialAge) {
        this.age = initialAge;
  		// Add some more code to run some checks on initialAge
        if(initialAge<0){
            initialAge=0;
            System.out.println("Age is not valid, setting age to 0.");
        }
	}

	public void amIOld() {
        String result="";
  		// Write code determining if this person's age is old and print the correct statement:
        if(age<13){
            result="You are young.";
        }
        else if(age>=13&&age<18){
            result="You are a teenager.";
        }
        else{
            result="You are old.";
        }
        System.out.println(result);
	}

	public void yearPasses() {
  		age=age+1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
