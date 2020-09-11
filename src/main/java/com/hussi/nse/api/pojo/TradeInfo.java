
package com.hussi.nse.api.pojo;

import java.util.HashMap;
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
    "totalTradedVolume",
    "totalTradedValue",
    "totalMarketCap",
    "ffmc",
    "impactCost"
})
public class TradeInfo {

    @JsonProperty("totalTradedVolume")
    private long totalTradedVolume;
    @JsonProperty("totalTradedValue")
    private double totalTradedValue;
    @JsonProperty("totalMarketCap")
    private double totalMarketCap;
    @JsonProperty("ffmc")
    private double ffmc;
    @JsonProperty("impactCost")
    private double impactCost;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TradeInfo() {
    }

    /**
     * 
     * @param totalTradedVolume
     * @param totalTradedValue
     * @param impactCost
     * @param totalMarketCap
     * @param ffmc
     */
    public TradeInfo(long totalTradedVolume, double totalTradedValue, double totalMarketCap, double ffmc, double impactCost) {
        super();
        this.totalTradedVolume = totalTradedVolume;
        this.totalTradedValue = totalTradedValue;
        this.totalMarketCap = totalMarketCap;
        this.ffmc = ffmc;
        this.impactCost = impactCost;
    }

    @JsonProperty("totalTradedVolume")
    public long getTotalTradedVolume() {
        return totalTradedVolume;
    }

    @JsonProperty("totalTradedVolume")
    public void setTotalTradedVolume(long totalTradedVolume) {
        this.totalTradedVolume = totalTradedVolume;
    }

    public TradeInfo withTotalTradedVolume(long totalTradedVolume) {
        this.totalTradedVolume = totalTradedVolume;
        return this;
    }

    @JsonProperty("totalTradedValue")
    public double getTotalTradedValue() {
        return totalTradedValue;
    }

    @JsonProperty("totalTradedValue")
    public void setTotalTradedValue(double totalTradedValue) {
        this.totalTradedValue = totalTradedValue;
    }

    public TradeInfo withTotalTradedValue(double totalTradedValue) {
        this.totalTradedValue = totalTradedValue;
        return this;
    }

    @JsonProperty("totalMarketCap")
    public double getTotalMarketCap() {
        return totalMarketCap;
    }

    @JsonProperty("totalMarketCap")
    public void setTotalMarketCap(double totalMarketCap) {
        this.totalMarketCap = totalMarketCap;
    }

    public TradeInfo withTotalMarketCap(double totalMarketCap) {
        this.totalMarketCap = totalMarketCap;
        return this;
    }

    @JsonProperty("ffmc")
    public double getFfmc() {
        return ffmc;
    }

    @JsonProperty("ffmc")
    public void setFfmc(double ffmc) {
        this.ffmc = ffmc;
    }

    public TradeInfo withFfmc(double ffmc) {
        this.ffmc = ffmc;
        return this;
    }

    @JsonProperty("impactCost")
    public double getImpactCost() {
        return impactCost;
    }

    @JsonProperty("impactCost")
    public void setImpactCost(double impactCost) {
        this.impactCost = impactCost;
    }

    public TradeInfo withImpactCost(double impactCost) {
        this.impactCost = impactCost;
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

    public TradeInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalTradedVolume", totalTradedVolume).append("totalTradedValue", totalTradedValue).append("totalMarketCap", totalMarketCap).append("ffmc", ffmc).append("impactCost", impactCost).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalTradedVolume).append(totalTradedValue).append(impactCost).append(totalMarketCap).append(ffmc).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradeInfo) == false) {
            return false;
        }
        TradeInfo rhs = ((TradeInfo) other);
        return new EqualsBuilder().append(totalTradedVolume, rhs.totalTradedVolume).append(totalTradedValue, rhs.totalTradedValue).append(impactCost, rhs.impactCost).append(totalMarketCap, rhs.totalMarketCap).append(ffmc, rhs.ffmc).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
