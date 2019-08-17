package id.afdaldev.moviecatalogueapi.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.provider.BaseColumns;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TVShowResponse {

    public static final String TABLE_NAME = "tv_show";
    public static final String COLUMNS_ID = BaseColumns._ID;

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

        @SerializedName("id")
        @PrimaryKey
        @ColumnInfo(name = COLUMNS_ID)
        private int id;
        @SerializedName("name")
        private String name;
        @SerializedName("popularity")
        private double popularity;
        @SerializedName("vote_count")
        private int voteCount;
        @SerializedName("vote_average")
        private double voteAverage;
        @SerializedName("poster_path")
        private String posterPath;
        @SerializedName("backdrop_path")
        private String backdropPath;
        @SerializedName("overview")
        private String overview;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public int getVoteCount() {
            return voteCount;
        }

        public void setVoteCount(int voteCount) {
            this.voteCount = voteCount;
        }

        public double getVoteAverage() {
            return voteAverage;
        }

        public void setVoteAverage(double voteAverage) {
            this.voteAverage = voteAverage;
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
            dest.writeInt(this.id);
            dest.writeString(this.name);
            dest.writeDouble(this.popularity);
            dest.writeInt(this.voteCount);
            dest.writeDouble(this.voteAverage);
            dest.writeString(this.posterPath);
            dest.writeString(this.backdropPath);
            dest.writeString(this.overview);
        }

        public Results() {
        }

        protected Results(Parcel in) {
            this.id = in.readInt();
            this.name = in.readString();
            this.popularity = in.readDouble();
            this.voteCount = in.readInt();
            this.voteAverage = in.readDouble();
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