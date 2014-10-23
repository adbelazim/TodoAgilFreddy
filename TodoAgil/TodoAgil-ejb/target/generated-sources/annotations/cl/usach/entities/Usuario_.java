package cl.usach.entities;

import cl.usach.entities.Asignatura;
import cl.usach.entities.Cuenta;
import cl.usach.entities.RolUsuario;
import cl.usach.entities.SprintGrupos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-10-22T02:10:39")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> passUsuario;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> emailUsuario;
    public static volatile ListAttribute<Usuario, Asignatura> asignaturaList;
    public static volatile ListAttribute<Usuario, SprintGrupos> sprintGruposList;
    public static volatile ListAttribute<Usuario, Cuenta> cuentaList;
    public static volatile SingularAttribute<Usuario, String> loginUsuario;
    public static volatile SingularAttribute<Usuario, RolUsuario> idRolUsuario;
    public static volatile SingularAttribute<Usuario, String> nombreUsuario;

}