package ua.com.alevel.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import ua.com.alevel.api.dto.request.ComputerRequest;
import ua.com.alevel.api.dto.response.ComputerResponse;
import ua.com.alevel.entity.Computer;
import ua.com.alevel.exception.IllegalEnteredArgument;
import ua.com.alevel.facade.ComputerFacade;
import ua.com.alevel.service.ComputerService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ComputerFacadeImpl implements ComputerFacade {

    private final ComputerService computerService;

    @Autowired
    public ComputerFacadeImpl(ComputerService computerService) {
        this.computerService = computerService;
    }

    @Override
    public void create(ComputerRequest computerRequest) {
        Computer computer = new Computer();
        computer.setName(computerRequest.getName());
        computer.setModel(computerRequest.getModel());
        computer.setQuantity(computerRequest.getQuantity());
        computer.setPrice(computerRequest.getPrice());
        computer.setCorporation(computerRequest.getCorporation());
        computerService.create(computer);
    }

    @Override
    public void update(ComputerRequest computerRequest, Long id) {
        Optional<Computer> computer = computerService.getById(id);
        if (computer.isPresent()) {
            computer.get().setName(computerRequest.getName());
            computer.get().setModel(computerRequest.getModel());
            computer.get().setQuantity(computerRequest.getQuantity());
            computer.get().setPrice(computerRequest.getPrice());
            computer.get().setCorporation(computerRequest.getCorporation());
            computerService.update(computer.get());
        } else {
            throw new IllegalEnteredArgument("doesn't find id = " + id, HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public void delete(Long id) throws IllegalEnteredArgument {
        if (id != null)
            computerService.delete(id);
        else
            throw new IllegalEnteredArgument("doesn't find id = " + id, HttpStatus.NOT_FOUND);
    }

    @Override
    public ComputerResponse getById(Long id) {
       return new ComputerResponse(Optional.of(computerService.getById(id)).get().get());
    }

    @Override
    public List<ComputerResponse> getAll() {
        return generatorList(computerService.getAll());
    }

    public List<ComputerResponse> generatorList(List<Computer> computers) {
        return computers.stream().map(ComputerResponse::new).collect(Collectors.toList());
    }
}
