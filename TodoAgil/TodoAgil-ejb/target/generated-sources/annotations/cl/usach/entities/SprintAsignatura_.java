package cl.usach.entities;

import cl.usach.entities.Asignatura;
import cl.usach.entities.SprintGrupos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-10-22T02:10:39")
@StaticMetamodel(SprintAsignatura.class)
public class SprintAsignatura_ { 

    public static volatile SingularAttribute<SprintAsignatura, Date> fechaInicioSprintAsignatura;
    public static volatile SingularAttribute<SprintAsignatura, Date> fechaTerminoSprintAsignatura;
    public static volatile SingularAttribute<SprintAsignatura, String> descripcionSprintAsignatura;
    public static volatile SingularAttribute<SprintAsignatura, Asignatura> idAsignatura;
    public static volatile SingularAttribute<SprintAsignatura, String> nombreSprintAsignatura;
    public static volatile ListAttribute<SprintAsignatura, SprintGrupos> sprintGruposList;
    public static volatile SingularAttribute<SprintAsignatura, Integer> idSprintAsignatura;

}