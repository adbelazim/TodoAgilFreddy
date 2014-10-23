package cl.usach.entities;

import cl.usach.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-10-22T02:10:39")
@StaticMetamodel(RolUsuario.class)
public class RolUsuario_ { 

    public static volatile ListAttribute<RolUsuario, Usuario> usuarioList;
    public static volatile SingularAttribute<RolUsuario, String> permisosRolUsuario;
    public static volatile SingularAttribute<RolUsuario, String> nombreRolUsuario;
    public static volatile SingularAttribute<RolUsuario, Integer> idRolUsuario;

}