package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Brewery;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Beer Object
 */
@Schema(description = "Beer Object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-10T11:06:18.163Z[GMT]")


public class Beer   {
  @JsonProperty("beerName")
  private String beerName = null;

  /**
   * Gets or Sets style
   */
  public enum StyleEnum {
    ALE("ALE"),
    
    PALE_ALE("PALE_ALE"),
    
    IPA("IPA"),
    
    WHEAT("WHEAT"),
    
    LAGER("LAGER");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StyleEnum fromValue(String text) {
      for (StyleEnum b : StyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("style")
  private StyleEnum style = null;

  @JsonProperty("price")
  private Float price = null;

  @JsonProperty("quantityOnHand")
  private Integer quantityOnHand = null;

  @JsonProperty("brewery")
  private Brewery brewery = null;

  public Beer beerName(String beerName) {
    this.beerName = beerName;
    return this;
  }

  /**
   * Get beerName
   * @return beerName
   **/
  @Schema(description = "")
  
    public String getBeerName() {
    return beerName;
  }

  public void setBeerName(String beerName) {
    this.beerName = beerName;
  }

  public Beer style(StyleEnum style) {
    this.style = style;
    return this;
  }

  /**
   * Get style
   * @return style
   **/
  @Schema(description = "")
  
    public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  public Beer price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @Schema(description = "")
  
    public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public Beer quantityOnHand(Integer quantityOnHand) {
    this.quantityOnHand = quantityOnHand;
    return this;
  }

  /**
   * Get quantityOnHand
   * @return quantityOnHand
   **/
  @Schema(description = "")
  
    public Integer getQuantityOnHand() {
    return quantityOnHand;
  }

  public void setQuantityOnHand(Integer quantityOnHand) {
    this.quantityOnHand = quantityOnHand;
  }

  public Beer brewery(Brewery brewery) {
    this.brewery = brewery;
    return this;
  }

  /**
   * Get brewery
   * @return brewery
   **/
  @Schema(description = "")
  
    @Valid
    public Brewery getBrewery() {
    return brewery;
  }

  public void setBrewery(Brewery brewery) {
    this.brewery = brewery;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Beer beer = (Beer) o;
    return Objects.equals(this.beerName, beer.beerName) &&
        Objects.equals(this.style, beer.style) &&
        Objects.equals(this.price, beer.price) &&
        Objects.equals(this.quantityOnHand, beer.quantityOnHand) &&
        Objects.equals(this.brewery, beer.brewery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beerName, style, price, quantityOnHand, brewery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beer {\n");
    
    sb.append("    beerName: ").append(toIndentedString(beerName)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantityOnHand: ").append(toIndentedString(quantityOnHand)).append("\n");
    sb.append("    brewery: ").append(toIndentedString(brewery)).append("\n");
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
