import java.sql.SQLOutput;

public class Person {

        String FIO;
        String dolznost;
        String email;
        String tel;
        String zarplata;
        int vozrast;

        Person(String FIO, String dolznost, String email, String tel, String zarplata, int vozrast){
            this.FIO = FIO;
            this.dolznost = dolznost;
            this.email = email;
            this.tel = tel;
            this.zarplata = zarplata;
            this.vozrast = vozrast;

        }
        void information () {
            System.out.println("FIO:" + FIO + "Должность" + dolznost + "email" + email + "телефон" + tel + "зарплата" + zarplata + "возраст" + vozrast);

        }

        int getAge () {
            return vozrast;
        }

    }

