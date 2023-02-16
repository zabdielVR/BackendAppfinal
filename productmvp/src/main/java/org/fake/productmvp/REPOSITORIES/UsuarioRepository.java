package org.fake.productmvp.REPOSITORIES;

import org.fake.productmvp.MODEL.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String username);

}