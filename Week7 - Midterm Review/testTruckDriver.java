public class testTruckDriver {
    public static void main(String[] args) {
        TruckDriver jake = new TruckDriver();
        jake.setName("Jake Vendegna");
        jake.setEmail("jake@gmail.com");
        jake.setMessage("Hi, I'm Jake the Truck Driver");
        jake.setGender('m');
        
        jake.speak();
        
        System.out.println(jake);
    }
}