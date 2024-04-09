package ucsal;

import java.util.ArrayList;
import java.util.List;

public class CertificateTemplateManager {
	 private List<CertificateTemplate> templates;
	    
	    public CertificateTemplateManager() {
	        this.templates = new ArrayList<>();
	    }
	    
	    public void addTemplate(CertificateTemplate template) {
	        templates.add(template);
	    }
	    
	    public List<CertificateTemplate> getTemplates() {
	        return templates;
	    }
}
