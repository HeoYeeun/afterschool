package afterschool;
import java.util.Scanner;
import afterschool.MemberDAO;

public class studentInfo{

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		System.out.println("*********** �л� ���� �ý��� ********");
		System.out.println("1. �л����");
		System.out.println("2. �л�����");
		System.out.println("3. �л���ȸ");
		System.out.println("4. �л�����");
		System.out.println("5. ����");
		System.out.println("���ϴ� �۾��� �Է��ϼ���. :");
		int choice = key.nextInt();
		switch(choice){
			case 1:
				System.out.println("*********** �л���� ************* ");
				System.out.println("ID(����,�������): ");
				String id = key.next();
				System.out.println("Name(����,�������): ");
				String name = key.next();
				System.out.println("Department(����,�������): ");
				String department = key.next();
				System.out.println("Phone(����,�������): ");
				String phone = key.next();
				dao.add(id, name, department, phone);
				System.out.println("�л������ �Ϸ�Ǿ����ϴ�.");
				break;
				
		
		}
		
	}

	


}
