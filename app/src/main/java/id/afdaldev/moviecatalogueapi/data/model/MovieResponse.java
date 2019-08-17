package id.afdaldev.moviecatalogueapi.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.provider.BaseColumns;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse {

    public static final String TABLE_NAME = "movie";
    public static final String COLUMN_ID = BaseColumns._ID;

    @SerializedName("results")
    private List<Results> results;

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    @Entity(tableName = TABLE_NAME)
    public static class Results implements Parcelable {

        @SerializedName("vote_count")
        private int voteCount;
        @SerializedName("id")
        @PrimaryKey
        @ColumnInfo(name = COLUMN_ID)
        private int id;
        @SerializedName("vote_average")
        private double voteAverage;
        @SerializedName("title")
        private String title;
        @SerializedName("popularity")
        private double popularity;
        @SerializedName("poster_path")
        private String posterPath;
        @SerializedName("backdrop_path")
        private String backdropPath;
        @SerializedName("overview")
        private String overview;

        public int getVoteCount() {
            return voteCount;
        }

        public void setVoteCount(int voteCount) {
            this.voteCount = voteCount;
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

        public void setVoteAverage(double voteAverage) {
            this.voteAverage = voteAverage;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public String getPosterPath() {
            return posterPath;
        }

        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.voteCount);
            dest.writeInt(this.id);
            dest.writeDouble(this.voteAverage);
            dest.writeString(this.title);
            dest.writeDouble(this.popularity);
            dest.writeString(this.posterPath);
            dest.writeString(this.backdropPath);
            dest.writeString(this.overview);
        }

        public Results() {
        }

        protected Results(Parcel in) {
            this.voteCount = in.readInt();
            this.id = in.readInt();
            this.voteAverage = in.readDouble();
            this.title = in.readString();
            this.popularity = in.readDouble();
            this.posterPath = in.readString();
            this.backdropPath = in.readString();
            this.overview = in.readString();
        }

        public static final Parcelable.Creator<Results> CREATOR = new Parcelable.Creator<Results>() {
            @Override
            public Results createFromParcel(Parcel source) {
                return new Results(source);
            }

            @Override
            public Results[] newArray(int size) {
                return new Results[size];
            }
        };
    }
}