package service;

import dto.OpportunityDTO;
import jakarta.enterprise.context.ApplicationScoped;

import java.io.ByteArrayInputStream;
import java.util.List;

@ApplicationScoped
public class ReportServiceImpl implements ReportService {

    @Override
    public ByteArrayInputStream generateCSVOpportunityReport() {
        return null;
    }

    @Override
    public List<OpportunityDTO> getOpportunitiesData() {
        return List.of();
    }
}
