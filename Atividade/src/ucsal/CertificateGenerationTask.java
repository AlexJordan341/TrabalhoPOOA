package ucsal;

public class CertificateGenerationTask implements Runnable {

	 private CertificateGenerator generator;
	    private String name;
	    
	    public CertificateGenerationTask(CertificateGenerator generator, String name) {
	        this.generator = generator;
	        this.name = name;
	    }
	    
	    @Override
	    public void run() {
	        generator.generate(name);
	    }
	
	
}
