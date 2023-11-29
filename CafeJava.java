public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 8.5;
        double dripcoffeePrice = 3.5;
        double latte = 9.5;
        double cappuccino = 6.3;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(isReadyOrder1 ? readyMessage : pendingMessage);

        // Noah Order
        if(isReadyOrder4 == true){
            System.out.println(readyMessage);
            System.out.println(displayTotalMessage + cappuccino);

        }else{
            System.out.println(pendingMessage);
        }

        // Sam Order
       System.out.println(displayTotalMessage + latte*2);

       if(isReadyOrder2 == true){
            System.out.println(readyMessage);

        }else{
            System.out.println(pendingMessage);
        }

        // Jimmy Order
         System.out.println(displayTotalMessage + (latte - dripcoffeePrice));

    }
}
