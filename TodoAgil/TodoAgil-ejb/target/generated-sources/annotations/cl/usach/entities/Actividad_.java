package cl.usach.entities;

import cl.usach.entities.Miembro;
import cl.usach.entities.Tarjeta;
import cl.usach.entities.TipoActividad;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-10-22T02:10:39")
@StaticMetamodel(Actividad.class)
public class Actividad_ { 

    public static volatile SingularAttribute<Actividad, Date> fechaActividad;
    public static volatile SingularAttribute<Actividad, String> idActividadExt;
    public static volatile SingularAttribute<Actividad, Miembro> idMiembro;
    public static volatile SingularAttribute<Actividad, Tarjeta> idTarjeta;
    public static volatile SingularAttribute<Actividad, Integer> idActividad;
    public static volatile SingularAttribute<Actividad, TipoActividad> idTipoActividad;

}