package OOP.HomeWorks.HomeWork05;

import OOP.HomeWorks.HomeWork05.models.TableModel;
import OOP.HomeWorks.HomeWork05.presenters.BookingPresenter;
import OOP.HomeWorks.HomeWork05.views.BookingView;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTableEvent(new Date(), 13, "Виктор");

        bookingView.onChangeReservationTable(77, new Date(), 7, "Петр");
    }
}
