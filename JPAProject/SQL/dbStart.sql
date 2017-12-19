CREATE DATABASE quizdb; 
CREATE TABLE `quiz`(
    `id` int(11) NOT NULL AUTO_INCREMENT, 
    `name` varchar(30) NOT NULL UNIQUE, 
    PRIMARY KEY (`id`)
); 

CREATE TABLE `question`(
    `id` int(11) NOT NULL AUTO_INCREMENT, 
    `text` text NOT NULL, 
    `quiz_id` NOT NULL, 
    PRIMARY KEY (`id`),
       FOREIGN KEY (`quiz_id`)
            REFERENCES `quiz` (`id`)
); 