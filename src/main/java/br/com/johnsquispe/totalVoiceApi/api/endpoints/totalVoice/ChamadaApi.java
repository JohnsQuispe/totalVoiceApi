package br.com.johnsquispe.totalVoiceApi.api.endpoints.totalVoice;

import br.com.johnsquispe.totalVoiceApi.api.ApiResponse;
import br.com.johnsquispe.totalVoiceApi.api.endpoints.TotalVoiceAPI;
import br.com.johnsquispe.totalVoiceApi.properties.clients.TotalVoiceProperties;
import br.com.totalvoice.TotalVoiceClient;
import br.com.totalvoice.api.Chamada;
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

    public String realizaChamadaEntreDoisNumeros (String numeroOrigem, String numeroDestino) throws Exception {

        //Token recolocada para assegurar funcionalidade da aplicação

        TotalVoiceClient client = new TotalVoiceClient("672e3ef3f866e87dc781065a54722482");
        Chamada chamada = new Chamada(client);

        JSONObject result = chamada.ligar("987906887", "987906887");
        System.out.println(result);
        return JSONObject.valueToString(result);

    }


        /*
        Map<String, String> headers = new HashMap<>();
        headers.put(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        headers.put("Access-Token", totalVoiceProperties.getToken());

        Map<String, String> dados = new HashMap<>();
        dados.put("numero_origem", numeroOrigem);
        dados.put("numero_destino", numeroDestino);

        JSONObject jsonObject = new JSONObject(dados);
        System.out.println(jsonObject);

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
*/


}
