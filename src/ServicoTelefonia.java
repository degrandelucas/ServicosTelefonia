import java.util.Scanner;

public class ServicoTelefonia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        try {
            
            System.out.println("Digite o serviço que deseja falar sobre: '1 - movel', '2 - fixa', '3 - banda larga', '4 - tv'");
            int numeroServico = scanner.nextInt();
            // Consumir a nova linha pendente no buffer após o nextInt()
            scanner.nextLine();

            if (numeroServico < 1 || numeroServico > 4) {
                throw new IllegalArgumentException("Opção selecionada é inválida");
            }
            
            String servico = (numeroServico == 1) ? "movel" : 
                             (numeroServico == 2) ? "fixa" : 
                             (numeroServico == 3) ? "banda larga" : 
                             (numeroServico == 4) ? "tv" : "invalido";

            System.out.print("o serviço que deseja falar sobre é " + servico);                        

            // Entrada do nome do cliente e os serviços contratados
            System.out.println("");
            System.out.println("");
            System.out.println("Digite seu nome e os serviços atuais contratados, separados apenas por ',': ");
            String entradaCliente = scanner.nextLine().trim();
            
            // Separando o nome do cliente e os serviços contratados
            String[] partes = entradaCliente.split(",");
            String nomeCliente = partes[0];
            boolean contratado = false;
            
            // TODO: Verifique se o serviço está na lista de serviços contratados
            for (int i = 0; i < partes.length; i++)
            {
                if (servico.equals(partes[i])) {
                    contratado = true;                    
                }
            }

            if (contratado == true) {
                System.out.println("O servico " + servico + " do(a) cliente " + nomeCliente + " está contratado");                
            }

            else System.out.println("Serviço não contratado pelo cliente");                


        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e.getMessage());
        }
 
        finally{
            scanner.close();
        }
        
    }
}