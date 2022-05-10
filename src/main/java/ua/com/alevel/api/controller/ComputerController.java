package ua.com.alevel.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ua.com.alevel.api.dto.request.ComputerRequest;
import ua.com.alevel.api.dto.response.ComputerResponse;
import ua.com.alevel.facade.ComputerFacade;

import java.util.List;

@RestController
@RequestMapping("/api/computers")
public class ComputerController {

    private final ComputerFacade computerFacade;

    @Autowired
    public ComputerController(ComputerFacade computerFacade) {
        this.computerFacade = computerFacade;
    }

    @PostMapping("")
    @PreAuthorize("hasAuthority('write')")
    public ResponseEntity<Boolean> create(@RequestBody ComputerRequest request) {
        computerFacade.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(true);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('write')")
    public ResponseEntity<Boolean> update(@RequestBody ComputerRequest computerRequest,
                                          @PathVariable Long id){
            computerFacade.update(computerRequest, id);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('write')")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
            computerFacade.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('read')")
    public ResponseEntity<ComputerResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok().body(computerFacade.getById(id));
    }

    @GetMapping("")
    @PreAuthorize("hasAuthority('read')")
    public ResponseEntity<List<ComputerResponse>> getAll(){
        return ResponseEntity.ok().body(computerFacade.getAll());
    }
}
