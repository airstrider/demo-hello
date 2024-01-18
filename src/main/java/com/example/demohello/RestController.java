package com.example.demohello;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class RestController {
    // final String simpleLinearRegressionUrl =
    // "http://localhost:5010/linear/simple";
    // final String simpleLinearRegressionUrl =
    // "http://10.0.0.94:5000/linear/simple";
    final String simpleLinearRegressionUrl = "http://10.0.0.202:5000/linear/simple";
    RestTemplate restTemplate = new RestTemplate();

    @PostMapping(value = "linear/simple/rest")
    @ResponseBody
    public String predictSimpleRest(@RequestBody String request) throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        System.out.println("request[J] : " + request);

        return getResponse(request, headers);
    }

    private String getResponse(String request, HttpHeaders headers) {
        HttpEntity<String> entity = new HttpEntity<String>(request, headers);
        String response = restTemplate.postForObject(simpleLinearRegressionUrl,
                entity, String.class);
        return response;
    }

}
