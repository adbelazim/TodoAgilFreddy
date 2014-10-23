package cl.usach.entities;

import cl.usach.entities.Equipo;
import cl.usach.entities.Miembro;
import cl.usach.entities.TipoCuenta;
import cl.usach.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-10-22T02:10:39")
@StaticMetamodel(Cuenta.class)
public class Cuenta_ { 

    public static volatile SingularAttribute<Cuenta, TipoCuenta> idTipoCuenta;
    public static volatile SingularAttribute<Cuenta, Usuario> idUsuario;
    public static volatile SingularAttribute<Cuenta, String> secretCuenta;
    public static volatile SingularAttribute<Cuenta, String> emailCuenta;
    public static volatile SingularAttribute<Cuenta, String> nombreUsuarioCuenta;
    public static volatile SingularAttribute<Cuenta, Integer> idCuenta;
    public static volatile SingularAttribute<Cuenta, String> keyCuenta;
    public static volatile SingularAttribute<Cuenta, String> tokenCuenta;
    public static volatile ListAttribute<Cuenta, Miembro> miembroList;
    public static volatile ListAttribute<Cuenta, Equipo> equipoList;

}