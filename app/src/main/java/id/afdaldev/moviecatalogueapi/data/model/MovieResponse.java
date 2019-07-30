package id.afdaldev.moviecatalogueapi.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse {

    @SerializedName("page")
    private int page;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("results")
    private List<Results> results;

    public List<Results> getResults() {
        return results;
    }

    public static class Results implements Parcelable {

        @SerializedName("vote_count")
        private int voteCount;
        @SerializedName("id")
        private int id;
        @SerializedName("video")
        private boolean video;
        @SerializedName("vote_average")
        private double voteAverage;
        @SerializedName("title")
        private String title;
        @SerializedName("popularity")
        private double popularity;
        @SerializedName("poster_path")
        private String posterPath;
        @SerializedName("original_language")
        private String originalLanguage;
        @SerializedName("original_title")
        private String originalTitle;
        @SerializedName("backdrop_path")
        private String backdropPath;
        @SerializedName("adult")
        private boolean adult;
        @SerializedName("overview")
        private String overview;
        @SerializedName("release_date")
        private String releaseDate;
        @SerializedName("genre_ids")
        private List<Integer> genreIds;

        public int getVoteCount() {
            return voteCount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getVoteAverage() {
            return voteAverage;
        }

        public String getTitle() {
            return title;
        }

        public double getPopularity() {
            return popularity;
        }

        public String getPosterPath() {
            return posterPath;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public String getOverview() {
            return overview;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(voteCount);
            dest.writeInt(id);
            dest.writeByte((byte) (video ? 1 : 0));
            dest.writeDouble(voteAverage);
            dest.writeString(title);
            dest.writeDouble(popularity);
            dest.writeString(posterPath);
            dest.writeString(originalLanguage);
            dest.writeString(originalTitle);
            dest.writeString(backdropPath);
            dest.writeByte((byte) (adult ? 1 : 0));
            dest.writeString(overview);
            dest.writeString(releaseDate);
        }

        protected Results(Parcel in) {
            voteCount = in.readInt();
            id = in.readInt();
            video = in.readByte() != 0;
            voteAverage = in.readDouble();
            title = in.readString();
            popularity = in.readDouble();
            posterPath = in.readString();
            originalLanguage = in.readString();
            originalTitle = in.readString();
            backdropPath = in.readString();
            adult = in.readByte() != 0;
            overview = in.readString();
            releaseDate = in.readString();
        }

        public static final Creator<Results> CREATOR = new Creator<Results>() {
            @Override
            public Results createFromParcel(Parcel in) {
                return new Results(in);
            }

            @Override
            public Results[] newArray(int size) {
                return new Results[size];
            }
        };
    }
}
