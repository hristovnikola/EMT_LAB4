package mk.ukim.finki.emt.productcatalog.domain.models;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;
import org.springframework.lang.NonNull;

public class ShoesId extends DomainObjectId {

    private ShoesId() {
        super(ShoesId.randomId(ShoesId.class).getId());
    }

    public ShoesId(@NonNull String uuid) {
        super(uuid);
    }

    public static ShoesId of(String uuid) {
        ShoesId p = new ShoesId(uuid);
        return p;
    }

}
