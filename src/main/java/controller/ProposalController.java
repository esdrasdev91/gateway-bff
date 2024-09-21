package controller;

import dto.ProposalDetailsDTO;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import service.ProposalService;

@ApplicationScoped
@Path("/api/trade")
public class ProposalController {

    @Inject
    ProposalService proposalService;

    @GET
    @Path("/{id}")
    @RolesAllowed({"user", "manager"})
    public Response getProposalDetailsById(@PathParam("id") long id) {
        try {
            return Response.ok(proposalService.getProposalDetailsById(id),
            MediaType.APPLICATION_JSON).build();
        } catch (ServerErrorException errorException) {
            return Response.serverError().entity(errorException.getMessage()).build();
        }
    }

    @POST
    @RolesAllowed({"proposal-customer"})
    public Response createNewProposal(ProposalDetailsDTO proposalDetailsDTO) {
        int proposalRequestStatus = proposalService.createProposal(proposalDetailsDTO).getStatus();
        if (proposalRequestStatus > 199 || proposalRequestStatus < 205) {
            return Response.serverError().entity(proposalDetailsDTO).build();
        } else {
            return Response.status(proposalRequestStatus).build();
        }
    }

    @DELETE
    @Path("/remove/{id}")
    @RolesAllowed("manager")
    public Response removeProposal(@PathParam("id") long id) {
        int proposalRequestStatus = proposalService.removeProposal(id).getStatus();
        if (proposalRequestStatus > 199 || proposalRequestStatus < 205) {
            return Response.ok().build();
        } else {
            return Response.status(proposalRequestStatus).build();
        }
    }

}
