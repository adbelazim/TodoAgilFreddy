package cl.usach.entities;

import cl.usach.entities.Equipo;
import cl.usach.entities.Lista;
import cl.usach.entities.Miembro;
import cl.usach.entities.SprintGrupos;
import cl.usach.entities.Tarjeta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-10-22T02:10:39")
@StaticMetamodel(Tablero.class)
public class Tablero_ { 

    public static volatile SingularAttribute<Tablero, String> idTableroExt;
    public static volatile ListAttribute<Tablero, Lista> listaList;
    public static volatile SingularAttribute<Tablero, SprintGrupos> idSprintGrupo;
    public static volatile SingularAttribute<Tablero, String> urlTablero;
    public static volatile ListAttribute<Tablero, Tarjeta> tarjetaList;
    public static volatile ListAttribute<Tablero, Miembro> miembroList;
    public static volatile SingularAttribute<Tablero, Integer> idTablero;
    public static volatile SingularAttribute<Tablero, String> nombreTablero;
    public static volatile ListAttribute<Tablero, Equipo> equipoList;

}