public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    String cadena= " https://www.url.com/categoria/user_name_#/perfil";
    String [] partes = cadena.split("_");
    String parte1= partes[0];
    System.out.println(Arrays.asList(partes));
}