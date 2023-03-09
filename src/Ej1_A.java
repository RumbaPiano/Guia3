public class Ej1_A {
    public static void main(String[] args) {
        String cadena = "Mi nombre es Tomás Neri Pubill";
        char letra = 'e';
        int cantidadDeLetras = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                cantidadDeLetras = cantidadDeLetras + 1;
            }
        }
        System.out.println(cantidadDeLetras);
    }
}
