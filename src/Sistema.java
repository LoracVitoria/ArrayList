import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Sistema {


    Passageiro p1 = new Passageiro();
    Passageiro p2 = new Passageiro();
    Passageiro p3 = new Passageiro();

    ArrayList<Passageiro> tripulantes = new ArrayList<Passageiro>();
    ArrayList<Voo> voos = new ArrayList<Voo>();
    ArrayList<Companhia> companhias = new ArrayList<Companhia>();

    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    Scanner scan3 = new Scanner(System.in);
    Scanner scan4 = new Scanner(System.in);

    Companhia c1 = new Companhia();
    Companhia c2 = new Companhia();



    Voo v1 = new Voo();
    Voo v2 = new Voo();
    Voo v3 = new Voo();
    Voo v4 = new Voo();
    Voo v5 = new Voo();


    public Sistema() {
        menu();

    }


    void menu(){
        Integer opcao = 7;
        while (opcao != 0) {
            System.out.println("---------------");
            System.out.println("MENU");
            System.out.println("---------------");
            System.out.println("1. Cadastrar passageiros");
            System.out.println("2. Listar passageiros");
            System.out.println("3. Consultar passageiro");
            System.out.println("4. Remover passageiros");
            System.out.println("5. Cadastrar companhias");
            System.out.println("6. Cadastrar voos");
            System.out.println("7. Listar Companhias");
            System.out.println("8. Listar Voos");
            System.out.println("9. Consultar passageiros em um voo");
            System.out.println("0. Sair");
            System.out.println("\n");
            opcao = scan.nextInt();

            if(opcao==1){
                cadastrarPas();
            }else if(opcao==2){
                listarPas();
            }else if(opcao==3){
                consultarPas();
            }else if(opcao==4){
                removerPas();
            }else if (opcao==5){
                cadastrarCompanhias();
            }else if (opcao==6) {
                cadastrarVoos();
            }else if(opcao==7){
                listarCompanhias();
            }else if(opcao==8){
                listarVoos();
            }else if(opcao==9){
                consultarVoo();
            }else if(opcao==0){
                break;
            }else{
                System.out.println("Opção inválida! Tente novamente!");
                continue;
            }
        }
    }



    public static void main(String[] args) {
        Sistema sis = new Sistema();

    }

    void cadastrarPas() {

        p1.setCpf("123.123.123-12");
        p1.setNome("Marcos");
        p1.setTelefone(999444444);
        tripulantes.add(p1);

        p2.setCpf("234.234.234-23");
        p2.setNome("Ana");
        p2.setTelefone(991555555);
        tripulantes.add(p2);

        p3.setCpf("345.345.345-34");
        p3.setNome("Lucas");
        p3.setTelefone(988666666);
        tripulantes.add(p3);

        v1.setTripulantes(tripulantes);
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("\n");
    }

    void listarPas() {
        Iterator<Passageiro> it = v1.getTripulantes().iterator();
        while (it.hasNext()) {
            Passageiro pas = it.next();
            System.out.println("Passageiro: " + pas.getNome() + "   CPF: " + pas.getCpf() + "\nTelefone: " +pas.getTelefone());
        }
        System.out.println("\n");
    }

    void consultarPas() {

        System.out.println("Digite o CPF do passageiro: ");

        Iterator<Passageiro> it3 = tripulantes.iterator();
        String cpfParaConsultar = scan3.next();


        while (it3.hasNext()) {
            Passageiro pas = it3.next();
            if (pas.getCpf().equals(cpfParaConsultar)) {
                System.out.println("Passageiro: " + pas.getNome() + "   CPF: " + pas.getCpf() + "\nTelefone: " +pas.getTelefone());
                break;
            }
        }
        System.out.println("\n");
    }

    void removerPas() {

        System.out.println("Digite o CPF do passageiro a ser removido: ");

        Iterator<Passageiro> it2 = tripulantes.iterator();
        String cpfParaRemover = scan2.next();

        while (it2.hasNext()) {
            if (it2.next().getCpf().equals(cpfParaRemover)) {
                System.out.println("\nPassageiro a ser removido encontrado comparando o conteúdo dos objetos! ");
                it2.remove();
                System.out.println("Passageiro removido! ");
                break;
            }else{
                System.out.println("Não encontrado!");
            }        }
        System.out.println("\n");
    }

//    @Override
//    public String toString() {
//        return "Sistema{" +
//                "c1=" + c1 +
//                ", c2=" + c2 +
//                '}';
//    }

    void cadastrarVoos(){
        v1.setDestino("São Paulo");
        v1.setSaida("Rio de Janeiro");
        v1.setCodigo(333);
        c1.voos.add(v1);

        v2.setDestino("Londres");
        v2.setSaida("Rio de Janeiro");
        v2.setCodigo(222);
        c2.voos.add(v2);

        v3.setDestino("Curitiba");
        v3.setSaida("Rio de Janeiro");
        v3.setCodigo(666);
        c1.voos.add(v3);


        v4.setDestino("Recife");
        v4.setSaida("Rio de Janeiro");
        v4.setCodigo(999);
        c1.voos.add(v4);


        v5.setDestino("Roma");
        v5.setSaida("Rio de Janeiro");
        v5.setCodigo(444);
        c2.voos.add(v5);


        System.out.println("Cadastro realizado com sucesso!\n");


    }
    void cadastrarCompanhias(){

        c1.setNomeSocial("Azul");
        c1.setCnpj("09.305.994/0001-29");
        companhias.add(c1);

        c2.setNomeSocial("Latam");
        c2.setCnpj("33.937.681/0001-78");
        companhias.add(c2);

        System.out.println("Cadastro realizado com sucesso! \n");

    }

    void listarCompanhias(){
        Iterator<Companhia> it4 = companhias.iterator();
        while (it4.hasNext()) {
            Companhia comp = it4.next();
            System.out.println("Companhia: " + comp.getNomeSocial() + "   CNPJ: " + comp.getCnpj());
        }
        System.out.println("\n");
    }
    void listarVoos(){
        Iterator<Voo> it5 = c1.voos.iterator();
        while (it5.hasNext()) {
            Voo vo = it5.next();
            System.out.println("Destino: " + vo.getDestino() + "   Saída: " + vo.getSaida() + "\nCódigo: " + vo.getCodigo());
        }
        Iterator<Voo> it6 = c2.voos.iterator();
        while (it6.hasNext()) {
            Voo vo = it6.next();
            System.out.println("Destino: " + vo.getDestino() + "   Saída: " + vo.getSaida() + "\nCódigo: " + vo.getCodigo());
        }
        System.out.println("\n");
    }
    void consultarVoo(){
        System.out.println("Digite o código do voo: ");

        Iterator<Companhia> it6 = companhias.iterator();
        String codigoConsulta = scan4.next();
        Integer i = 0;

        while (it6.hasNext()) {
            Companhia c = it6.next();
            Iterator<Voo> it7 = c.voos.iterator();
            while (it7.hasNext()) {
                i++;
                Voo vo = it7.next();
                Integer cod = Integer.parseInt(codigoConsulta);
                if (vo.getCodigo() .equals(cod)) {
                    Iterator<Passageiro> it9 = vo.tripulantes.iterator();
                    while (it9.hasNext()) {
                        Passageiro p = it9.next();
                        System.out.println("Passageiro: " + p.getNome() + "   CPF: " + p.getCpf() + "\nTelefone: " + p.getTelefone());

                    }
                    break;
                }
            }
        }

        System.out.println("\n");
    }

}