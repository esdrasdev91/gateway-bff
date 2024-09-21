package service;

import client.ProposalRestClient;
import dto.ProposalDetailsDTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class ProposalServiceImpl implements ProposalService{

    @Inject
    @RestClient
    ProposalRestClient proposalRestClient;

    @Override
    public ProposalDetailsDTO getProposalDetailsById(long proposalId) {
        return proposalRestClient.getProposalDetailsByID(proposalId);
    }

    @Override
    public Response createProposal(ProposalDetailsDTO proposalDetailsDTO) {
        return proposalRestClient.createProposal(proposalDetailsDTO);
    }

    @Override
    public Response updateProposal(ProposalDetailsDTO proposalDetailsDTO) {
        return proposalRestClient.updateProposal(proposalDetailsDTO);
    }

    @Override
    public Response removeProposal(long proposalId) {
        return proposalRestClient.deleteProposal(proposalId);
    }
}
