package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class MovieDto implements Serializable {

    private Long movieId;
    private String title;
    private String image;
    private Integer year;

    public MovieDto(Builder builder) {
        title = builder.title;
        image = builder.image;
        year = builder.year;
        movieId = builder.movieId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public static final class Builder {
        private Long movieId;
        private String title;
        private String image;
        private Integer year;

        public Builder() {
        }

        public Builder movieId(Long movieId) {
            this.movieId = movieId;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder year(Integer year) {
            this.year = year;
            return this;
        }

        public MovieDto build() {
            return new MovieDto(this);
        }
    }
}
