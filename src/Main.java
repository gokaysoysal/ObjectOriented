public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "111");
        Teacher t2 = new Teacher("Ahmet Hoca", "FZK", "222");
        Teacher t3 = new Teacher("Ayse Hoca", "BIO", "333");


        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biyoloji = new Course("Biyoloji", "103", "BIO");
        biyoloji.addTeacher(t3);


        Student s1 = new Student("inek sabah", "123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(80, 60, 40);
        s1.isPass();
    }
}
