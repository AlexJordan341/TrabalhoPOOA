package ucsal;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CertificateGenerationComponent {

    private BasicCertificateGenerator basicGenerator;
    private AdvancedCertificateGenerator advancedGenerator;
    private CertificateTemplateManager templateManager;
    private ExecutorService executor;

    public CertificateGenerationComponent() {
        this.templateManager = new CertificateTemplateManager();
        this.executor = Executors.newFixedThreadPool(5); // Pode ajustar o número de threads conforme necessário
    }

    public void addTemplate(CertificateTemplate template) {
        templateManager.addTemplate(template);
    }

    public void generateCertificates(String name) {
        List<CertificateTemplate> templates = templateManager.getTemplates();
        for (CertificateTemplate template : templates) {
            CertificateGenerator generator = createGenerator(template);
            executor.execute(new CertificateGenerationTask(generator, name));
        }
    }

    private CertificateGenerator createGenerator(CertificateTemplate template) {
        // Lógica para determinar qual tipo de gerador usar com base no template
        if ("basic".equals(template.getTemplateName())) {
            return basicGenerator;
        } else {
            return advancedGenerator;
        }
    }

    public void shutdown() {
        executor.shutdown();
    }

    public BasicCertificateGenerator getBasicGenerator() {
        return basicGenerator;
    }

    public void setBasicGenerator(BasicCertificateGenerator basicGenerator) {
        this.basicGenerator = basicGenerator;
    }

    public AdvancedCertificateGenerator getAdvancedGenerator() {
        return advancedGenerator;
    }

    public void setAdvancedGenerator(AdvancedCertificateGenerator advancedGenerator) {
        this.advancedGenerator = advancedGenerator;
    }
}