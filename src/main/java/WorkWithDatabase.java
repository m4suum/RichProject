import java.sql.*;
import java.util.Scanner;

public class WorkWithDatabase {
    public static void main(String[] args) throws SQLException {
        final String user = "postgres";
        final String password = "123";
        final String url = "jdbc:postgresql://localhost:5432/";
        final Connection connection = DriverManager.getConnection(url, user, password);
        Scanner scanner = new Scanner(System.in);


//        /**ВЫВОД ТАБЛИЦЫ ОЦЕНОК=======================================================================================**/
//        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM grades")) {
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                String student = resultSet.getString("grade_student");
//                int grade = resultSet.getInt("grade");
//                String subject = resultSet.getString("grade_subject");
//                System.out.println("Student --->>> " + student);
//                System.out.println("Subject --->>> " + subject);
//                System.out.println("Grade --->>> " + grade);
//                System.out.println();
//            }
//        }
//        /**==========================================================================================================**/
//
//


//        System.out.println();
//        /**ИНФА СТУДЕНТА=============================================================================================**/
//        try (PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT s.student_snp, s.student_group, f.faculty_name, u.university_name from students s join groups g on g.group_code like s.student_group join faculties f on f.faculty_name like g.group_faculty join universities u on u.university_name like f.faculty_university where s.student_id = 3;")) {
//            ResultSet resultSet = preparedStatement1.executeQuery();
//            while (resultSet.next()) {
//                String student = resultSet.getString("student_snp");
//                String group = resultSet.getString("student_group");
//                String faculty = resultSet.getString("faculty_name");
//                String university = resultSet.getString("university_name");
//                System.out.println("Student --->>> " + student);
//                System.out.println("Group --->>> " + group);
//                System.out.println("Faculty --->>> " + faculty);
//                System.out.println("University --->>> " + university);
//                System.out.println();
//            }
//        }
//        /**==========================================================================================================**/
//
//


//        System.out.println();
//        /**AVG=======================================================================================================**/
//        try (PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT AVG (grade),grade_student from grades group by grade_student;")) {
//            ResultSet resultSet = preparedStatement1.executeQuery();
//            while (resultSet.next()) {
//                String student = resultSet.getString("grade_student");
//                int grade = resultSet.getInt("AVG");
//                System.out.println("Student --->>> " + student);
//                System.out.println("AVG grade --->>> " + grade);
//                System.out.println();
//            }
//        }
//        /**==========================================================================================================**/






//        /**ДОБАВЛЕНИЕ СТУДЕНТА==========================================================================================**/
//        try (PreparedStatement preparedStatement1 = connection.prepareStatement("insert into students (student_id, student_snp, student_group, student_date_of_birth)values (?, ?, ?, to_date(?, 'YY/MM/DD'));")) {
//            System.out.println("Добавление студента");
//            System.out.print("Введите имя студента ");
//            String added_student_name = scanner.nextLine();
//            System.out.print("Введите уникальный id код студента ");
//            int added_student_id = scanner.nextInt();
//            System.out.print("Введите номер уже существующей группы ");
//            String added_student_group = scanner.next();
//            System.out.print("Введите дату рождения (Например 1999-11-19) ");
//            String added_student_birthday = scanner.next();
//            preparedStatement1.setString(2, added_student_name);
//            preparedStatement1.setInt(1, added_student_id);
//            preparedStatement1.setString(3, added_student_group);
//            preparedStatement1.setString(4, added_student_birthday);
//            preparedStatement1.executeUpdate();
//            System.out.println("Студент успешно добавлен");
//        } catch (org.postgresql.util.PSQLException ex) {
//            System.out.println();
//            System.out.println(ex.toString().toUpperCase());
//            System.out.println();
//        }
//        try (PreparedStatement preparedStatement1 = connection.prepareStatement("select * from students;")) {
//            ResultSet resultSet = preparedStatement1.executeQuery();
//            while (resultSet.next()) {
//                int student_id = resultSet.getInt("student_id");
//                String student_name = resultSet.getString("student_snp");
//                String student_group = resultSet.getString("student_group");
//                String student_date_of_birth = resultSet.getString("student_date_of_birth");
//                System.out.println("ID --->>> " + student_id);
//                System.out.println("STUDENT --->>> " + student_name);
//                System.out.println("GROUP --->>> " + student_group);
//                System.out.println("BIRTHDAY --->>> " + student_date_of_birth);
//                System.out.println();
//            }
//        }
//        /**==========================================================================================================**/
//




//
//        /**УДАЛЕНИЕ СТУДЕНТА==========================================================================================**/
//        try (PreparedStatement preparedStatement1 = connection.prepareStatement("delete from students where student_id = ?;")) {
//            System.out.print("Для удаления студента, введите его id ");
//            int deleted_student_id = scanner.nextInt();
//            preparedStatement1.setInt(1, deleted_student_id);
//            preparedStatement1.executeUpdate();
//            System.out.println("СТУДЕНТ УСПЕШНО ОТЧИСЛЕН");
//        } catch (org.postgresql.util.PSQLException ex) {
//            System.out.println();
//            System.out.println(ex.toString().toUpperCase());
//            System.out.println();
//        }try (PreparedStatement preparedStatement1 = connection.prepareStatement("select * from students;")) {
//            ResultSet resultSet = preparedStatement1.executeQuery();
//            while (resultSet.next()) {
//                int student_id = resultSet.getInt("student_id");
//                String student_name = resultSet.getString("student_snp");
//                String student_group = resultSet.getString("student_group");
//                String student_date_of_birth = resultSet.getString("student_date_of_birth");
//                System.out.println("ID --->>> " + student_id);
//                System.out.println("STUDENT --->>> " + student_name);
//                System.out.println("GROUP --->>> " + student_group);
//                System.out.println("BIRTHDAY --->>> " + student_date_of_birth);
//                System.out.println();
//            }
//        }
//        /**==========================================================================================================**/






        /**ПОИСК СТУДЕНТА ПО ИМЕНИ===================================================================================**/
//        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT s.student_id, s.student_snp, s.student_group, s.student_date_of_birth, f.faculty_name, u.university_name from students s join groups g on g.group_code like s.student_group join faculties f on f.faculty_name like g.group_faculty join universities u on u.university_name like f.faculty_university; ")) {
//            System.out.print("Введите имя студента, чтобы найти информацию о нем ");
//            String searched_student_name = scanner.next();
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                int found_student_id = resultSet.getInt("student_id");
//                String found_student_name = resultSet.getString("student_snp");
//                String found_student_group = resultSet.getString("student_group");
//                String found_student_date_of_birth = resultSet.getString("student_date_of_birth");
//                String found_student_faculty = resultSet.getString("faculty_name");
//                String found_student_university = resultSet.getString("university_name");
//                if (found_student_name.toLowerCase().equals(searched_student_name.toLowerCase())) {
//                    System.out.println("ID --->>> " + found_student_id);
//                    System.out.println("STUDENT --->>> " + found_student_name);
//                    System.out.println("BIRTHDAY --->>> " + found_student_date_of_birth);
//                    System.out.println("GROUP --->>> " + found_student_group);
//                    System.out.println("FACULTY --->>> " + found_student_faculty);
//                    System.out.println("UNIVERSITY --->>> " + found_student_university);
//                }
//            }
//        }
        /**==========================================================================================================**/






        /**ЛИСТ СТУДЕНТОВ============================================================================================**/
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT s.student_id, s.student_snp, s.student_group, s.student_date_of_birth, f.faculty_name, u.university_name from students s join groups g on g.group_code like s.student_group join faculties f on f.faculty_name like g.group_faculty join universities u on u.university_name like f.faculty_university order by s.student_id; ")) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int student_id = resultSet.getInt("student_id");
                String student_name = resultSet.getString("student_snp");
                String student_group = resultSet.getString("student_group");
                String student_date_of_birth = resultSet.getString("student_date_of_birth");
                String student_faculty = resultSet.getString("faculty_name");
                String student_university = resultSet.getString("university_name");
                System.out.println("ID --->>> " + student_id);
                System.out.println("STUDENT --->>> " + student_name);
                System.out.println("BIRTHDAY --->>> " + student_date_of_birth);
                System.out.println("GROUP --->>> " + student_group);
                System.out.println("FACULTY --->>> " + student_faculty);
                System.out.println("UNIVERSITY --->>> " + student_university);
                System.out.println();
            }
        } finally {
            connection.close();
        }
        /**==========================================================================================================**/
    }
}
