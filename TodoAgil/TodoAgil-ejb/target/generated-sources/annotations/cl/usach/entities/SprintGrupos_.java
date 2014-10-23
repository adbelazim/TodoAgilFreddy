package cl.usach.entities;

import cl.usach.entities.SprintAsignatura;
import cl.usach.entities.Tablero;
import cl.usach.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-10-22T02:10:39")
@StaticMetamodel(SprintGrupos.class)
public class SprintGrupos_ { 

    public static volatile SingularAttribute<SprintGrupos, String> objetivoUsuarioSprintGrupo;
    public static volatile SingularAttribute<SprintGrupos, Usuario> idUsuario;
    public static volatile SingularAttribute<SprintGrupos, Integer> idSprintGrupo;
    public static volatile SingularAttribute<SprintGrupos, String> objetivoTecnicoSprintGrupo;
    public static volatile ListAttribute<SprintGrupos, Tablero> tableroList;
    public static volatile SingularAttribute<SprintGrupos, String> nombreSprintGrupo;
    public static volatile SingularAttribute<SprintGrupos, SprintAsignatura> idSprintAsignatura;

}