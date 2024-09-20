package service;

import dto.ProposalDetailsDTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class ProposalServiceImpl implements ProposalService{
    @Override
    public ProposalDetailsDTO getProposalDetailsById(long proposalId) {
        return null;
    }

    @Override
    public Response createProposal(ProposalDetailsDTO proposalDetailsDTO) {
        return null;
    }

    @Override
    public Response updateProposal(ProposalDetailsDTO proposalDetailsDTO) {
        return null;
    }

    @Override
    public Response removeProposal(long proposalId) {
        return null;
    }
}
