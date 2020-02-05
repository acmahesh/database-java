package ac;
import java.sql.*;
import java.util.Scanner; 
 
class ac3{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/java","root","");  
//here java is database name, root is username and password  
Statement stmt=con.createStatement(); 
/*
Scanner k = new Scanner(System.in); 
System.out.println("enter ssn"); 
int ssn = k.nextInt(); 
System.out.println("enter Name"); 
String name = k.next(); 
System.out.println("enter address"); 
String address = k.next(); 
System.out.println("enter sex"); 
String sex = k.next(); 
System.out.println("enter salary"); 
int salary = k.nextInt(); 
System.out.println("enter Superssn"); 
int sssn = k.nextInt(); 
System.out.println("enter Dno"); 
int dno = k.nextInt(); 

//Inserting data using SQL query 
String sql = "insert into emp1 values("+ssn+",'"+name+"','"+address+"','"+sex+"',"+salary+","+sssn+","+dno+")"; 

try
{ 
	
	//Reference to connection interface 
	Statement st = con.createStatement(); 
	int m = st.executeUpdate(sql); 
	if (m == 1) 
		System.out.println("inserted successfully : "+sql); 
	else
		System.out.println("insertion failed"); 
} 
catch(Exception ex) 
{ 
	System.err.println(ex); 
}
*/
System.out.println("q1");
ResultSet rs=stmt.executeQuery("select * from emps where name like 's%'");  
while(rs.next())  
System.out.println(rs.getString(2)); 
System.out.println();

System.out.println("q2");
ResultSet rs1=stmt.executeQuery("select * from emps where dno=5");  
while(rs1.next())  
System.out.println(rs1.getString(2)); 
System.out.println();

System.out.println("q3");
ResultSet rs2=stmt.executeQuery("select * from emps where sex='female'");  
while(rs2.next())  
System.out.println(rs2.getString(2)); 
System.out.println();

System.out.println("q4");
ResultSet rs3=stmt.executeQuery("select 1.1*salary as newsal from emps where dno=5 ");  
while(rs3.next())  
System.out.println(rs3.getString(1)); 
System.out.println();


con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  



