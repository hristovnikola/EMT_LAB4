package mk.ukim.finki.emt.productcatalog.services.impl;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.productcatalog.domain.exceptions.ShoesNotFoundException;
import mk.ukim.finki.emt.productcatalog.domain.models.Shoes;
import mk.ukim.finki.emt.productcatalog.domain.models.ShoesId;
import mk.ukim.finki.emt.productcatalog.domain.repository.ShoesRepository;
import mk.ukim.finki.emt.productcatalog.services.ShoesService;
import mk.ukim.finki.emt.productcatalog.services.form.ShoesForm;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ShoesServiceImpl implements ShoesService {

    private final ShoesRepository productRepository;

    @Override
    public Shoes findById(ShoesId id) {
        return productRepository.findById(id).orElseThrow(ShoesNotFoundException::new);
    }

    @Override
    public Shoes createShoes(ShoesForm form) {
        Shoes p = Shoes.build(form.getShoesName(),form.getPrice(),form.getSales(), form.getManufacturer(), form.getCategory());
        productRepository.save(p);
        return p;
    }

    @Override
    public Shoes orderItemCreated(ShoesId productId, int quantity) {
        Shoes p = productRepository.findById(productId).orElseThrow(ShoesNotFoundException::new);
        p.addSales(quantity);
        productRepository.saveAndFlush(p);
        return p;
    }

    @Override
    public Shoes orderItemRemoved(ShoesId productId, int quantity) {
        Shoes p = productRepository.findById(productId).orElseThrow(ShoesNotFoundException::new);
        p.removeSales(quantity);
        productRepository.saveAndFlush(p);
        return p;
    }

    @Override
    public List<Shoes> getAll() {
        return productRepository.findAll();
    }
}
