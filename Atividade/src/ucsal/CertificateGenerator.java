package ucsal;

public interface CertificateGenerator {
	void generate(String name);
    void setStudentInfo(String name, String date, String course);
    void setInstitutionInfo(String institutionName, String city);
}
 