module com.thenightog.aiit.applyevent.thenightofaiitapplyevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.thenightog.aiit.applyevent.thenightofaiitapplyevent to javafx.fxml;
    exports com.thenightog.aiit.applyevent.thenightofaiitapplyevent;
}