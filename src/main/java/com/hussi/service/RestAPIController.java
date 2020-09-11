package com.hussi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
public class RestAPIController
{
    @Resource
    ObjectMapper objectMapper;

    @Autowired
    private StockFetchService stockFetchService;

    private static final Logger logger = LoggerFactory.getLogger(RestAPIController.class);

    @RequestMapping(value = "/hussi/stocks", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    String getStockValue(@RequestParam("stock_symbol") String stock_symbol)
    {
//        return stockFetchService.fetchStockData(stock_symbol);
        return stockFetchService.fetchStockData2(stock_symbol);
    }

}
