package concerttours.facades.impl;

import concerttours.data.ProducerData;
import concerttours.facades.ProducerFacade;
import concerttours.service.ProducerService;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;
import java.util.stream.Collectors;

public class DefaultProducerFacade implements ProducerFacade {
    private ProducerService producerService;

    @Override
    public List<ProducerData> getProducers() {
        return producerService.getProducers().stream()
                .map(producerModel -> {
                    ProducerData producerData = new ProducerData();
                    producerData.setName(producerModel.getName());
                    producerData.setSurname(producerModel.getSurname());
                    return producerData;
                }).collect(Collectors.toList());
    }

    @Required
    public void setProducerService(ProducerService producerService) {
        this.producerService = producerService;
    }
}
