package mk.ukim.finki.emt.productcatalog.config;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.productcatalog.domain.models.Category;
import mk.ukim.finki.emt.productcatalog.domain.models.Manufacturer;
import mk.ukim.finki.emt.productcatalog.domain.models.Shoes;
import mk.ukim.finki.emt.productcatalog.domain.repository.ShoesRepository;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Currency;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@AllArgsConstructor
public class DataInitializer {

    private final ShoesRepository productRepository;

    @PostConstruct
    public void initData() {
        Shoes p1 = Shoes.build("Adidas", Money.valueOf(Currency.MKD, 50), 5, Manufacturer.Adidas, Category.BASKETBALL);
        Shoes p2 = Shoes.build("Nike", Money.valueOf(Currency.USD, 70), 5, Manufacturer.Nike, Category.SOCCER);
        if (productRepository.findAll().isEmpty()) {
            productRepository.saveAll(Arrays.asList(p1,p2));
        }
    }
}
