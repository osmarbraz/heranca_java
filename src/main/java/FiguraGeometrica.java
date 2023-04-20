
import javax.swing.JOptionPane;

public class FiguraGeometrica {

    private String cor;

    public FiguraGeometrica() {
        this("");
    }

    public FiguraGeometrica(String cor) {
        setCor(cor);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void leitura() {
        setCor(JOptionPane.showInputDialog("Digite a Cor"));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "A cor � " + getCor());
    }

    public String paraString() {
        return ("Cor : " + getCor());
    }
}
