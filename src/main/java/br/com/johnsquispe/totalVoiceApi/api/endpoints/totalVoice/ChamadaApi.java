package br.com.johnsquispe.totalVoiceApi.api.endpoints.totalVoice;

import br.com.johnsquispe.totalVoiceApi.api.ApiResponse;
import br.com.johnsquispe.totalVoiceApi.api.endpoints.TotalVoiceAPI;
import br.com.johnsquispe.totalVoiceApi.properties.clients.TotalVoiceProperties;
import org.apache.http.HttpHeaders;
import org.json.JSONObject;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ChamadaApi {

    @Autowired
    private TotalVoiceProperties totalVoiceProperties;

    public ApiResponse realizaChamadaEntreDoisNumeros (String numeroOrigem, String numeroDestino) {

        Map<String, String> headers = new HashMap<>();
        headers.put(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        headers.put("Access-Token", totalVoiceProperties.getToken());

        Map<String, String> dados = new HashMap<>();
        dados.put("numero_origem", numeroOrigem);
        dados.put("numero_destino", numeroDestino);

        JSONObject jsonObject = new JSONObject(dados);

        Response response = null;

        try {

            response = Jsoup.connect(totalVoiceProperties.getEndpoint() + TotalVoiceAPI.REALIZA_CHAMADA_ENTRE_DOIS_NUMEROS.getUrl())
                    .method(TotalVoiceAPI.REALIZA_CHAMADA_ENTRE_DOIS_NUMEROS.getMethod())
                    .ignoreContentType(true)
                    .requestBody(jsonObject.toString())
                    .headers(headers)
                    .execute();

        } catch (Exception e) {

            return new ApiResponse(response.statusCode());

        }

        return new ApiResponse(response.statusCode(), response.body());

    }

}
