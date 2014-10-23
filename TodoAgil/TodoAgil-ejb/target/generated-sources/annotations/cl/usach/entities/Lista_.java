package cl.usach.entities;

import cl.usach.entities.Tablero;
import cl.usach.entities.Tarjeta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-10-22T02:10:39")
@StaticMetamodel(Lista.class)
public class Lista_ { 

    public static volatile SingularAttribute<Lista, Integer> idLista;
    public static volatile SingularAttribute<Lista, String> nombreLista;
    public static volatile ListAttribute<Lista, Tarjeta> tarjetaList;
    public static volatile SingularAttribute<Lista, Integer> posicion;
    public static volatile SingularAttribute<Lista, String> idListaExt;
    public static volatile SingularAttribute<Lista, Tablero> idTablero;

}