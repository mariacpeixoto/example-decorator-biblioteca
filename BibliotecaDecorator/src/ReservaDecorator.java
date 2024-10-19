
public class ReservaDecorator extends MaterialDecorator {

    public ReservaDecorator(Material material) {
        super(material);
    }

    public void reservar() {
        System.out.println(getDescricao() + " foi reservado.");
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " [Reservado]";
    }
}

