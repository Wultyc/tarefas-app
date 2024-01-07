package eu.jgabriel.tarefasapp.roles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository  extends JpaRepository<Role, Integer> {
}
