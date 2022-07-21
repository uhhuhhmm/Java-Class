import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcPro {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		//executeQuery()	-	select
		//executeUpdate()	-	insert,update,delete
		try {//DB�� ������ �ƴ��� Ȯ���ϴ� �۾�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			stmt = con.createStatement();
			
			System.out.println("=======================");
			System.out.println("�� �� �� �� �� �� �� ��");
			System.out.println("=======================");
			System.out.println("1. �� �� �� ��");
			System.out.println("2. �� �� �� ȸ (�� ü)");
			System.out.println("3. �� �� �� ȸ (�� ��)");
			System.out.println("4. �� �� �� �� (�� ��)");
			System.out.println("5. �� �� �� �� �� �� (�� ��)");
			System.out.print("�޴����� >> ");
			
			Scanner sc = new Scanner(System.in);
			
			int choice;
			choice = sc.nextInt();
			String sql;
			String sql1;
			//next�� ���� �Ұ�
			if(choice == 1) {
				System.out.println("===�� ��===");
				//���, �̸�, �μ���ȣ
				System.out.print("��� �Է� : ");
				int empno = sc.nextInt();
				sc.nextLine();
				System.out.print("�̸� �Է� : ");
				String ename = sc.nextLine();
				System.out.print("�μ���ȣ �Է� : ");
				int deptno = sc.nextInt();
				
				sql = "insert into emp02 (empno, ename, hiredate, deptno)"
						+ " values(" + empno + ",'" + ename + "',sysdate," +  deptno + ")";
				
				System.out.println(sql);
				
				int result = stmt.executeUpdate(sql);
				
				if(result <= 0){
					System.out.println("����");
				}else {
					System.out.println("����");
				}
				
			}else if(choice == 2) {
				System.out.println("===�� �� �� ȸ===");
				sql = "select * from emp02";
				
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int empno = rs.getInt("empno");
					String ename = rs.getString("ename");
					//Date hiredate = rs.getDate("hiredate");
					String hiredate = rs.getString("hiredate");
					
					System.out.println(empno + " " + ename + " " + hiredate);
				}
				
			}else if(choice == 3) { //����� �Է¹޾Ƽ� ��� ��ȸ
				System.out.println("===�� �� �� ȸ===");
				System.out.print("��� �Է� >> ");
				int empno = sc.nextInt();
				sql = "select * from emp02 where empno = " + empno;		
				
				rs = stmt.executeQuery(sql);
				
				if(rs.next() != false) {
					empno = rs.getInt("empno");
					String ename = rs.getString("ename");
					String hiredate = rs.getString("hiredate");
					
					System.out.println(empno + " " + ename + " " + hiredate);
				}
			}else if(choice == 4) {
				System.out.println("===�� �� �� ��===");
				System.out.println("��� �Է� >> ");
				int empno = sc.nextInt();
				sql = "delete from emp02 where empno = " + empno;
				
				int result = stmt.executeUpdate(sql);
				
				if(result <= 0){
					System.out.println("���� ����");
				}else {
					System.out.println("���� �Ϸ�");
				}
			}else if(choice == 5) {
				//�޿�, ������, �μ���ȣ
				System.out.println("===�� �� �� �� �� ��===");
				System.out.println("��� �Է� >> ");
				int empno = sc.nextInt();
				
				System.out.println("�޿� �Է� : ");
				int sal = sc.nextInt();
				System.out.println("������ �Է� : ");
				int comm = sc.nextInt();
				System.out.println("�μ���ȣ �Է� : ");
				int deptno = sc.nextInt();
				
				sql = "update emp02" + " set sal = " + sal + ", comm = " + comm + ", deptno = " + deptno + " " 
									 + "where empno = " + empno;
				
				int result = stmt.executeUpdate(sql);
				
				if(result <= 0){
					System.out.println("����");
				}else {
					System.out.println("����");
				}
			
			
			}
			
			
			
			
			
			//���, �̸�, �μ��� (�÷��� �� �����������)
//			String sql = "select * from emp02 e, dept d"
//							+ "where e.deptno = d.deptno";
			
//			String sql2 = "insert into emp02"
//					+ " values (1111, 'AAA', 'CLERK', 7788, sysdate, 1000, null, 10)";
//			int result = stmt.executeUpdate(sql2);
			
//			String sql = "select * from emp02";
			//update
//			String sql3 = "update emp02"
//					+ " set ename = 'BBB'"
//					+ " where empno = 1111";
//			int result = stmt.executeUpdate(sql3);
						
//			if(result <= 0){
//				System.out.println("����");
//			}else {
//				System.out.println("����");
//			}
//			
//			ResultSet rs = stmt.executeQuery(sql);
//			
//			//�ӽ����̺��� ù��° ��ġ
//			while(rs.next()) {
//				int empno = rs.getInt("empno");	//getInt(1) ��ȣ�� �ᵵ ����
//				String ename = rs.getString("ename");
//				//Date hiredate = rs.getDate("hiredate");
//				String hiredate = rs.getString("hiredate");
////				String job = rs.getString("job");
////				int mgr = rs.getInt("mgr");
////				int sal = rs.getInt("sal");
////				int comm = rs.getInt("comm");
////				int deptno = rs.getInt("deptno");
////				String dname = rs.getString("dname");
//				
//				System.out.println(empno + " " + ename + " " + hiredate);
//			}
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