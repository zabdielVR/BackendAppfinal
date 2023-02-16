package org.fake.productmvp.SERVICE;


import org.fake.productmvp.MODEL.Usuario;
import org.fake.productmvp.MODEL.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
