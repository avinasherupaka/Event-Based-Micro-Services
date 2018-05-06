package io.example;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The repository for managing {@link User} data.
 *
 * @author Avinash Erupaka
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
