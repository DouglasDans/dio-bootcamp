package dev.dans.barbearia.service.impl;

import dev.dans.barbearia.exception.ResourceAlreadyExistsException;
import dev.dans.barbearia.exception.ResourceNotFoundException;
import dev.dans.barbearia.model.entity.User;
import dev.dans.barbearia.model.repository.IUserRepository;
import dev.dans.barbearia.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    private final IUserRepository userRepository;

    public UserService(IUserRepository IUserRepository) {
        this.userRepository = IUserRepository;
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("user id", id)
        );
    }

    @Override
    public User save(User entity) {
        verifyIfInUseEmail(entity.getEmail());
        verifyIfInUsePhone(entity.getPhone());

        return userRepository.save(entity);
    }

    @Override
    public User update(User entity) {
        verifyIfInUseEmail(entity.getEmail());
        verifyIfInUsePhone(entity.getPhone());

        return userRepository.save(entity);
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }

    private void verifyIfInUseEmail(String email) {
       if (userRepository.existsByEmail(email)) throw new ResourceAlreadyExistsException("email", email);
    }

    private void verifyIfInUsePhone(String email) {
       if (userRepository.existsByPhone(email)) throw new ResourceAlreadyExistsException("phone", email);
    }
}
