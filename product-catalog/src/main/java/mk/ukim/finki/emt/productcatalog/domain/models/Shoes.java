package mk.ukim.finki.emt.productcatalog.domain.models;


import mk.ukim.finki.emt.productcatalog.domain.valueobjects.Quantity;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

import javax.persistence.*;

@Entity
@Table(name="shoes")
public class Shoes extends AbstractEntity<ShoesId> {
    private String shoesName;
    private int sales;
    @Enumerated(EnumType.STRING)
    private Manufacturer manufacturer;
    @Enumerated(EnumType.STRING)
    private Category category;
    @AttributeOverrides({
            @AttributeOverride(name="amount", column = @Column(name = "price_amount")),
            @AttributeOverride(name="currency", column = @Column(name = "price_currency"))
    })
    private Money price;

    private Shoes(){
        super(ShoesId.randomId(ShoesId.class));
    }
    public static Shoes build(String shoesName, Money price, int sales ,Manufacturer manufacturer, Category category){
        Shoes p = new Shoes();
        p.price = price;
        p.shoesName = shoesName;
        p.sales = sales;
        p.manufacturer = manufacturer;
        p.category = category;
        return p;
    }
    public void addSales(int qty){
        this.sales = this.sales - qty;
    }
    public void removeSales(int qty){
        this.sales -= qty;
    }
}
