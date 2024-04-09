package ucsal;

public class AdvancedCertificateGenerator implements CertificateGenerator {
	 private String studentName;
	    private String date;
	    private String course;
	    private String institutionName;
	    private String city;

	    public AdvancedCertificateGenerator(String studentName, String date, String course, String institutionName, String city) {
	        this.studentName = studentName;
	        this.date = date;
	        this.course = course;
	        this.institutionName = institutionName;
	        this.city = city;
	    }

	    @Override
	    public void generate(String name) {
	        System.out.println("Gerando certificado avançado para " + studentName);
	        
	        System.out.println("Data: " + date);
	        System.out.println("Curso: " + course);
	        System.out.println("Instituição: " + institutionName);
	        System.out.println("Cidade: " + city);
	    }

	    @Override
	    public void setStudentInfo(String name, String date, String course) {
	        this.studentName = name;
	        this.date = date;
	        this.course = course;
	    }

	    @Override
	    public void setInstitutionInfo(String institutionName, String city) {
	        this.institutionName = institutionName;
	        this.city = city;
	    }
	
}
