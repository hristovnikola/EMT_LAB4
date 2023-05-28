package mk.ukim.finki.emt.productcatalog.domain.models;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;
import org.springframework.lang.NonNull;


public class ManufacturerId extends DomainObjectId {
    private ManufacturerId() {
        super(ManufacturerId.randomId(ManufacturerId.class).getId());
    }

    public ManufacturerId(@NonNull String uuid) {
        super(uuid);
    }

    public static ManufacturerId of(String uuid) {
        ManufacturerId p = new ManufacturerId(uuid);
        return p;
    }

}
