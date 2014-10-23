package cl.usach.entities;

import cl.usach.entities.Actividad;
import cl.usach.entities.DetalleUsuarioTarjeta;
import cl.usach.entities.EstadoTarjeta;
import cl.usach.entities.Lista;
import cl.usach.entities.Tablero;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-10-22T02:10:39")
@StaticMetamodel(Tarjeta.class)
public class Tarjeta_ { 

    public static volatile SingularAttribute<Tarjeta, Date> fechaInicioTarjeta;
    public static volatile SingularAttribute<Tarjeta, Date> fechaFinalTarjeta;
    public static volatile SingularAttribute<Tarjeta, String> idTarjetaExt;
    public static volatile SingularAttribute<Tarjeta, EstadoTarjeta> idEstadoTarjeta;
    public static volatile SingularAttribute<Tarjeta, String> nombreTarjeta;
    public static volatile SingularAttribute<Tarjeta, Lista> idLista;
    public static volatile ListAttribute<Tarjeta, Actividad> actividadList;
    public static volatile SingularAttribute<Tarjeta, Date> fechaCreacionTarjeta;
    public static volatile SingularAttribute<Tarjeta, Date> fechaLimiteTarjeta;
    public static volatile ListAttribute<Tarjeta, DetalleUsuarioTarjeta> detalleUsuarioTarjetaList;
    public static volatile SingularAttribute<Tarjeta, Integer> idTarjeta;
    public static volatile SingularAttribute<Tarjeta, Tablero> idTablero;

}