package cl.usach.entities;

import cl.usach.entities.Cuenta;
import cl.usach.entities.TipoActividad;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-10-22T02:10:39")
@StaticMetamodel(TipoCuenta.class)
public class TipoCuenta_ { 

    public static volatile SingularAttribute<TipoCuenta, Integer> idTipoCuenta;
    public static volatile SingularAttribute<TipoCuenta, String> nombreTipoCuenta;
    public static volatile ListAttribute<TipoCuenta, TipoActividad> tipoActividadList;
    public static volatile ListAttribute<TipoCuenta, Cuenta> cuentaList;

}