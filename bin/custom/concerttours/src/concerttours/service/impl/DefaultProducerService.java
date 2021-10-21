package concerttours.service.impl;

import concerttours.daos.ProducerDAO;
import concerttours.model.ProducerModel;
import concerttours.service.ProducerService;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class DefaultProducerService implements ProducerService {
    private ProducerDAO producerDAO;

    public List<ProducerModel> getProducers() {
        return producerDAO.findProducers();
    }

    @Required
    public void setProducerDAO(ProducerDAO producerDAO) {
        this.producerDAO = producerDAO;
    }
}
