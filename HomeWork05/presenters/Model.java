package OOP.HomeWorks.HomeWork05.presenters;

import OOP.HomeWorks.HomeWork05.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {


    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);

    int onChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name);

}
