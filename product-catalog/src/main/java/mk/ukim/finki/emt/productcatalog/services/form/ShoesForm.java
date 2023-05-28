package mk.ukim.finki.emt.productcatalog.services.form;

import lombok.Data;
import mk.ukim.finki.emt.productcatalog.domain.models.Category;
import mk.ukim.finki.emt.productcatalog.domain.models.Manufacturer;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

@Data
public class ShoesForm {
    private String shoesName;
    private Manufacturer manufacturer;
    private Category category;
    private Money price;
    private int sales;
}
