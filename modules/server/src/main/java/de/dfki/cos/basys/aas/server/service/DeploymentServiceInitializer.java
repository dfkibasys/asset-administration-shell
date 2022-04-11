package de.dfki.cos.basys.aas.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DeploymentServiceInitializer {

    @Autowired
    private DeploymentService deploymentService;

    @PostConstruct
    public void initializeDeploymentService() {
        //deploymentService.recreateDeployments();
        //deploymentService.startMonitoring();
    }

    @EventListener
    public void onApplicationEvent(AvailabilityChangeEvent<ReadinessState> event) {
        switch (event.getState()) {
            case ACCEPTING_TRAFFIC:
                deploymentService.startMonitoring();
                deploymentService.recreateDeployments();
                break;
            case REFUSING_TRAFFIC:
                // we're back
        }
    }
}
