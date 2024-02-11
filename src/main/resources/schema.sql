create table users (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    password VARCHAR(50),
    email VARCHAR(50),
    role VARCHAR(50)
);

create table projects (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    projectname VARCHAR(50),
    description VARCHAR(50),
    createddate DATE
);

create table usersproject (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    projectid INT,
    userid INT
);