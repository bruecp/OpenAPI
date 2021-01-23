package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BeerOrderLine
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-23T11:39:49.576Z[GMT]")


public class BeerOrderLine   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("beerId")
  private UUID beerId = null;

  @JsonProperty("upc")
  private String upc = null;

  @JsonProperty("orderQuantity")
  private Integer orderQuantity = null;

  @JsonProperty("quantityAllocated")
  private Integer quantityAllocated = null;

  public BeerOrderLine id(UUID id) {
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

  public BeerOrderLine beerId(UUID beerId) {
    this.beerId = beerId;
    return this;
  }

  /**
   * Get beerId
   * @return beerId
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "")
  
    @Valid
    public UUID getBeerId() {
    return beerId;
  }

  public void setBeerId(UUID beerId) {
    this.beerId = beerId;
  }

  public BeerOrderLine upc(String upc) {
    this.upc = upc;
    return this;
  }

  /**
   * Get upc
   * @return upc
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getUpc() {
    return upc;
  }

  public void setUpc(String upc) {
    this.upc = upc;
  }

  public BeerOrderLine orderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
    return this;
  }

  /**
   * Get orderQuantity
   * minimum: 1
   * maximum: 999
   * @return orderQuantity
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Min(1) @Max(999)   public Integer getOrderQuantity() {
    return orderQuantity;
  }

  public void setOrderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
  }

  public BeerOrderLine quantityAllocated(Integer quantityAllocated) {
    this.quantityAllocated = quantityAllocated;
    return this;
  }

  /**
   * Get quantityAllocated
   * @return quantityAllocated
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "")
  
    public Integer getQuantityAllocated() {
    return quantityAllocated;
  }

  public void setQuantityAllocated(Integer quantityAllocated) {
    this.quantityAllocated = quantityAllocated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeerOrderLine beerOrderLine = (BeerOrderLine) o;
    return Objects.equals(this.id, beerOrderLine.id) &&
        Objects.equals(this.beerId, beerOrderLine.beerId) &&
        Objects.equals(this.upc, beerOrderLine.upc) &&
        Objects.equals(this.orderQuantity, beerOrderLine.orderQuantity) &&
        Objects.equals(this.quantityAllocated, beerOrderLine.quantityAllocated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beerId, upc, orderQuantity, quantityAllocated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeerOrderLine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beerId: ").append(toIndentedString(beerId)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    orderQuantity: ").append(toIndentedString(orderQuantity)).append("\n");
    sb.append("    quantityAllocated: ").append(toIndentedString(quantityAllocated)).append("\n");
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
