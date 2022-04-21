module io.github.prajjwal.chatserverjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.prajjwal.chatserverjavafx to javafx.fxml;
    exports io.github.prajjwal.chatserverjavafx;
}