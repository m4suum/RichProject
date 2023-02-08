//create table groups
//        (
//        group_id      integer PRIMARY KEY,
//        group_faculty VARCHAR,
//        FOREIGN KEY (group_faculty) REFERENCES faculties (faculty_name),
//        group_code varchar (20) UNIQUE NOT NULL
//        );
//        drop table groups;
//
//        create table faculties
//        (
//        faculty_id integer PRIMARY KEY,
//        faculty_name VARCHAR (20) unique ,
//        faculty_university VARCHAR,
//        FOREIGN KEY (faculty_university) REFERENCES universities (university_name)
//        );
//        drop table faculties;
//
//        create table universities
//        (
//        university_id integer PRIMARY KEY,
//        university_name VARCHAR (15) UNIQUE
//        );
//        drop table universities;
//
//        create table subjects
//        (
//        subject_id integer PRIMARY KEY,
//        subject_name VARCHAR (10) UNIQUE
//        );
//        drop table subjects;
//
//        create table students
//        (
//        student_id            integer PRIMARY KEY,
//        student_snp           VARCHAR(20) unique ,
//        student_group         VARCHAR,
//        FOREIGN KEY (student_group) REFERENCES groups (group_code),
//        student_date_of_birth date
//        );
//        drop table students;
//
//        create table grades
//        (
//        grade_student VARCHAR,
//        FOREIGN KEY (grade_student) REFERENCES students (student_snp),
//        grade integer,
//        grade_subject VARCHAR,
//        FOREIGN KEY (grade_subject) REFERENCES subjects (subject_name)
//        );
//        drop table grades;
//
//        insert into universities(university_id, university_name)
//        values (1, 'MIFI'),
//        (2, 'KRSU'),
//        (3, 'AUCA'),
//        (4, 'UCA'),
//        (5, 'BGTU');
//
//        insert into subjects(subject_id, subject_name)
//        values (1, 'Math'),
//        (2, 'Physics'),
//        (3, 'P.E.'),
//        (4, 'Literature'),
//        (5, 'History');
//
//        insert into faculties (faculty_id, faculty_name, faculty_university)
//        values (1, 'Faculty1', 'AUCA'),
//        (2, 'Faculty2', 'UCA'),
//        (3, 'Faculty3', 'BGTU'),
//        (4, 'Faculty4', 'KRSU'),
//        (5, 'Faculty5', 'KRSU');
//
//        insert into grades (grade_student, grade, grade_subject)
//        values ('Петров', 5, 'Math'),
//        ('Петров', 5, 'History'),
//        ('Петров', 3, 'Physics'),
//        ('Иванов', 4, 'P.E.'),
//        ('Сидоров', 5, 'Literature'),
//        ('Смирнов', 2, 'Math'),
//        ('Егоров', 2, 'Math'),
//        ('Смирнов', 3, 'Physics'),
//        ('Сидоров', 5, 'History');
//
//
//
//        insert into groups (group_id, group_faculty, group_code)
//        values (1, 'Faculty1', '1234'),
//        (2, 'Faculty2', '1244'),
//        (3, 'Faculty3', '1243'),
//        (4, 'Faculty4', '4312'),
//        (5, 'Faculty5', '1324');
//
//        insert into students (student_id, student_snp, student_group, student_date_of_birth)
//        values (1, 'Иванов', '1234', '1999-12-02'),
//        (2, 'Петров', '1234', '2005-05-04'),
//        (3, 'Сидоров', '1243', '1997-12-14'),
//        (4, 'Смирнов', '4312', '2007-09-15'),
//        (5, 'Егоров', '1324', '2006-11-13');
//
//        select *
//        from students;
//
//        select *
//        from groups;
//
//        select *
//        from grades;
//
//        select *
//        from universities;
//
//
//
//        /*TASKS*/
//        select *
//        from students
//        where octet_length(student_group) > 0;
//
//        select *
//        from students
//        where student_group like '1234';
//
//        Select *
//        from students
//        order by student_id
//        limit 2;
//
//        /*TESTS*/
//        insert into students (student_id, student_snp, student_group, student_date_of_birth)
//        values (6, 'Аманов', '4312', '2005-04-05');
//
//        delete from students
//        where student_id = 6;
