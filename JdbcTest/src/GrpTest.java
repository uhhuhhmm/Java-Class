import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GrpTest {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		//executeQuery()	-	select
		//executeUpdate()	-	insert,update,delete
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "user02", "1234");
			stmt = con.createStatement();
			
			System.out.println("=======================");
			System.out.println("도 서 관 리 프 로 그 램");
			System.out.println("=======================");
			System.out.println("1. 대 여");
			System.out.println("2. 대 여 조 회");
			System.out.print("메뉴선택 >> ");
			
			Scanner sc = new Scanner(System.in);
			
			int choice;
			choice = sc.nextInt();
			String sql;
			
			//next는 띄어쓰기 불가
//			if(choice == 1) {
//				System.out.println("===대 여===");
//				//사번, 이름, 부서번호
//				System.out.print("도서 번호 : ");
//				int empno = sc.nextInt();
//				sc.nextLine();
//				System.out.print("이름 입력 : ");
//				String ename = sc.nextLine();
//				System.out.print("부서번호 입력 : ");
//				int deptno = sc.nextInt();
//				
//				sql = "insert into emp02 (empno, ename, hiredate, deptno)"
//						+ " values(" + empno + ",' " + ename + " ',sysdate," +  deptno + ")";
//				
//				System.out.println(sql);
//				
//				int result = stmt.executeUpdate(sql);
//				
//				if(result <= 0){
//					System.out.println("실패");
//				}else {
//					System.out.println("성공");
//				}
//				
//			}else if(choice == 2) {
//				System.out.println("===사 원 조 회===");
//				sql = "select * from emp02";
//				
//				rs = stmt.executeQuery(sql);
//				
//				while(rs.next()) {
//					int empno = rs.getInt("empno");
//					String ename = rs.getString("ename");
//					//Date hiredate = rs.getDate("hiredate");
//					String hiredate = rs.getString("hiredate");
//					
//					System.out.println(empno + " " + ename + " " + hiredate);
//				}
				
				
				
				
				
				
//			rent sequence
//          create sequece rent_seq
//          increment by 1
//          start with 1
//          minvalue 1
//          maxvalue 9999
     
//       rent_date로 수정
     
	       if(choice == 1) {
	          System.out.println("===대 여===");
	          
	          System.out.println("도서번호 입력 >> ");
	          int book_no = sc.nextInt();
	          System.out.println("아이디를 입력 >> ");
	          String user_id2 = sc.nextLine();
	                      
	          sql = "insert into rent(rent_no, return_date, user_id2, book_no)"
	                + " values(rent_seq.nextval, rent_no, sysdate, '"+ user_id2 +"', " + book_no + ")";
	          
	          int result = stmt.executeUpdate(sql);
	         
	          if(result <= 0){
	            System.out.println("대여 정보가 올바르지 않습니다");
	          }else {
	            System.out.println("대여 정보가 입력 됐습니다");
	          }
	          
	       }else if(choice == 2) {
	          System.out.println("===대 여 목 록===");
	          sql = "select * from rent";      
	          
	          rs = stmt.executeQuery(sql);
	          
	          while(rs.next()) {
	             int book_no = rs.getInt("book_no");
	             String user_id2 = rs.getString("user_id2");
	             Date return_date  = rs.getDate("return_date");
	             
	             System.out.println(book_no + " " + user_id2 + " " + return_date);
	          }
	          
	       }
				
				
				
				
//			}else if(choice == 5) {
//				//급여, 성과금, 부서번호
//				System.out.println("===사 원 정 보 수 정===");
//				System.out.println("사번 입력 >> ");
//				int empno = sc.nextInt();
//				
//				System.out.println("급여 입력 : ");
//				int sal = sc.nextInt();
//				System.out.println("성과금 입력 : ");
//				int comm = sc.nextInt();
//				System.out.println("부서번호 입력 : ");
//				int deptno = sc.nextInt();
//				
//				sql = "update emp02" + " set sal = " + sal + ", comm = " + comm + ", deptno = " + deptno + " " 
//									 + "where empno = " + empno;
//				
//				int result = stmt.executeUpdate(sql);
//				
//				if(result <= 0){
//					System.out.println("실패");
//				}else {
//					System.out.println("성공");
//				}
			
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)
					rs.close();
				if(rs != null)
					stmt.close();
				if(rs != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}