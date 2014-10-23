package cl.usach.entities;

import cl.usach.entities.Miembro;
import cl.usach.entities.Tarjeta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-10-22T02:10:39")
@StaticMetamodel(DetalleUsuarioTarjeta.class)
public class DetalleUsuarioTarjeta_ { 

    public static volatile SingularAttribute<DetalleUsuarioTarjeta, Integer> idDetalleUsuarioTarjeta;
    public static volatile SingularAttribute<DetalleUsuarioTarjeta, Tarjeta> idTarjeta;
    public static volatile SingularAttribute<DetalleUsuarioTarjeta, Miembro> idMiembro;

}