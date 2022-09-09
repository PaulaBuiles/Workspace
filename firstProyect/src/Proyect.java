public class Proyect {
    import java.util.Scanner;

        public static void main(String[] args) {
            System.out.println("Ingrese la URL");
            Scanner sc = new Scanner(System.in);
            String url = sc.next();
            String [] str= url.split("[_]");
            System.out.println("Bienvenid@ "+str[1]);
        }
}
