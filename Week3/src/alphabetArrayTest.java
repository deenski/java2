public class alphabetArrayTest {
    public static void main(String[] args) {
        char[] alphabet = "~!@#$%^&*()`-_=+[]{}\\|;':\",.<>/?".toCharArray();
        
        
        System.out.println(alphabet[1]);
        
        for (int i= 0; i < (27*2); i++) {
            for (int j = 0; j <= 9; j++) {
                    System.out.print(alphabet[i] + "" + j + " ");
                    System.out.print(j + "" + alphabet[i] + " ");

             
            
            }
            System.out.println();
        }   
    }
}