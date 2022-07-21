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
			System.out.println("�� �� �� �� �� �� �� ��");
			System.out.println("=======================");
			System.out.println("1. �� ��");
			System.out.println("2. �� �� �� ȸ");
			System.out.print("�޴����� >> ");
			
			Scanner sc = new Scanner(System.in);
			
			int choice;
			choice = sc.nextInt();
			String sql;
			
			//next�� ���� �Ұ�
//			if(choice == 1) {
//				System.out.println("===�� ��===");
//				//���, �̸�, �μ���ȣ
//				System.out.print("���� ��ȣ : ");
//				int empno = sc.nextInt();
//				sc.nextLine();
//				System.out.print("�̸� �Է� : ");
//				String ename = sc.nextLine();
//				System.out.print("�μ���ȣ �Է� : ");
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
//					System.out.println("����");
//				}else {
//					System.out.println("����");
//				}
//				
//			}else if(choice == 2) {
//				System.out.println("===�� �� �� ȸ===");
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
     
//       rent_date�� ����
     
	       if(choice == 1) {
	          System.out.println("===�� ��===");
	          
	          System.out.println("������ȣ �Է� >> ");
	          int book_no = sc.nextInt();
	          System.out.println("���̵� �Է� >> ");
	          String user_id2 = sc.nextLine();
	                      
	          sql = "insert into rent(rent_no, return_date, user_id2, book_no)"
	                + " values(rent_seq.nextval, rent_no, sysdate, '"+ user_id2 +"', " + book_no + ")";
	          
	          int result = stmt.executeUpdate(sql);
	         
	          if(result <= 0){
	            System.out.println("�뿩 ������ �ùٸ��� �ʽ��ϴ�");
	          }else {
	            System.out.println("�뿩 ������ �Է� �ƽ��ϴ�");
	          }
	          
	       }else if(choice == 2) {
	          System.out.println("===�� �� �� ��===");
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
//				//�޿�, ������, �μ���ȣ
//				System.out.println("===�� �� �� �� �� ��===");
//				System.out.println("��� �Է� >> ");
//				int empno = sc.nextInt();
//				
//				System.out.println("�޿� �Է� : ");
//				int sal = sc.nextInt();
//				System.out.println("������ �Է� : ");
//				int comm = sc.nextInt();
//				System.out.println("�μ���ȣ �Է� : ");
//				int deptno = sc.nextInt();
//				
//				sql = "update emp02" + " set sal = " + sal + ", comm = " + comm + ", deptno = " + deptno + " " 
//									 + "where empno = " + empno;
//				
//				int result = stmt.executeUpdate(sql);
//				
//				if(result <= 0){
//					System.out.println("����");
//				}else {
//					System.out.println("����");
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