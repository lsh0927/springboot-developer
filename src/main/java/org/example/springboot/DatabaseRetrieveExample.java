import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DatabaseRetrieveExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://awseb-e-t9zwszkn2k-stack-awsebrdsdatabase-v0qdg8j2hyqr.cpejpmwo2yf2.ap-northeast-2.rds.amazonaws.com:3306/blog";
        String username = "lsheon0927";
        String password = "dltmdgjs0927";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement statement = connection.createStatement();
            // SELECT 문 실행
            String selectQuery = "SELECT nickname, email FROM users";
            ResultSet resultSet = statement.executeQuery(selectQuery);

            while (resultSet.next()) {
                String nickname = resultSet.getString("nickname");
                String email = resultSet.getString("email");
                System.out.println("Nickname: " + nickname + ", Email: " + email);
            }

            // 자원 해제
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
