public class TestAuthor {

    public static void main(String[] args) {
        Author jerry = new Author("Jerry", "Jerry@gmail.com"," Duhhh,... Jerrryyy!", 'm');
        
        System.out.println(jerry.toString());
        
        Author betsy = new Author();
        
        betsy.setName("Betsy");
        betsy.setEmail("Betsy@gmail.com");
        betsy.setMessage("Hi, I'm Betsy.");
        betsy.setGender('f');
        
        System.out.println(betsy.toString());
        
        Author jakob = new Author("", "", "", 'z');
        
        System.out.print(jakob.toString());
        
        jakob.setName("Jakob");
        jakob.setMessage("Hello, I am Jake, I like rocks and blocks.");
        
        System.out.println(jakob.toString());
    }
}