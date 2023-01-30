//create table sports
//        (
//        sport_id      integer PRIMARY KEY,
//        sort_of_sport VARCHAR(20) UNIQUE NOT NULL,
//        salary        integer            NOT NULL
//        );
//        select *
//        from sports;
//        create table trainers_kb
//        (
//        trainer_id    integer PRIMARY KEY,
//        name          VARCHAR(50)        NOT NULL,
//        number        VARCHAR(20),
//        inn           VARCHAR(14) UNIQUE NOT NULL,
//        sport_type_id INTEGER UNIQUE,
//        FOREIGN KEY (sport_type_id) REFERENCES sports (sport_id)
//        );
//
//        select *
//        from trainers_kb;
//
//        drop table trainers_kb;
//        drop table sports;
//
//        alter table trainers_kb
//        add sport_type_id integer;
//        alter table trainers_kb
//        drop sport_type_id;
//
//        insert into sports (sport_id, sort_of_sport, salary)
//        values (1, 'Football', 200000),
//        (2, 'Volleyball', 2000),
//        (3, 'Basketball', 400),
//        (4, 'Box', 200),
//        (5, 'Swimming', 673),
//        (6, 'Bodybuilding', 20230);
//
//        select *
//        from sports;
//
//        insert into trainers_kb (trainer_id, name, number, inn, sport_type_id)
//        values (1, 'Andrey', '+996559934312', '1971', 1),
//        (2, 'Victor', '+996558834312', '1968', 2),
//        (3, 'Kolya', '+996558834312', '1980', 3),
//        (4, 'Sergey', '+996559956312', '1958', 4),
//        (5, 'Mikhail', '+996779934312', '1969', 5),
//        (6, 'Anatoly', '+996559998342', '1990', 6);
//
//        select *
//        from trainers_kb;
//
//
//        select t.trainer_id, t.name, s.salary
//        from trainers_kb t
//        join sports s on s.sport_id = t.sport_type_id
//        where s.salary > 500;
//
//        select t1.trainer_id, t1.name
//        from trainers_kb t1
//        where name like '%a%';
//
//        select s1.sport_id, s1.sort_of_sport
//        from sports s1
//        where substring(s1.sort_of_sport from (octet_length(s1.sort_of_sport) - 3) for 4) like 'ball';
//
//        select t.trainer_id, t.name, t.number, s.salary
//        from trainers_kb t
//        join sports s on s.sport_id = t.sport_type_id
//        order by s.salary DESC;
//
//
//        select t.trainer_id, t.name, t.number
//        from trainers_kb t
//        order by t.name;
//
//        update trainers_kb
//        set name = 'Карло Анчелотти'
//        where trainer_id = 1;
//
//        update sports
//        set salary = salary * 2
//        where sport_id > 0