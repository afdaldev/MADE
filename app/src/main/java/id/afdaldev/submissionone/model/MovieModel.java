package id.afdaldev.submissionone.model;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieModel implements Parcelable{

    private int photo;
    private String title;
    private String overview;

    public MovieModel() {
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    protected MovieModel(Parcel in) {
        photo = in.readInt();
        title = in.readString();
        overview = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(photo);
        dest.writeString(title);
        dest.writeString(overview);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MovieModel> CREATOR = new Creator<MovieModel>() {
        @Override
        public MovieModel createFromParcel(Parcel in) {
            return new MovieModel(in);
        }

        @Override
        public MovieModel[] newArray(int size) {
            return new MovieModel[size];
        }
    };
}
