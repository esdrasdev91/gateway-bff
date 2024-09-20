package service;

import dto.ProposalDetailsDTO;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

public interface ProposalService {

    ProposalDetailsDTO getProposalDetailsById(@PathParam("id") long proposalId);

    Response createProposal(ProposalDetailsDTO proposalDetailsDTO);

    Response updateProposal(ProposalDetailsDTO proposalDetailsDTO);

    Response removeProposal(@PathParam("id") long proposalId);

}
