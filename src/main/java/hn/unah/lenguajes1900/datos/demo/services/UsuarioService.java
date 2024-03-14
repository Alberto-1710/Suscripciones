package hn.unah.lenguajes1900.datos.demo.services;


import java.util.List;
import java.util.Optional;

import hn.unah.lenguajes1900.datos.demo.entities.Usuario;


public interface UsuarioService {
    
    public Usuario crearUsuario(Usuario usuario);

    public List<Usuario> obtenerUsuarios();

    public Optional<Usuario> buscarPorId(long id);

    public Usuario actualizarUsuario(long id, Usuario usuario); //Usuario (nos retorna un objeto usuario)
                                                                //y lo que le enviaremos tipo PK y objeto Usuario
    
    public String eliminarUsuario(long id);
    
}
