//create table groups
//        (
//        group_id   integer PRIMARY KEY,
//        group_name VARCHAR(20) UNIQUE NOT NULL
//        );
//
//        drop table groups;
//
//        create table students
//        (
//        student_iв    integer PRIMARY KEY,
//        student_snp   VARCHAR(20),
//        student_group VARCHAR,
//        FOREIGN KEY (student_group) REFERENCES groups (group_name)
//        );
//
//        drop table students;
//
//        insert into groups (group_id, group_name)
//        values (1, 'Java'),
//        (2, 'C++'),
//        (3, 'Python'),
//        (4, 'SQL'),
//        (5, 'C#');
//
//        insert into students (student_iв, student_snp, student_group)
//        values (1, 'Иванов', 'Java'),
//        (2, 'Петров', 'Java'),
//        (3, 'Сидоров', 'Python'),
//        (4, 'Смирнов', 'SQL'),
//        (5, 'Егоров', null);
//
//        select *
//        from students;
//
//        select *
//        from groups;
//
//        select *
//        from students
//        where octet_length(student_group) > 0;
//
//        select *
//        from students
//        where student_group like 'Java';
//
//        Select *
//        from students
//        order by student_iв
//        limit 2;
//
//
//
