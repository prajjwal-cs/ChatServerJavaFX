module io.github.prajjwal.chatserverjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.slf4j;

    opens io.github.prajjwal.chatserverjavafx to javafx.fxml;
    exports io.github.prajjwal.chatserverjavafx;
    exports io.github.prajjwal.chatserverjavafx.controller;
    opens io.github.prajjwal.chatserverjavafx.controller to javafx.fxml;
}