package mk.ukim.finki.emt.ordermanagement.domain.valueobjects;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Embeddable;

@Embeddable
public class ShoesId extends DomainObjectId {

    private ShoesId() {
        super(ShoesId.randomId(ShoesId.class).getId());
    }

    public ShoesId(String uuid) {
        super(uuid);
    }
}
