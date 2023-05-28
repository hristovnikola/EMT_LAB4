package mk.ukim.finki.emt.ordermanagement.domain.valueobjects;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Currency;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

@Getter
public class Shoes implements ValueObject {
    private final ShoesId id;
    private final String name;
    private final Money price;
    private final int sales;
    private final Manufacturer manufacturer;
    private final Category category;

    private Shoes() {
        this.id = ShoesId.randomId(ShoesId.class);
        this.name = "";
        this.price = Money.valueOf(Currency.MKD, 0);
        this.sales = 0;
        this.manufacturer = Manufacturer.Puma;
        this.category = Category.RUNNING;
    }

    @JsonCreator
    public Shoes(@JsonProperty("id") ShoesId id,
                 @JsonProperty("productName") String name,
                 @JsonProperty("price") Money price,
                 @JsonProperty("sales") int sales,
                 @JsonProperty("manufacturer") Manufacturer manufacturer,
                 @JsonProperty("category") Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sales = sales;
        this.manufacturer = manufacturer;
        this.category = category;
    }
}
