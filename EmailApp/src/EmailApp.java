public class EmailApp {

    public static void main(String args[]){

        Email em=new Email("Deepika","Jha");
        System.out.println(em);
        em.setmailboxCapacity(700);
        System.out.println(em);
        em.setAlternateEmail("deepujha@gmail.com");
        System.out.println(em.getAlternateEmail());


    }
}
