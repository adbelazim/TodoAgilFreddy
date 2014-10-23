package cl.usach.entities;

import cl.usach.entities.Actividad;
import cl.usach.entities.Cuenta;
import cl.usach.entities.DetalleUsuarioTarjeta;
import cl.usach.entities.Tablero;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-10-22T02:10:39")
@StaticMetamodel(Miembro.class)
public class Miembro_ { 

    public static volatile SingularAttribute<Miembro, String> nombreUsuarioMiembro;
    public static volatile SingularAttribute<Miembro, String> idMiembroExt;
    public static volatile ListAttribute<Miembro, Actividad> actividadList;
    public static volatile ListAttribute<Miembro, DetalleUsuarioTarjeta> detalleUsuarioTarjetaList;
    public static volatile SingularAttribute<Miembro, Integer> idMiembro;
    public static volatile SingularAttribute<Miembro, Cuenta> idCuenta;
    public static volatile SingularAttribute<Miembro, Tablero> idTablero;

}