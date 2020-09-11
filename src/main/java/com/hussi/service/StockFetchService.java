package com.hussi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hussi.nse.api.GetStockValues;
import com.hussi.nse.api.StockEnum;
import com.hussi.nse.api.pojo.StockPojo;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.commons.httpclient.HttpClient;

import java.io.IOException;

@Service
public class StockFetchService
{
    @Autowired
    private static final CloseableHttpClient httpClient = HttpClients.createDefault();

    @Autowired
    ObjectMapper mapper = new ObjectMapper();



    public String fetchStockData(String stock_symbol)
    {

        String uri = "https://www.nseindia.com/api/quote-equity?symbol="+ StockEnum.INDUSIND_BANK_LTD.getValue() +"&section=trade_info";
        HttpGet get_request = new HttpGet(uri);

        try (CloseableHttpResponse response = httpClient.execute(get_request))
        {

            StockPojo stockPojo = new StockPojo();
            stockPojo = mapper.readValue(response.toString(),StockPojo.class);


            // Get HttpResponse Status
            GetStockValues.callNSEApi(response);

        } catch (ClientProtocolException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        return stock_symbol;
    }

    public String fetchStockData2(String stock_symbol)
    {
        HttpClient apache_http_client = new HttpClient();
        String url = "https://www.nseindia.com/api/quote-equity?symbol=FCONSUMER&section=trade_info";
        GetMethod getMethod = new GetMethod(url);
        int statusCode ;

        try
        {
            statusCode = apache_http_client.executeMethod(getMethod);

            System.out.println("==>"+getMethod.getResponseBodyAsString());
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        return stock_symbol;
    }
}
