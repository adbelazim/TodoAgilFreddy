package cl.usach.entities;

import cl.usach.entities.Tarjeta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-10-22T02:10:39")
@StaticMetamodel(EstadoTarjeta.class)
public class EstadoTarjeta_ { 

    public static volatile SingularAttribute<EstadoTarjeta, Integer> idEstadoTarjeta;
    public static volatile SingularAttribute<EstadoTarjeta, String> nombreEstadoTarjeta;
    public static volatile ListAttribute<EstadoTarjeta, Tarjeta> tarjetaList;

}