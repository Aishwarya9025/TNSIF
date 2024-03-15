import java.util.Scanner;
class StudentDriver 
{
	public static void main(String[] args) 
	{
		boolean exit=true;
		while(exit)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("choose your option");
		System.out.println("1.Hosteller\n2.DayScholar\n3.exit");
		int option = sc.nextInt();
		
		

		switch(option)
		{
			case 1:
			{
				System.out.println("Student Id:");
				int studentId = sc.nextInt();

				System.out.println("Student Name:");
				String studentName = sc.next();

				System.out.println("Department:");
				String department = sc.next();

				System.out.println("Gender:");
				String gender = sc.next();

				System.out.println("Category:");
				String category = sc.next();

				System.out.println("College Fee:");
				double collegeFee = sc.nextDouble();

				System.out.println("Room Number:");
				int roomNumber = sc.nextInt();

				System.out.println("Block Name:");
				char blockName = sc.next().charAt(0);

				System.out.println("Room Type:");
				String roomType = sc.next();

				Hosteller h = new Hosteller(studentId,studentName,department,gender,category,collegeFee,roomNumber,blockName,roomType);
				System.out.println("Total College Fee:" + h.calculateTotalFee());
				break;
				
			}

			case 2:
			{
				System.out.println("Student Id:");
				int studentId = sc.nextInt();

				System.out.println("Student Name:");
				String studentName = sc.next();

				System.out.println("Department:");
				String department = sc.next();

				System.out.println("Gender:");
				String gender = sc.next();

				System.out.println("Category:");
				String category = sc.next();

				System.out.println("College Fee:");
				double collegeFee = sc.nextDouble();

				System.out.println("Bus Number:");
				int busNumber = sc.nextInt();

				System.out.println("Distance:");
				float distance = sc.nextFloat();

				DayScholar d = new DayScholar(studentId,studentName,department,gender,category,collegeFee,busNumber,distance);
				System.out.println("Total College Fee:" + d.calculateTotalFee());
				break;
				
			}

			case 3:
			{
				exit=false;
				break;
			}

			default:
			{
				System.out.println("choose the correct option");
				break;
			}
		}
		}
	}
}

