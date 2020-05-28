-- CREATING SCHEMA
DROP DATABASE IF EXISTS `spring_crm_final_project`;

CREATE DATABASE IF NOT EXISTS `spring_crm_final_project`;
USE `spring_crm_final_project`;

-- CREATE TABLE 'user'

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
`id` INT(11) NOT NULL AUTO_INCREMENT,
`username` VARCHAR(50) NOT NULL,
`password` char(80) NOT NULL,
`first_name` varchar(50) NOT NULL,
`last_name` varchar(50) NOT NULL,
`email` varchar(50) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- CREATE TABLE 'role'

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- CREATE TABLE 'users_roles'
DROP TABLE IF EXISTS `users_roles`;

CREATE TABLE `users_roles` (
`user_id` INT(11) NOT NULL,
`role_id` INT(11) NOT NULL,

PRIMARY KEY (`user_id`,`role_id`),
KEY `foreign_key_index` (`role_id`),

CONSTRAINT `foreign_key_user` FOREIGN KEY (`user_id`)
REFERENCES `user` (`id`)
 ON DELETE NO ACTION ON UPDATE NO ACTION,
CONSTRAINT `foreign_key_role` FOREIGN KEY (`role_id`)
REFERENCES `role` (`id`)
 ON DELETE NO ACTION ON UPDATE NO ACTION
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 
 SET FOREIGN_KEY_CHECKS = 1;

-- INSERT INTO 'user'

INSERT INTO `user` (username,password,first_name,last_name,email)
VALUES 
('john','$2a$04$eFytJDGtjbThXa80FyOOBuFdK2IwjyWefYkMpiBEFlpBwDH.5PM0K','John','Doe','john@luv2code.com'),
('mary','$2a$04$eFytJDGtjbThXa80FyOOBuFdK2IwjyWefYkMpiBEFlpBwDH.5PM0K','Mary','Public','mary@luv2code.com'),
('susan','$2a$04$eFytJDGtjbThXa80FyOOBuFdK2IwjyWefYkMpiBEFlpBwDH.5PM0K','Susan','Adams','susan@luv2code.com');
-- NOTE: The passwords are encrypted using BCrypt
--
-- A generation tool is avail at: http://www.luv2code.com/generate-bcrypt-password
--
-- Default passwords here are: fun123


-- INSERT INTO 'role'

INSERT INTO `role` (name)
VALUES 
('ROLE_EMPLOYEE'),('ROLE_MANAGER'),('ROLE_ADMIN');

-- INSERT INTO 'users_roles'

INSERT INTO `users_roles` (user_id,role_id)
VALUES 
(1, 1),
(2, 1),
(2, 2),
(3, 1),
(3, 3)