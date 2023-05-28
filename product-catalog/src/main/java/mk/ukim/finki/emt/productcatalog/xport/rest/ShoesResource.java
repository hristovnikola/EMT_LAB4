package mk.ukim.finki.emt.productcatalog.xport.rest;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.productcatalog.domain.models.Shoes;
import mk.ukim.finki.emt.productcatalog.services.ShoesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ShoesResource
{

    private final ShoesService shoesService;

    @GetMapping
    public List<Shoes> getAll() {
        return shoesService.getAll();
    }

}
