/*
 * Copyright (c) TAKAHASHI,Toru 2015
 */
package pdfviewer;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Pagination;
import javafx.scene.image.ImageView;

/**
 *
 * @author toru
 */
public class PdfViewController implements Initializable {
    
    @FXML
    private Pagination pagination;
    
    private PdfModel model;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        model = new PdfModel(Paths.get("sample.pdf"));
        pagination.setPageCount(model.numPages());
        pagination.setPageFactory(index -> new ImageView(model.getImage(index)));
        
    }    
    
}
