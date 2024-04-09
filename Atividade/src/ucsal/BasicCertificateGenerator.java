package ucsal;

public class BasicCertificateGenerator implements CertificateGenerator {
    private String studentName;
    private String date;
    private String course;

    public BasicCertificateGenerator(String studentName, String date, String course) {
        this.studentName = studentName;
        this.date = date;
        this.course = course;
    }

    @Override
    public void generate(String name) {
        System.out.println("Gerando certificado básico para " + studentName);
        System.out.println("Data: " + date);
        System.out.println("Curso: " + course);
    }

    @Override
    public void setStudentInfo(String name, String date, String course) {
        this.studentName = name;
        this.date = date;
        this.course = course;
    }

    @Override
    public void setInstitutionInfo(String institutionName, String city) {
        // Não é necessário implementar para certificado básico
    }
}
