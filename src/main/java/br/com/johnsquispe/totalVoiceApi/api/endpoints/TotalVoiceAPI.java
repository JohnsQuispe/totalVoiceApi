package br.com.johnsquispe.totalVoiceApi.api.endpoints;

import org.jsoup.Connection.Method;

public enum TotalVoiceAPI {

    REALIZA_CHAMADA_ENTRE_DOIS_NUMEROS("/chamada", Method.POST);

    private String url;
    private Method method;

    TotalVoiceAPI(String url, Method method) {
        this.url = url;
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public Method getMethod() {
        return method;
    }
}
