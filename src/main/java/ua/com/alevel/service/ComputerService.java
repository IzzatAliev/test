package ua.com.alevel.service;

import ua.com.alevel.entity.Computer;

import java.util.List;
import java.util.Optional;

public interface ComputerService extends BaseService<Computer>{

    void create(Computer computer);
    void update(Computer computer);
    void delete(Long id);
    Optional<Computer> getById(Long id);
    List<Computer> getAll();
}
