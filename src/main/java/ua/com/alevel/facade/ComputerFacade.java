package ua.com.alevel.facade;

import ua.com.alevel.api.dto.request.ComputerRequest;
import ua.com.alevel.api.dto.response.ComputerResponse;
import ua.com.alevel.exception.IllegalEnteredArgument;

import java.util.List;
import java.util.Optional;

public interface ComputerFacade extends BaseFacade<ComputerRequest, ComputerResponse> {

    void create(ComputerRequest computerRequest);

    void update(ComputerRequest request, Long id) throws IllegalEnteredArgument;

    void delete(Long id) throws IllegalEnteredArgument;

    ComputerResponse getById(Long id) throws IllegalEnteredArgument;

    List<ComputerResponse> getAll();
}
