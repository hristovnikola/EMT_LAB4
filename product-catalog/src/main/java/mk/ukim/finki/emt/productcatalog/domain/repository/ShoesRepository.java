package mk.ukim.finki.emt.productcatalog.domain.repository;

import mk.ukim.finki.emt.productcatalog.domain.models.Shoes;
import mk.ukim.finki.emt.productcatalog.domain.models.ShoesId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoesRepository extends JpaRepository<Shoes, ShoesId> {
}
