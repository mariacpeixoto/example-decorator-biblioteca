
public class Biblioteca {
    public static void main(String[] args) {
        Material romance = new Romance();
        Material dicionario = new Dicionario();

        // Adicionando funcionalidade de empréstimo ao romance
        Material romanceEmprestado = new EmprestimoDecorator(romance);
        System.out.println(romanceEmprestado.getDescricao());
        ((EmprestimoDecorator) romanceEmprestado).emprestar();

        // Adicionando funcionalidade de reserva ao dicionário
        Material dicionarioReservado = new ReservaDecorator(dicionario);
        System.out.println(dicionarioReservado.getDescricao());
        ((ReservaDecorator) dicionarioReservado).reservar();

        // Adicionando funcionalidade de empréstimo e reserva ao dicionário
        Material dicionarioEmprestadoReservado = new EmprestimoDecorator(dicionarioReservado);
        System.out.println(dicionarioEmprestadoReservado.getDescricao());
        ((EmprestimoDecorator) dicionarioEmprestadoReservado).emprestar();
    }
}

