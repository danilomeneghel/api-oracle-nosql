package api.nosql.config;

import oracle.nosql.driver.NoSQLHandleConfig;
import oracle.nosql.driver.Region;
import oracle.nosql.driver.iam.SignatureProvider;
import com.oracle.nosql.spring.data.config.AbstractNosqlConfiguration;
import com.oracle.nosql.spring.data.config.NosqlDbConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import java.io.File;

@Configuration
public class AppConfig extends AbstractNosqlConfiguration {

    private String tenantId = null;
    private String userId = null;
    private String fingerprint = null;
    private char[] passphrase = null;
    private Region region = null;
    private String compartment = null;

    @Bean
    public NosqlDbConfig nosqlDbConfig() throws java.io.IOException {
        File privateKey = ResourceUtils.getFile("classpath:private_key.pem");
        NoSQLHandleConfig noSQLHandleConfig = new NoSQLHandleConfig(
                new SignatureProvider(
                        tenantId,
                        userId,
                        fingerprint,
                        privateKey,
                        passphrase,
                        region
                )
        );
        noSQLHandleConfig.setDefaultCompartment(compartment);
        return new NosqlDbConfig(noSQLHandleConfig);
    }

}
