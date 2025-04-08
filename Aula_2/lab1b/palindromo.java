package lab1b;

public class palindromo {

    private String texto;

    public palindromo() {
        this.texto = "";
    }

    public palindromo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        if (texto != null) {
            this.texto = texto;
        }
    }

    public boolean verificar() {
        String limpo = texto.replaceAll(" ", "").toLowerCase();
        int i = 0, j = limpo.length() - 1;

        while (i < j) {
            if (limpo.charAt(i++) != limpo.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}