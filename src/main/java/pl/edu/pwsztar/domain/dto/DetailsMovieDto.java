package pl.edu.pwsztar.domain.dto;

public class DetailsMovieDto {
    private String title;
    private String videoId;
    private String image;
    private Integer year;

    public DetailsMovieDto(Builder builder) {
        title = builder.title;
        image = builder.image;
        year = builder.year;
        videoId = builder.videoId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public String getVideoId() {
        return videoId;
    }

    public String getImage() {
        return image;
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

    @Override
    public String toString() {
        return "DetailsMovieDto{" +
                "title='" + title + '\'' +
                ", videoId='" + videoId + '\'' +
                '}';
    }

    public static final class Builder {
        private String title;
        private String image;
        private Integer year;
        private String videoId;

        public Builder() {
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

        public Builder videoId(String videoId) {
            this.videoId = videoId;
            return this;
        }

        public DetailsMovieDto build() {
            return new DetailsMovieDto(this);
        }
    }
}
