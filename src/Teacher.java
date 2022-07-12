class Teacher {
    String name;
    String branch;
    String mpno;

    Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;

    }

    void printTeacher() {
        System.out.println("Adi \t\t:" + this.name);
        System.out.println("Bolumu \t\t:" + this.branch);
        System.out.println("Telefon \t:" + this.mpno);

    }
}
