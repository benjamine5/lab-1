Main
public class Main{
    public static void main(String[] args){
        System.out.println("A) Clientes.");
        System.out.println("B) Ejecutivos");

        String options = null;
        Scanner scan = new Scanner(System.in); // Capturing the input
        do {
            options = scan.nextLine();
            switch (options) {
                case "A":
                    // do what you want
                    break;
                case "B":
                    // do what you want
                    break;
            }
        } while (!options.equals("Q")); // quitting the program
    }
}