
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
    "quantityTraded",
    "deliveryQuantity",
    "deliveryToTradedQuantity",
    "seriesRemarks",
    "secWiseDelPosDate"
})
public class SecurityWiseDP {

    @JsonProperty("quantityTraded")
    private long quantityTraded;
    @JsonProperty("deliveryQuantity")
    private long deliveryQuantity;
    @JsonProperty("deliveryToTradedQuantity")
    private double deliveryToTradedQuantity;
    @JsonProperty("seriesRemarks")
    private Object seriesRemarks;
    @JsonProperty("secWiseDelPosDate")
    private String secWiseDelPosDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SecurityWiseDP() {
    }

    /**
     * 
     * @param secWiseDelPosDate
     * @param quantityTraded
     * @param deliveryToTradedQuantity
     * @param deliveryQuantity
     * @param seriesRemarks
     */
    public SecurityWiseDP(long quantityTraded, long deliveryQuantity, double deliveryToTradedQuantity, Object seriesRemarks, String secWiseDelPosDate) {
        super();
        this.quantityTraded = quantityTraded;
        this.deliveryQuantity = deliveryQuantity;
        this.deliveryToTradedQuantity = deliveryToTradedQuantity;
        this.seriesRemarks = seriesRemarks;
        this.secWiseDelPosDate = secWiseDelPosDate;
    }

    @JsonProperty("quantityTraded")
    public long getQuantityTraded() {
        return quantityTraded;
    }

    @JsonProperty("quantityTraded")
    public void setQuantityTraded(long quantityTraded) {
        this.quantityTraded = quantityTraded;
    }

    public SecurityWiseDP withQuantityTraded(long quantityTraded) {
        this.quantityTraded = quantityTraded;
        return this;
    }

    @JsonProperty("deliveryQuantity")
    public long getDeliveryQuantity() {
        return deliveryQuantity;
    }

    @JsonProperty("deliveryQuantity")
    public void setDeliveryQuantity(long deliveryQuantity) {
        this.deliveryQuantity = deliveryQuantity;
    }

    public SecurityWiseDP withDeliveryQuantity(long deliveryQuantity) {
        this.deliveryQuantity = deliveryQuantity;
        return this;
    }

    @JsonProperty("deliveryToTradedQuantity")
    public double getDeliveryToTradedQuantity() {
        return deliveryToTradedQuantity;
    }

    @JsonProperty("deliveryToTradedQuantity")
    public void setDeliveryToTradedQuantity(double deliveryToTradedQuantity) {
        this.deliveryToTradedQuantity = deliveryToTradedQuantity;
    }

    public SecurityWiseDP withDeliveryToTradedQuantity(double deliveryToTradedQuantity) {
        this.deliveryToTradedQuantity = deliveryToTradedQuantity;
        return this;
    }

    @JsonProperty("seriesRemarks")
    public Object getSeriesRemarks() {
        return seriesRemarks;
    }

    @JsonProperty("seriesRemarks")
    public void setSeriesRemarks(Object seriesRemarks) {
        this.seriesRemarks = seriesRemarks;
    }

    public SecurityWiseDP withSeriesRemarks(Object seriesRemarks) {
        this.seriesRemarks = seriesRemarks;
        return this;
    }

    @JsonProperty("secWiseDelPosDate")
    public String getSecWiseDelPosDate() {
        return secWiseDelPosDate;
    }

    @JsonProperty("secWiseDelPosDate")
    public void setSecWiseDelPosDate(String secWiseDelPosDate) {
        this.secWiseDelPosDate = secWiseDelPosDate;
    }

    public SecurityWiseDP withSecWiseDelPosDate(String secWiseDelPosDate) {
        this.secWiseDelPosDate = secWiseDelPosDate;
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

    public SecurityWiseDP withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("quantityTraded", quantityTraded).append("deliveryQuantity", deliveryQuantity).append("deliveryToTradedQuantity", deliveryToTradedQuantity).append("seriesRemarks", seriesRemarks).append("secWiseDelPosDate", secWiseDelPosDate).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(secWiseDelPosDate).append(quantityTraded).append(deliveryToTradedQuantity).append(deliveryQuantity).append(seriesRemarks).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityWiseDP) == false) {
            return false;
        }
        SecurityWiseDP rhs = ((SecurityWiseDP) other);
        return new EqualsBuilder().append(secWiseDelPosDate, rhs.secWiseDelPosDate).append(quantityTraded, rhs.quantityTraded).append(deliveryToTradedQuantity, rhs.deliveryToTradedQuantity).append(deliveryQuantity, rhs.deliveryQuantity).append(seriesRemarks, rhs.seriesRemarks).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
