package com.extreme;

import com.extreme.data.Database;
import com.extreme.feature.Feature;
import com.extreme.feature.OptionsDialog;
import com.extreme.ui.MovieView;
import javafx.application.Application;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by lemmi on 14.09.17.
 */
public class MovieApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        MovieView movieView = new MovieView();

        Scene scene = new Scene(ViewFactory.createMasterDetailView(Database.loadDefaultDatabase()));
        scene.setCamera(new PerspectiveCamera());
        scene.getStylesheets().add(MovieApp.class.getResource("/styles.css").toExternalForm());
        scene.getStylesheets().add(MovieApp.class.getResource("/listview.css").toExternalForm());

        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("Movie Database");
        primaryStage.setScene(scene);
        primaryStage.setWidth(1100);
        primaryStage.setHeight(720);
        primaryStage.centerOnScreen();
        primaryStage.fullScreenProperty().addListener(e -> System.out.println(primaryStage.isFullScreen()));
        primaryStage.setFullScreen(true);
        primaryStage.show();
        OptionsDialog optionsDialog = new OptionsDialog(primaryStage);

        optionsDialog.addFeature(new Feature("CSS", movieView.useCssProperty()));
        optionsDialog.addFeature(new Feature("CSS - Custom Fonts", movieView.useCustomFontsProperty()));
        optionsDialog.addFeature(new Feature("Filtering", movieView.enableSortingAndFilteringProperty()));
        optionsDialog.addFeature(new Feature("Media View - Trailers", movieView.mediaViewTrailersProperty()));
        optionsDialog.addFeature(new Feature("Media View - Background", movieView.showMediaViewBackgroundProperty()));
        optionsDialog.addFeature(new Feature("Media View - Animations", movieView.animateMediaViewTrailersProperty()));
        optionsDialog.addFeature(new Feature("List View", movieView.useListViewProperty()));
        optionsDialog.addFeature(new Feature("List View - Cell Factory", movieView.useListViewCellFactoryProperty()));
        optionsDialog.addFeature(new Feature("List View - Clipping", movieView.useClippingProperty()));
        optionsDialog.addFeature(new Feature("List View - Scroll Bar", movieView.usePrettyListViewProperty()));
        optionsDialog.addFeature(new Feature("Poster - Effects", movieView.enableEffectsProperty()));
        optionsDialog.addFeature(new Feature("Poster - Parallax", movieView.enableParallaxProperty()));
        optionsDialog.addFeature(new Feature("ControlsFX", movieView.useControlsFXProperty()));
        optionsDialog.addFeature(new Feature("Drag & Drop", movieView.enableDragAndDropOfPosterProperty()));
        optionsDialog.addFeature(new Feature("Drag & Drop - Drag Image", movieView.enableDragAndDropOfPosterWithDragImageProperty()));
        //optionsDialog.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
