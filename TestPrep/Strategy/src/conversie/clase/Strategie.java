package conversie.clase;

public class Strategie {
    private ConversieValutara conversieValutara;

    public void setConversieValutara(ConversieValutara conversieValutara) {
        this.conversieValutara = conversieValutara;
    }

    public double efectueazaConversie(double suma) {
        if (conversieValutara != null) {
            return conversieValutara.converteste(suma);
        } else {
            throw new UnsupportedOperationException("There is no strategy selected");
        }
    }
}
