/*
 * Copyright (c) TAKAHASHI,Toru 2015
 */
package pdfviewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * PDF文書のページを分割したり、結合したりといった簡易な操作を行うツール。
 * 
 * @author toru
 */
public class PdfViewer extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PdfView.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("PDF simple viewer by PDFBox");
        stage.show();
    }
    
}
