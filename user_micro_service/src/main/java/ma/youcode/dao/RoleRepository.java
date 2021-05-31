package ma.youcode.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.youcode.models.EnumRoles;
import ma.youcode.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(EnumRoles name);

}
