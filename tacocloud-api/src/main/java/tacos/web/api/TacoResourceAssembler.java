package tacos.web.api;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import tacos.Taco;

public class TacoResourceAssembler extends ResourceAssemblerSupport<Taco, TacoResource> {

	public TacoResourceAssembler() {
		super(DesignTacoController.class, TacoResource.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TacoResource toResource(Taco entity) {
		return createResourceWithId(entity.getId(), entity);
	}

	@Override
	protected TacoResource instantiateResource(Taco entity) {
		return new TacoResource(entity);
	}
}
