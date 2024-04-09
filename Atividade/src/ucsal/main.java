package ucsal;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CertificateGenerationComponent component = new CertificateGenerationComponent();

        // Inicializando os geradores básico e avançado
        BasicCertificateGenerator basicGenerator = new BasicCertificateGenerator("", "", "");
        AdvancedCertificateGenerator advancedGenerator = new AdvancedCertificateGenerator("", "", "", "", "");
        component.setBasicGenerator(basicGenerator);
        component.setAdvancedGenerator(advancedGenerator);

        // Adicionando templates de certificado
      component.addTemplate(new CertificateTemplate("basic"));
      //  component.addTemplate(new CertificateTemplate("advanced"));

        // Solicitar ao usuário os dados do certificado básico
        System.out.println("Por favor, insira o nome do aluno:");
        String studentName = scanner.nextLine();

        System.out.println("Por favor, insira a data do certificado (DD/MM/AAAA):");
        String date = scanner.nextLine();

        System.out.println("Por favor, insira o curso:");
        String course = scanner.nextLine();

        // Configurar as informações do certificado básico
        component.getBasicGenerator().setStudentInfo(studentName, date, course);

        // Solicitar ao usuário os dados do certificado avançado
        System.out.println("Por favor, insira o nome da instituição:");
        String institutionName = scanner.nextLine();

        System.out.println("Por favor, insira a cidade:");
        String city = scanner.nextLine();

        // Configurar as informações do certificado avançado
        component.getAdvancedGenerator().setStudentInfo(studentName, date, course);
        component.getAdvancedGenerator().setInstitutionInfo(institutionName, city);

        // Gerando certificados para um nome específico
        component.generateCertificates(studentName);

        // Encerrando o componente
        component.shutdown();
        scanner.close();
    }
}