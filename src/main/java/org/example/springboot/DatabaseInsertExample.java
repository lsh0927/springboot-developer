import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseInsertExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://awseb-e-t9zwszkn2k-stack-awsebrdsdatabase-v0qdg8j2hyqr.cpejpmwo2yf2.ap-northeast-2.rds.amazonaws.com:3306/blog";
        String username = "lsheon0927";
        String password = "dltmdgjs0927";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement statement = connection.createStatement();

            String nickname = "Johnny";
            String email = "johnny@example.com";

            // INSERT 문 실행
            String insertQuery = "INSERT INTO users (nickname, email) VALUES ('" + nickname + "', '" + email + "')";
            int rowsAffected = statement.executeUpdate(insertQuery);

            System.out.println(rowsAffected + " row(s) inserted.");

            // 자원 해제
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
