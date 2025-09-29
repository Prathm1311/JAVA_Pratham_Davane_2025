class Student {


    static class Marks{
        String subject;
        int score;

        public Marks(String subject, int score) {
            this.subject = subject;
            this.score = score;
        }
        
        public void display(){
            System.out.print(subject);
            System.out.println(score);
        }
    }

}
class Main{
    public static void main(String[] args) {
 
        Student.Marks stud1 = new Student.Marks("Physic: ", 98);
        Student.Marks stud2 = new Student.Marks("Chemistry: ", 91);

        stud1.display();
        stud2.display();
        
    }
}