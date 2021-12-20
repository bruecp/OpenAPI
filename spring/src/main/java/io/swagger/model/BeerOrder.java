package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BeerOrderLine;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BeerOrder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-23T11:39:49.576Z[GMT]")


public class BeerOrder   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("customerId")
  private UUID customerId = null;

  @JsonProperty("customerRef")
  private String customerRef = null;

  @JsonProperty("beerOrderLines")
  @Valid
  private List<BeerOrderLine> beerOrderLines = null;

  @JsonProperty("orderStatusCallbackUrl")
  private String orderStatusCallbackUrl = null;

  public BeerOrder id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "")
  
    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public BeerOrder customerId(UUID customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public UUID getCustomerId() {
    return customerId;
  }

  public void setCustomerId(UUID customerId) {
    this.customerId = customerId;
  }

  public BeerOrder customerRef(String customerRef) {
    this.customerRef = customerRef;
    return this;
  }

  /**
   * Get customerRef
   * @return customerRef
   **/
  @Schema(description = "")
  
    public String getCustomerRef() {
    return customerRef;
  }

  public void setCustomerRef(String customerRef) {
    this.customerRef = customerRef;
  }

  public BeerOrder beerOrderLines(List<BeerOrderLine> beerOrderLines) {
    this.beerOrderLines = beerOrderLines;
    return this;
  }

  public BeerOrder addBeerOrderLinesItem(BeerOrderLine beerOrderLinesItem) {
    if (this.beerOrderLines == null) {
      this.beerOrderLines = new ArrayList<BeerOrderLine>();
    }
    this.beerOrderLines.add(beerOrderLinesItem);
    return this;
  }

  /**
   * Get beerOrderLines
   * @return beerOrderLines
   **/
  @Schema(description = "")
      @Valid
    public List<BeerOrderLine> getBeerOrderLines() {
    return beerOrderLines;
  }

  public void setBeerOrderLines(List<BeerOrderLine> beerOrderLines) {
    this.beerOrderLines = beerOrderLines;
  }

  public BeerOrder orderStatusCallbackUrl(String orderStatusCallbackUrl) {
    this.orderStatusCallbackUrl = orderStatusCallbackUrl;
    return this;
  }

  /**
   * Get orderStatusCallbackUrl
   * @return orderStatusCallbackUrl
   **/
  @Schema(description = "")
  
    public String getOrderStatusCallbackUrl() {
    return orderStatusCallbackUrl;
  }

  public void setOrderStatusCallbackUrl(String orderStatusCallbackUrl) {
    this.orderStatusCallbackUrl = orderStatusCallbackUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeerOrder beerOrder = (BeerOrder) o;
    return Objects.equals(this.id, beerOrder.id) &&
        Objects.equals(this.customerId, beerOrder.customerId) &&
        Objects.equals(this.customerRef, beerOrder.customerRef) &&
        Objects.equals(this.beerOrderLines, beerOrder.beerOrderLines) &&
        Objects.equals(this.orderStatusCallbackUrl, beerOrder.orderStatusCallbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, customerRef, beerOrderLines, orderStatusCallbackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeerOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    beerOrderLines: ").append(toIndentedString(beerOrderLines)).append("\n");
    sb.append("    orderStatusCallbackUrl: ").append(toIndentedString(orderStatusCallbackUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
