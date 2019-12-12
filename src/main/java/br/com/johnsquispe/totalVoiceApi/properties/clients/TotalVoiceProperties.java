package br.com.johnsquispe.totalVoiceApi.properties.clients;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "totalvoice")
public class TotalVoiceProperties {

    private String token = "8559645222e455665cc6986ed38de770";

    private String endpoint = "https://api.totalvoice.com.br";

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
