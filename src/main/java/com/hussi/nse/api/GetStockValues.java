package com.hussi.nse.api;

// using apache api for http
//<dependency>
//<groupId>org.apache.httpcomponents</groupId>
//<artifactId>httpclient</artifactId>
//<version>4.5.10</version>
//</dependency>

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class GetStockValues
{


    // one instance, reuse
    private static final CloseableHttpClient httpClient = HttpClients.createDefault();

    public static void main3(String[] args)
    {
//        String uri = "https://www.google.com/search?q=mkyong";
        String uri = "https://www.nseindia.com/api/quote-equity?symbol="+ StockEnum.INDUSIND_BANK_LTD.getValue() +"&section=trade_info";
        HttpGet get_request = new HttpGet(uri);

        try (CloseableHttpResponse response = httpClient.execute(get_request)) {

            // Get HttpResponse Status
            callNSEApi(response);

        } catch (ClientProtocolException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void callNSEApi(CloseableHttpResponse response)
    {
        System.out.println(response.getStatusLine().toString());

        HttpEntity entity = response.getEntity();
        Header headers = entity.getContentType();
        System.out.println(headers);

        if (entity != null) {
            // return it as a String
            String result = null;
            try
            {
                result = EntityUtils.toString(entity);
            } catch (IOException e)
            {
                e.printStackTrace();
            }
            System.out.println(result);
        }
    }
}
