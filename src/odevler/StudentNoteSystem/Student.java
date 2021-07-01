package odevler.StudentNoteSystem;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course matNote;
    Course fizikNote;
    Course kimyaNote;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya,Course matNote,Course fizikNote,Course kimyaNote) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.matNote = matNote;
        this.fizikNote = fizikNote;
        this.kimyaNote = kimyaNote;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }
    public void addBulkTeacherNote(int matNote, int fizikNote, int kimyaNote) {

        if (matNote >= 0 && matNote <= 100) {
            this.matNote.note = matNote;
        }

        if (fizikNote >= 0 && fizikNote <= 100) {
            this.fizikNote.note = fizikNote;
        }

        if (kimyaNote >= 0 && kimyaNote <= 100) {
            this.kimyaNote.note = kimyaNote;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0||this.fizikNote.note == 0 || this.kimyaNote.note == 0||this.matNote.note == 0 ) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note + this.kimya.note + this.mat.note)/3*0.80)+((this.fizikNote.note + this.kimyaNote.note + this.matNote.note)/3*0.20);
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note+" Sözlü : "+this.matNote.note);
        System.out.println("Fizik Notu : " + this.fizik.note+" Sözlü : "+this.fizikNote.note);
        System.out.println("Kimya Notu : " + this.kimya.note+" Sözlü : "+this.kimyaNote.note);
    }

}