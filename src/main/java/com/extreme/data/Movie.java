package com.extreme.data;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class Movie {

    public Movie() {

    }

    // title
    private final StringProperty title = new SimpleStringProperty(this, "title");

    public final StringProperty titleProperty() {
        return title;
    }

    public final void setTitle(String title) {
        this.title.set(title);
    }

    public final String getTitle() {
        return title.get();
    }

    // year
    private final IntegerProperty year = new SimpleIntegerProperty(this, "year");

    public final IntegerProperty yearProperty() {
        return year;
    }

    public final int getYear() {
        return year.get();
    }

    public final void setYear(int year) {
        this.year.set(year);
    }

    // genre
    private final ObjectProperty<Genre> genre = new SimpleObjectProperty(this, "genre", Genre.ACTION);

    public final ObjectProperty<Genre> genreProperty() {
        return genre;
    }

    public final Genre getGenre() {
        return genre.get();
    }

    public final void setGenre(Genre genre) {
        this.genre.set(genre);
    }

    // director
    private final StringProperty director = new SimpleStringProperty(this, "director");

    public final StringProperty directorProperty() {
        return director;
    }

    public final String getDirector() {
        return director.get();
    }

    public final void setDirector(String director) {
        this.director.set(director);
    }

    // director image

    // trailer
    private final StringProperty directorImage = new SimpleStringProperty(this, "directorImage");

    public final StringProperty directorImageProperty() {
        return directorImage;
    }

    public final void setDirectorImage(String directorImage) {
        this.directorImage.set(directorImage);
    }

    public final String getDirectorImage() {
        return directorImage.get();
    }

    // poster
    private final StringProperty posterFileName = new SimpleStringProperty(this, "posterFileName");

    public final StringProperty posterFileNameProperty() {
        return posterFileName;
    }

    public final String getPosterFileName() {
        return posterFileName.get();
    }

    public final void setPosterFileName(String posterFileName) {
        this.posterFileName.set(posterFileName);
    }

    // rating
    private final IntegerProperty rating = new SimpleIntegerProperty(this, "rating");

    public final IntegerProperty ratingProperty() {
        return rating;
    }

    public final int getRating() {
        return rating.get();
    }

    public final void setRating(int rating) {
        this.rating.set(rating);
    }

    // synopsis
    private final StringProperty synopsis = new SimpleStringProperty(this, "synopsis");

    public final StringProperty synopsisProperty() {
        return synopsis;
    }

    public final String getSynopsis() {
        return synopsis.get();
    }

    public final void setSynopsis(String synopsis) {
        this.synopsis.set(synopsis);
    }

    // trailer
    private final StringProperty trailer = new SimpleStringProperty(this, "trailer");

    public final StringProperty trailerProperty() {
        return trailer;
    }

    public final String getTrailer() {
        return trailer.get();
    }

    public final void setTrailer(String trailer) {
        this.trailer.set(trailer);
    }

    // trailer
    private final StringProperty youTube = new SimpleStringProperty(this, "youTube");

    public final StringProperty youTubeProperty() {
        return youTube;
    }

    public final void setYouTube(String youTube) {
        this.youTube.set(youTube);
    }

    public final String getYouTube() {
        return youTube.get();
    }

    @Override
    public String toString() {
        return title.get() + "(" + year.get() +
                "), " + genre.get() +
                ", rating=" + rating.get() + "%";
    }
}
