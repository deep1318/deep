import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
class employee
{
    public static void main(String[] args)throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","admin");

            if(con !=null){
                System.out.println("Establish connection");final c
            
         Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
         ResultSet rs=st.executeQuery("select * from emp");
         Scanner sc=new Scanner(System.in);
            System.out.println("Database Menu");
            int ch;
            do{
        System.out.println("\n)eid");
        System.out.println("\n)ename");
        System.out.println("\n)eaddress");
        System.out.println("\n)contectno");
        System.out.println("\n)gender");
        System.out.println("\n)salary");
        System.out.println("\n)Desigantion");
        System.out.println("\n1)Move to the next Record.");
        System.out.println("\n2)Move to the first Record.");
        System.out.println("\n3)Move to the Previous Record.");
        System.out.println("\n4)Move to the last Record.");
        System.out.println("\n5)Exit.");
        System.out.println("\n1)Enter choice:");
                ch=sc.nextInt();
                switch(ch){
                    case 1:System.out.println("\n\tNext record:Employee no:"+rs.getString(1)+"\n\tEmployee Name:"+rs.getString(2));
                    break;
                    case 2:if(rs.first())
                    System.out.println("\n\tFirst record:Employee no:"+rs.getString(1)+"\n\tEmployee Name:"+rs.getString(2));
                    break;
                    case 3:if(rs.previous())
                    System.out.println("\n\tPrevious record:Employee no:"+rs.getString(1)+"\n\tEmployee Name:"+rs.getString(2));
                    break;
                    case 4:if(rs.last())
                    System.out.println("\n\t Last Employee record:Employee no:"+rs.getString(1)+"\n\tEmployee Name:"+rs.getString(2));
                    break;
                    case 5:System.exit(0);
                    break;
                }
    }while(ch!=5);
         rs.close();
    }
}
}