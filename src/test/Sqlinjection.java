import java.sql.*;
import java.util.Scanner;

public class Sqlinjection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner input=new Scanner(System.in);

        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/smbms";
        String username="root";
        String password="123";

        //连接数据源
        Class.forName(driver);
        Connection con= DriverManager.getConnection(url,username,password);

        Statement stat=con.createStatement();

        boolean falg=true;
        while(falg=true) {
            System.out.println("请输入用户名：");
            String name = input.nextLine();
            System.out.println("密码：");
            String pwd = input.nextLine();

            String sql = "select count(1) as mycount from smbms_user where userCode='" + name + "' and userPassword='" + pwd + "'";
            System.out.println(sql);

            ResultSet rs = stat.executeQuery(sql);

            if (rs.next()) {
                int count = rs.getInt("mycount");
                if (count > 0) {
                    System.out.println("登陆成功");
                    falg=true;
                    rs.close();
                    con.close();
                    break;
                } else {
                    System.out.println("登陆失败");
                    falg=false;
                }
            }
        }
    }
}
