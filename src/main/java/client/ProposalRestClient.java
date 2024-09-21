package client;

import dto.ProposalDetailsDTO;
import io.quarkus.oidc.token.propagation.reactive.AccessTokenRequestReactiveFilter;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/proposal")
@RegisterRestClient
@RegisterProvider(AccessTokenRequestReactiveFilter.class)
@RegisterClientHeaders
@ApplicationScoped
public interface ProposalRestClient {

    @GET
    @Path("/{id}")
    ProposalDetailsDTO getProposalDetailsByID(@PathParam("id") long id);

    @POST
    Response createProposal(ProposalDetailsDTO proposalDetails);

    @POST
    Response updateProposal(ProposalDetailsDTO proposalDetails);

    @DELETE
    @Path("/{id}")
    Response deleteProposal(@PathParam("id") long id);
}
