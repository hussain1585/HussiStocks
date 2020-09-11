
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
    "securityVar",
    "indexVar",
    "varMargin",
    "extremeLossMargin",
    "adhocMargin",
    "applicableMargin"
})
public class ValueAtRisk {

    @JsonProperty("securityVar")
    private double securityVar;
    @JsonProperty("indexVar")
    private long indexVar;
    @JsonProperty("varMargin")
    private double varMargin;
    @JsonProperty("extremeLossMargin")
    private double extremeLossMargin;
    @JsonProperty("adhocMargin")
    private double adhocMargin;
    @JsonProperty("applicableMargin")
    private long applicableMargin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ValueAtRisk() {
    }

    /**
     * 
     * @param indexVar
     * @param varMargin
     * @param applicableMargin
     * @param securityVar
     * @param adhocMargin
     * @param extremeLossMargin
     */
    public ValueAtRisk(double securityVar, long indexVar, double varMargin, double extremeLossMargin, double adhocMargin, long applicableMargin) {
        super();
        this.securityVar = securityVar;
        this.indexVar = indexVar;
        this.varMargin = varMargin;
        this.extremeLossMargin = extremeLossMargin;
        this.adhocMargin = adhocMargin;
        this.applicableMargin = applicableMargin;
    }

    @JsonProperty("securityVar")
    public double getSecurityVar() {
        return securityVar;
    }

    @JsonProperty("securityVar")
    public void setSecurityVar(double securityVar) {
        this.securityVar = securityVar;
    }

    public ValueAtRisk withSecurityVar(double securityVar) {
        this.securityVar = securityVar;
        return this;
    }

    @JsonProperty("indexVar")
    public long getIndexVar() {
        return indexVar;
    }

    @JsonProperty("indexVar")
    public void setIndexVar(long indexVar) {
        this.indexVar = indexVar;
    }

    public ValueAtRisk withIndexVar(long indexVar) {
        this.indexVar = indexVar;
        return this;
    }

    @JsonProperty("varMargin")
    public double getVarMargin() {
        return varMargin;
    }

    @JsonProperty("varMargin")
    public void setVarMargin(double varMargin) {
        this.varMargin = varMargin;
    }

    public ValueAtRisk withVarMargin(double varMargin) {
        this.varMargin = varMargin;
        return this;
    }

    @JsonProperty("extremeLossMargin")
    public double getExtremeLossMargin() {
        return extremeLossMargin;
    }

    @JsonProperty("extremeLossMargin")
    public void setExtremeLossMargin(double extremeLossMargin) {
        this.extremeLossMargin = extremeLossMargin;
    }

    public ValueAtRisk withExtremeLossMargin(double extremeLossMargin) {
        this.extremeLossMargin = extremeLossMargin;
        return this;
    }

    @JsonProperty("adhocMargin")
    public double getAdhocMargin() {
        return adhocMargin;
    }

    @JsonProperty("adhocMargin")
    public void setAdhocMargin(double adhocMargin) {
        this.adhocMargin = adhocMargin;
    }

    public ValueAtRisk withAdhocMargin(double adhocMargin) {
        this.adhocMargin = adhocMargin;
        return this;
    }

    @JsonProperty("applicableMargin")
    public long getApplicableMargin() {
        return applicableMargin;
    }

    @JsonProperty("applicableMargin")
    public void setApplicableMargin(long applicableMargin) {
        this.applicableMargin = applicableMargin;
    }

    public ValueAtRisk withApplicableMargin(long applicableMargin) {
        this.applicableMargin = applicableMargin;
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

    public ValueAtRisk withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("securityVar", securityVar).append("indexVar", indexVar).append("varMargin", varMargin).append("extremeLossMargin", extremeLossMargin).append("adhocMargin", adhocMargin).append("applicableMargin", applicableMargin).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(indexVar).append(varMargin).append(applicableMargin).append(securityVar).append(adhocMargin).append(additionalProperties).append(extremeLossMargin).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValueAtRisk) == false) {
            return false;
        }
        ValueAtRisk rhs = ((ValueAtRisk) other);
        return new EqualsBuilder().append(indexVar, rhs.indexVar).append(varMargin, rhs.varMargin).append(applicableMargin, rhs.applicableMargin).append(securityVar, rhs.securityVar).append(adhocMargin, rhs.adhocMargin).append(additionalProperties, rhs.additionalProperties).append(extremeLossMargin, rhs.extremeLossMargin).isEquals();
    }

}
