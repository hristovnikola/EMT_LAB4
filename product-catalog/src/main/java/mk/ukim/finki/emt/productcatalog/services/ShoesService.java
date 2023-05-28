package mk.ukim.finki.emt.productcatalog.services;

import mk.ukim.finki.emt.productcatalog.domain.models.Shoes;
import mk.ukim.finki.emt.productcatalog.domain.models.ShoesId;
import mk.ukim.finki.emt.productcatalog.services.form.ShoesForm;

import java.util.List;

public interface ShoesService {

    Shoes findById(ShoesId id);
    Shoes createShoes(ShoesForm form);
    Shoes orderItemCreated(ShoesId productId, int quantity);
    Shoes orderItemRemoved(ShoesId productId, int quantity);
    List<Shoes> getAll();

}
