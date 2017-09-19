package com.extreme.feature;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

/**
 * Created by hendrikebbers on 19.09.17.
 */
public class OptionsDialog extends Stage {

    private final OptionsPane optionsPane = new OptionsPane();

    public OptionsDialog(final Window parent) {
        setTitle("Makeover Tools");
        setResizable(false);
        initStyle(StageStyle.UTILITY);
        setOnCloseRequest(evt -> evt.consume());

        Scene optionsScene = new Scene(optionsPane);
        setScene(optionsScene);

        sizeToScene();
        if(parent != null) {
            setX(parent.getX() + parent.getWidth() - 40);
            setY(parent.getY() + 100);
            initOwner(parent);
        }
    }

    public void addFeature(final Feature feature) {
        optionsPane.addFeature(feature);
    }
}
