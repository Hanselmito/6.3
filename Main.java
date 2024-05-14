public class Main {
    public static void main(String[] args) {
        String texto = "El RisasLoL";
        String textoConPuntos = "";

        for (int i = 0; i < texto.length(); i++) {
            textoConPuntos += "." + texto.charAt(i) + ".";
        }

        System.out.println(textoConPuntos);
    }
}