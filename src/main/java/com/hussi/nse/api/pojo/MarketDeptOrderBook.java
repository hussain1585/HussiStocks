
package com.hussi.nse.api.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalBuyQuantity",
    "totalSellQuantity",
    "bid",
    "ask",
    "tradeInfo",
    "valueAtRisk"
})
public class MarketDeptOrderBook {

    @JsonProperty("totalBuyQuantity")
    private long totalBuyQuantity;
    @JsonProperty("totalSellQuantity")
    private long totalSellQuantity;
    @JsonProperty("bid")
    private List<Bid> bid = null;
    @JsonProperty("ask")
    private List<Ask> ask = null;
    @JsonProperty("tradeInfo")
    private TradeInfo tradeInfo;
    @JsonProperty("valueAtRisk")
    private ValueAtRisk valueAtRisk;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MarketDeptOrderBook() {
    }

    /**
     * 
     * @param valueAtRisk
     * @param totalSellQuantity
     * @param ask
     * @param totalBuyQuantity
     * @param tradeInfo
     * @param bid
     */
    public MarketDeptOrderBook(long totalBuyQuantity, long totalSellQuantity, List<Bid> bid, List<Ask> ask, TradeInfo tradeInfo, ValueAtRisk valueAtRisk) {
        super();
        this.totalBuyQuantity = totalBuyQuantity;
        this.totalSellQuantity = totalSellQuantity;
        this.bid = bid;
        this.ask = ask;
        this.tradeInfo = tradeInfo;
        this.valueAtRisk = valueAtRisk;
    }

    @JsonProperty("totalBuyQuantity")
    public long getTotalBuyQuantity() {
        return totalBuyQuantity;
    }

    @JsonProperty("totalBuyQuantity")
    public void setTotalBuyQuantity(long totalBuyQuantity) {
        this.totalBuyQuantity = totalBuyQuantity;
    }

    public MarketDeptOrderBook withTotalBuyQuantity(long totalBuyQuantity) {
        this.totalBuyQuantity = totalBuyQuantity;
        return this;
    }

    @JsonProperty("totalSellQuantity")
    public long getTotalSellQuantity() {
        return totalSellQuantity;
    }

    @JsonProperty("totalSellQuantity")
    public void setTotalSellQuantity(long totalSellQuantity) {
        this.totalSellQuantity = totalSellQuantity;
    }

    public MarketDeptOrderBook withTotalSellQuantity(long totalSellQuantity) {
        this.totalSellQuantity = totalSellQuantity;
        return this;
    }

    @JsonProperty("bid")
    public List<Bid> getBid() {
        return bid;
    }

    @JsonProperty("bid")
    public void setBid(List<Bid> bid) {
        this.bid = bid;
    }

    public MarketDeptOrderBook withBid(List<Bid> bid) {
        this.bid = bid;
        return this;
    }

    @JsonProperty("ask")
    public List<Ask> getAsk() {
        return ask;
    }

    @JsonProperty("ask")
    public void setAsk(List<Ask> ask) {
        this.ask = ask;
    }

    public MarketDeptOrderBook withAsk(List<Ask> ask) {
        this.ask = ask;
        return this;
    }

    @JsonProperty("tradeInfo")
    public TradeInfo getTradeInfo() {
        return tradeInfo;
    }

    @JsonProperty("tradeInfo")
    public void setTradeInfo(TradeInfo tradeInfo) {
        this.tradeInfo = tradeInfo;
    }

    public MarketDeptOrderBook withTradeInfo(TradeInfo tradeInfo) {
        this.tradeInfo = tradeInfo;
        return this;
    }

    @JsonProperty("valueAtRisk")
    public ValueAtRisk getValueAtRisk() {
        return valueAtRisk;
    }

    @JsonProperty("valueAtRisk")
    public void setValueAtRisk(ValueAtRisk valueAtRisk) {
        this.valueAtRisk = valueAtRisk;
    }

    public MarketDeptOrderBook withValueAtRisk(ValueAtRisk valueAtRisk) {
        this.valueAtRisk = valueAtRisk;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public MarketDeptOrderBook withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalBuyQuantity", totalBuyQuantity).append("totalSellQuantity", totalSellQuantity).append("bid", bid).append("ask", ask).append("tradeInfo", tradeInfo).append("valueAtRisk", valueAtRisk).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(valueAtRisk).append(totalSellQuantity).append(ask).append(totalBuyQuantity).append(tradeInfo).append(additionalProperties).append(bid).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MarketDeptOrderBook) == false) {
            return false;
        }
        MarketDeptOrderBook rhs = ((MarketDeptOrderBook) other);
        return new EqualsBuilder().append(valueAtRisk, rhs.valueAtRisk).append(totalSellQuantity, rhs.totalSellQuantity).append(ask, rhs.ask).append(totalBuyQuantity, rhs.totalBuyQuantity).append(tradeInfo, rhs.tradeInfo).append(additionalProperties, rhs.additionalProperties).append(bid, rhs.bid).isEquals();
    }

}
