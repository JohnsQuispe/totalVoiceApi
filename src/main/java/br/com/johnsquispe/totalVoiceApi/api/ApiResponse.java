package br.com.johnsquispe.totalVoiceApi.api;

public class ApiResponse {

    private int statusCode;
    private String resposeBody;

    public ApiResponse () {

    }

    public ApiResponse(int statusCode) {
        this.statusCode = statusCode;
    }

    public ApiResponse (int statusCode, String resposeBody) {

        this.statusCode = statusCode;
        this.resposeBody = resposeBody;

    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getResposeBody() {
        return resposeBody;
    }

    public void setResposeBody(String resposeBody) {
        this.resposeBody = resposeBody;
    }
}
