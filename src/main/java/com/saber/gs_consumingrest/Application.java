package com.saber.gs_consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Created by saber on 2019/4/5.
 */
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);

        String s = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", String.class);

        log.info(quote.toString());

        log.info(s);

    }

}
