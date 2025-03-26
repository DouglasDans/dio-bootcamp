package dev.dans.barbearia.model.repository;

import dev.dans.barbearia.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(final String email);
    boolean existsByPhone(final String phone);

    Optional<User> findByEmail(final String email);
    Optional<User> findByPhone(final String phone);
}
