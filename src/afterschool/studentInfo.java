package afterschool;
import java.util.Scanner;
import afterschool.MemberDAO;

public class studentInfo{

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		System.out.println("*********** 학생 정보 시스템 ********");
		System.out.println("1. 학생등록");
		System.out.println("2. 학생수정");
		System.out.println("3. 학생조회");
		System.out.println("4. 학생삭제");
		System.out.println("5. 종료");
		System.out.println("원하는 작업을 입력하세요. :");
		int choice = key.nextInt();
		switch(choice){
			case 1:
				System.out.println("*********** 학생등록 ************* ");
				System.out.println("ID(숫자,공백없이): ");
				String id = key.next();
				System.out.println("Name(영문,공백없이): ");
				String name = key.next();
				System.out.println("Department(영문,공백없이): ");
				String department = key.next();
				System.out.println("Phone(숫자,공백없이): ");
				String phone = key.next();
				dao.add(id, name, department, phone);
				System.out.println("학생등록이 완료되었습니다.");
				break;
				
		
		}
		
	}

	


}
