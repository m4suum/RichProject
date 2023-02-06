import java.sql.*;

public class WorkWithDatabase {
    public static void main(String[] args) throws SQLException {
        final String user = "postgres";
        final String password = "123";
        final String url = "jdbc:postgresql://localhost:5433/";
        final Connection connection = DriverManager.getConnection(url, user, password);

        /**ВЫВОД ТАБЛИЦЫ ОЦЕНОК=======================================================================================**/
//        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM grades")) {
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//
//                String student = resultSet.getString("grade_student");
//                int grade = resultSet.getInt("grade");
//                String subject = resultSet.getString("grade_subject");
//
//                System.out.println("Student --->>> " + student);
//                System.out.println("Subject --->>> " + subject);
//                System.out.println("Grade --->>> " + grade);
//                System.out.println();
//            }
//        } finally {
//            connection.close();
//        }

        /**==========================================================================================================**/


        /**ИНФА СТУДЕНТА=======================================================================================**/
        try (
                PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT s.student_snp, s.student_group, f.faculty_name, u.university_name from students s join groups g on g.group_code like s.student_group join faculties f on f.faculty_name like g.group_faculty join universities u on u.university_name like f.faculty_university where s.student_id = 3;")) {

            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()) {

                String student = resultSet.getString("student_snp");
                String group = resultSet.getString("student_group");
                String faculty = resultSet.getString("faculty_name");
                String university = resultSet.getString("university_name");

                System.out.println("Student --->>> " + student);
                System.out.println("Group --->>> " + group);
                System.out.println("Faculty --->>> " + faculty);
                System.out.println("University --->>> " + university);
                System.out.println();
            }
        }
        /**==========================================================================================================**/


        System.out.println();
        /**AVG=======================================================================================**/
        try (
                PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT AVG (grade),grade_student from grades group by grade_student;")) {

            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()) {

                String student = resultSet.getString("grade_student");
                int grade = resultSet.getInt("AVG");

                System.out.println("Student --->>> " + student);
                System.out.println("AVG grade --->>> " + grade);
                System.out.println();
            }
        } finally {
            connection.close();
        }
        /**==========================================================================================================**/

    }
}
