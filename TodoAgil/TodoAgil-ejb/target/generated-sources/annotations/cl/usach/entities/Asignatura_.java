package cl.usach.entities;

import cl.usach.entities.SprintAsignatura;
import cl.usach.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-10-22T02:10:39")
@StaticMetamodel(Asignatura.class)
public class Asignatura_ { 

    public static volatile SingularAttribute<Asignatura, Usuario> idUsuario;
    public static volatile SingularAttribute<Asignatura, String> nombreAsignatura;
    public static volatile SingularAttribute<Asignatura, Integer> semestreAsignatura;
    public static volatile SingularAttribute<Asignatura, Integer> idAsignatura;
    public static volatile SingularAttribute<Asignatura, Integer> horasEjerciciosAsignatura;
    public static volatile SingularAttribute<Asignatura, Integer> horasLaboratorioAsignatura;
    public static volatile ListAttribute<Asignatura, SprintAsignatura> sprintAsignaturaList;
    public static volatile SingularAttribute<Asignatura, Integer> cierreAsignatura;
    public static volatile SingularAttribute<Asignatura, Integer> anoAsignatura;
    public static volatile SingularAttribute<Asignatura, Integer> horasTeoricasAsignatura;

}