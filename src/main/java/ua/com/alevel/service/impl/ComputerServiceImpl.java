package ua.com.alevel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.alevel.entity.Computer;
import ua.com.alevel.repository.ComputerRepository;
import ua.com.alevel.service.ComputerService;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerServiceImpl implements ComputerService {

    private final ComputerRepository repository;

    @Autowired
    public ComputerServiceImpl(ComputerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(Computer computer) {
        repository.save(computer);
    }

    @Override
    public void update(Computer computer) {
        repository.save(computer);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Computer> getById(Long id) {
        return Optional.of(repository.getById(id));
    }

    @Override
    public List<Computer> getAll() {
        return repository.findAll();
    }
}
