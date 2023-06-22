package OOP.HomeWorks.HomeWork05.presenters;

import OOP.HomeWorks.HomeWork05.models.Table;

import java.util.Collection;

public interface View {

    void setObserver(ViewObserver observer);

    void updateTablesView(Collection<Table> tables);

    void updateReservationTableResult(int reservationNo);

    void newUpdateReservation();
}
