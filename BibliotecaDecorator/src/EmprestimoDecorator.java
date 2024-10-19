
public class EmprestimoDecorator extends MaterialDecorator {

    public EmprestimoDecorator(Material material) {
        super(material);
    }

    public void emprestar() {
        System.out.println(getDescricao() + " foi emprestado.");
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " [Emprestado]";
    }
}

