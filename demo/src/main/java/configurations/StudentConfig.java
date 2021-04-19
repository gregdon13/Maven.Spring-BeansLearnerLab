package configurations;

import classes.Student;
import classes.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        Student greg = new Student(1, "Greg");
        Student jorge = new Student(2, "Jorge");
        Student kelly = new Student(3, "Kelly");
        Student chris = new Student(4, "Chris");
        Student ashley = new Student(5, "Ashley");
        Student ryan = new Student(6, "Ryan");
        Student hazel = new Student(7, "Hazel");
        Student justin = new Student(8, "Justin");
        Student theresa = new Student(9, "Theresa");
        Student mike = new Student(10, "Mike");
        Student lena = new Student(11, "Lena");
        Student monali = new Student(12, "Monali");
        Student abe = new Student(13, "Abe");
        Student xiong = new Student(14, "Xiong");
        return new Students(greg, jorge, kelly, chris, ashley, ryan, hazel, justin, theresa, mike, lena, monali, abe, xiong);
    }

    @Bean
    public Students previousStudents() {
        Student josh = new Student(1, "Josh");
        Student jeremy = new Student(2, "Jeremy");
        Student ben = new Student(3, "Ben");
        Student hilary = new Student(4, "Hilary");
        Student han = new Student(5, "Han");
        Student gabriela = new Student(6, "Gabriela");
        Student jack = new Student(7, "Jack");
        Student whitney = new Student(8, "Whitney");
        return new Students(josh, jeremy, ben, hilary, han, gabriela, jack, whitney);
    }
}
