package de.dfki.cos.basys.aas.server.configuration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "basys.aas-server.mqtt")
public class BaSyxMqttConfiguration {
    public boolean enabled = false;
    public String user = org.eclipse.basyx.components.configuration.BaSyxMqttConfiguration.DEFAULT_USER;
    public String pass = org.eclipse.basyx.components.configuration.BaSyxMqttConfiguration.DEFAULT_PASS;
    public String server = org.eclipse.basyx.components.configuration.BaSyxMqttConfiguration.DEFAULT_SERVER;
    public int qos = Integer.parseInt(org.eclipse.basyx.components.configuration.BaSyxMqttConfiguration.DEFAULT_QOS);

    public org.eclipse.basyx.components.configuration.BaSyxMqttConfiguration toLegacyConfig() {
        return new org.eclipse.basyx.components.configuration.BaSyxMqttConfiguration(user, pass, server, qos);
    }
}
