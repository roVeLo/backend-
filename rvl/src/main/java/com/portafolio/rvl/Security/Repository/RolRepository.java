
package com.portafolio.rvl.Security.Repository;

import com.portafolio.rvl.Security.Entity.Rol;
import com.portafolio.rvl.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
