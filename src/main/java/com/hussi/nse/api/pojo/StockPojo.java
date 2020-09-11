
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
    "noBlockDeals",
    "bulkBlockDeals",
    "marketDeptOrderBook",
    "securityWiseDP"
})
public class StockPojo {

    @JsonProperty("noBlockDeals")
    private boolean noBlockDeals;
    @JsonProperty("bulkBlockDeals")
    private List<BulkBlockDeal> bulkBlockDeals = null;
    @JsonProperty("marketDeptOrderBook")
    private MarketDeptOrderBook marketDeptOrderBook;
    @JsonProperty("securityWiseDP")
    private SecurityWiseDP securityWiseDP;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public StockPojo() {
    }

    /**
     * 
     * @param bulkBlockDeals
     * @param noBlockDeals
     * @param marketDeptOrderBook
     * @param securityWiseDP
     */
    public StockPojo(boolean noBlockDeals, List<BulkBlockDeal> bulkBlockDeals, MarketDeptOrderBook marketDeptOrderBook, SecurityWiseDP securityWiseDP) {
        super();
        this.noBlockDeals = noBlockDeals;
        this.bulkBlockDeals = bulkBlockDeals;
        this.marketDeptOrderBook = marketDeptOrderBook;
        this.securityWiseDP = securityWiseDP;
    }

    @JsonProperty("noBlockDeals")
    public boolean isNoBlockDeals() {
        return noBlockDeals;
    }

    @JsonProperty("noBlockDeals")
    public void setNoBlockDeals(boolean noBlockDeals) {
        this.noBlockDeals = noBlockDeals;
    }

    public StockPojo withNoBlockDeals(boolean noBlockDeals) {
        this.noBlockDeals = noBlockDeals;
        return this;
    }

    @JsonProperty("bulkBlockDeals")
    public List<BulkBlockDeal> getBulkBlockDeals() {
        return bulkBlockDeals;
    }

    @JsonProperty("bulkBlockDeals")
    public void setBulkBlockDeals(List<BulkBlockDeal> bulkBlockDeals) {
        this.bulkBlockDeals = bulkBlockDeals;
    }

    public StockPojo withBulkBlockDeals(List<BulkBlockDeal> bulkBlockDeals) {
        this.bulkBlockDeals = bulkBlockDeals;
        return this;
    }

    @JsonProperty("marketDeptOrderBook")
    public MarketDeptOrderBook getMarketDeptOrderBook() {
        return marketDeptOrderBook;
    }

    @JsonProperty("marketDeptOrderBook")
    public void setMarketDeptOrderBook(MarketDeptOrderBook marketDeptOrderBook) {
        this.marketDeptOrderBook = marketDeptOrderBook;
    }

    public StockPojo withMarketDeptOrderBook(MarketDeptOrderBook marketDeptOrderBook) {
        this.marketDeptOrderBook = marketDeptOrderBook;
        return this;
    }

    @JsonProperty("securityWiseDP")
    public SecurityWiseDP getSecurityWiseDP() {
        return securityWiseDP;
    }

    @JsonProperty("securityWiseDP")
    public void setSecurityWiseDP(SecurityWiseDP securityWiseDP) {
        this.securityWiseDP = securityWiseDP;
    }

    public StockPojo withSecurityWiseDP(SecurityWiseDP securityWiseDP) {
        this.securityWiseDP = securityWiseDP;
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

    public StockPojo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("noBlockDeals", noBlockDeals).append("bulkBlockDeals", bulkBlockDeals).append("marketDeptOrderBook", marketDeptOrderBook).append("securityWiseDP", securityWiseDP).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bulkBlockDeals).append(additionalProperties).append(marketDeptOrderBook).append(noBlockDeals).append(securityWiseDP).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StockPojo) == false) {
            return false;
        }
        StockPojo rhs = ((StockPojo) other);
        return new EqualsBuilder().append(bulkBlockDeals, rhs.bulkBlockDeals).append(additionalProperties, rhs.additionalProperties).append(marketDeptOrderBook, rhs.marketDeptOrderBook).append(noBlockDeals, rhs.noBlockDeals).append(securityWiseDP, rhs.securityWiseDP).isEquals();
    }

}
