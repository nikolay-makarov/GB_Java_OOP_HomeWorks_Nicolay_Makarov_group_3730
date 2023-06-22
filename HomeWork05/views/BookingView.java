package OOP.HomeWorks.HomeWork05.views;

import OOP.HomeWorks.HomeWork05.models.Table;
import OOP.HomeWorks.HomeWork05.presenters.View;
import OOP.HomeWorks.HomeWork05.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void updateTablesView(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void updateReservationTableResult(int reservationNo) {
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
    }

    public void newUpdateReservation() {
        System.out.println("Бронь была изменена");
    }
    public void reservationTableEvent(Date reservationDate, int tableNo, String name) {
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }
}
