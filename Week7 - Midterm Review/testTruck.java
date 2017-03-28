public class testTruck {
    public static void main(String[] args) {
//         Truck trizzy = new Truck();
//         
//         System.out.print(trizzy);
//         
        TruckDriver jake = new TruckDriver();
        jake.setName("Jake Vendegna");
        jake.setEmail("jake@gmail.com");
        jake.setMessage("Hi, I'm Jake the Truck Driver");
        jake.setGender('m');
// 
//         
//         Truck astrid = new Truck("RAM", "2500 Cummins 5.9L", "ROOOAAAARRRR!", 2006, jake);
//         
//         System.out.print(astrid);
//         
//         System.out.println(astrid.playSound());

        Truck testTruck = new Truck("Toyota", "Tacoma", "Meep Meep!", 1900, jake);
        System.out.println(testTruck);
    }
}