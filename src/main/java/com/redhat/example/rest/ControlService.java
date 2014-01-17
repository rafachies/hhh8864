package com.redhat.example.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/control")
@RequestScoped
public class ControlService {
	
	@Inject private EntityManager em;

	@GET
	public String ok() {
		Query query = em.createQuery("select count(distinct obj) from ControlVO obj)");
		return query.getResultList().toString();
	}

}
