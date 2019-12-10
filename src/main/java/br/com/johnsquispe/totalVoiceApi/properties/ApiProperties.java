package br.com.johnsquispe.totalVoiceApi.properties;

import br.com.johnsquispe.totalVoiceApi.properties.clients.TotalVoice;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiProperties {

    @ConfigurationProperties(prefix = "totalVoice")
    public TotalVoice totalVoice() {
        return new TotalVoice();
    }

}
