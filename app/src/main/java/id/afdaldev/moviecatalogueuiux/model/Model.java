package id.afdaldev.moviecatalogueuiux.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Model implements Parcelable {
    private int photo;
    private String title;
    private String overview;

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

    public Model() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(photo);
        dest.writeString(title);
        dest.writeString(overview);
    }

    protected Model(Parcel in) {
        photo = in.readInt();
        title = in.readString();
        overview = in.readString();
    }

    public static final Creator<Model> CREATOR = new Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel in) {
            return new Model(in);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

    public int getPhoto() {
        return photo;
    }
}
