package id.afdaldev.moviecatalogueapi.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse {

    /**
     * page : 1
     * total_results : 427744
     * total_pages : 21388
     * results : [{"vote_count":754,"id":420818,"video":false,"vote_average":7.2,"title":"The Lion King","popularity":498.836,"poster_path":"/dzBtMocZuJbjLOXvrl4zGYigDzh.jpg","original_language":"en","original_title":"The Lion King","genre_ids":[12,16,10751,18,28],"backdrop_path":"/1TUg5pO1VZ4B0Q1amk3OlXvlpXV.jpg","adult":false,"overview":"Simba idolises his father, King Mufasa, and takes to heart his own royal destiny. But not everyone in the kingdom celebrates the new cub's arrival. Scar, Mufasa's brother\u2014and former heir to the throne\u2014has plans of his own. The battle for Pride Rock is ravaged with betrayal, tragedy and drama, ultimately resulting in Simba's exile. With help from a curious pair of newfound friends, Simba will have to figure out how to grow up and take back what is rightfully his.","release_date":"2019-07-12"},{"vote_count":2355,"id":429617,"video":false,"vote_average":7.8,"title":"Spider-Man: Far from Home","popularity":270.047,"poster_path":"/rjbNpRMoVvqHmhmksbokcyCr7wn.jpg","original_language":"en","original_title":"Spider-Man: Far from Home","genre_ids":[28,12,878],"backdrop_path":"/dihW2yTsvQlust7mSuAqJDtqW7k.jpg","adult":false,"overview":"Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent.","release_date":"2019-06-28"},{"vote_count":22,"id":566555,"video":false,"vote_average":4.8,"title":"Detective Conan: The Fist of Blue Sapphire","popularity":220.741,"poster_path":"/86Y6qM8zTn3PFVfCm9J98Ph7JEB.jpg","original_language":"ja","original_title":"名探偵コナン 紺青の拳（フィスト）","genre_ids":[16,28,18,9648,35],"backdrop_path":"/wf6VDSi4aFCZfuD8sX8JAKLfJ5m.jpg","adult":false,"overview":"23rd movie in the \"Detective Conan\" franchise.","release_date":"2019-04-12"},{"vote_count":1734,"id":447404,"video":false,"vote_average":7,"title":"Pokémon Detective Pikachu","popularity":182.169,"poster_path":"/wgQ7APnFpf1TuviKHXeEe3KnsTV.jpg","original_language":"en","original_title":"Pokémon Detective Pikachu","genre_ids":[28,12,14],"backdrop_path":"/nDP33LmQwNsnPv29GQazz59HjJI.jpg","adult":false,"overview":"In a world where people collect pocket-size monsters (Pokémon) to do battle, a boy comes across an intelligent monster who seeks to be a detective.","release_date":"2019-05-03"},{"vote_count":1,"id":613473,"video":false,"vote_average":3,"title":"Burglary","popularity":160.019,"poster_path":"/xztkk3qwvjTfKArjTkhWUCuadFY.jpg","original_language":"en","original_title":"Burglary","genre_ids":[27,53,9648],"backdrop_path":null,"adult":false,"overview":"While playing videogames Mike spots a mysterious masked man outside his building.","release_date":"2019-07-19"},{"vote_count":2715,"id":399579,"video":false,"vote_average":6.8,"title":"Alita: Battle Angel","popularity":148.382,"poster_path":"/xRWht48C2V8XNfzvPehyClOvDni.jpg","original_language":"en","original_title":"Alita: Battle Angel","genre_ids":[28,878,53,12],"backdrop_path":"/8RKBHHRqOMOLh5qW3sS6TSFTd8h.jpg","adult":false,"overview":"When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.","release_date":"2019-01-31"},{"vote_count":6499,"id":299537,"video":false,"vote_average":7,"title":"Captain Marvel","popularity":128.132,"poster_path":"/AtsgWhDnHTq68L0lLsUrCnM7TjG.jpg","original_language":"en","original_title":"Captain Marvel","genre_ids":[28,12,878],"backdrop_path":"/10csMIye4Vmr5lJpx3cdmMN8FOT.jpg","adult":false,"overview":"The story follows Carol Danvers as she becomes one of the universe\u2019s most powerful heroes when Earth is caught in the middle of a galactic war between two alien races. Set in the 1990s, Captain Marvel is an all-new adventure from a previously unseen period in the history of the Marvel Cinematic Universe.","release_date":"2019-03-06"},{"vote_count":1557,"id":301528,"video":false,"vote_average":7.7,"title":"Toy Story 4","popularity":123.758,"poster_path":"/w9kR8qbmQ01HwnvK4alvnQ2ca0L.jpg","original_language":"en","original_title":"Toy Story 4","genre_ids":[12,16,35,10751],"backdrop_path":"/m67smI1IIMmYzCl9axvKNULVKLr.jpg","adult":false,"overview":"Woody has always been confident about his place in the world and that his priority is taking care of his kid, whether that's Andy or Bonnie. But when Bonnie adds a reluctant new toy called \"Forky\" to her room, a road trip adventure alongside old and new friends will show Woody how big the world can be for a toy.","release_date":"2019-06-19"},{"vote_count":541,"id":479455,"video":false,"vote_average":5.9,"title":"Men in Black: International","popularity":119.358,"poster_path":"/dPrUPFcgLfNbmDL8V69vcrTyEfb.jpg","original_language":"en","original_title":"Men in Black: International","genre_ids":[28,35,878,12],"backdrop_path":"/2FYzxgLNuNVwncilzUeCGbOQzP7.jpg","adult":false,"overview":"The Men in Black have always protected the Earth from the scum of the universe. In this new adventure, they tackle their biggest, most global threat to date: a mole in the Men in Black organization.","release_date":"2019-06-12"},{"vote_count":2,"id":486589,"video":false,"vote_average":0,"title":"Red Shoes and the Seven Dwarfs","popularity":112.294,"poster_path":"/xQccIXfq9J4tgbvdSSPPLLYZGRD.jpg","original_language":"en","original_title":"Red Shoes and the Seven Dwarfs","genre_ids":[16,10749],"backdrop_path":"/4uhVMTAgGt36h68SCTOQKCB4z50.jpg","adult":false,"overview":"Princes who have been turned into Dwarfs seek the red shoes of a lady in order to break the spell, although it will not be easy.","release_date":"2019-07-25"},{"vote_count":2611,"id":287947,"video":false,"vote_average":7.1,"title":"Shazam!","popularity":105.551,"poster_path":"/xnopI5Xtky18MPhK40cZAGAOVeV.jpg","original_language":"en","original_title":"Shazam!","genre_ids":[28,35,14],"backdrop_path":"/bi4jh0Kt0uuZGsGJoUUfqmbrjQg.jpg","adult":false,"overview":"A boy is given the ability to become an adult superhero in times of need with a single magic word.","release_date":"2019-03-23"},{"vote_count":7764,"id":920,"video":false,"vote_average":6.7,"title":"Cars","popularity":102.084,"poster_path":"/jpfkzbIXgKZqCZAkEkFH2VYF63s.jpg","original_language":"en","original_title":"Cars","genre_ids":[16,12,35,10751],"backdrop_path":"/a1MlbLBk5Sy6YvMbSuKfwGlDVlb.jpg","adult":false,"overview":"Lightning McQueen, a hotshot rookie race car driven to succeed, discovers that life is about the journey, not the finish line, when he finds himself unexpectedly detoured in the sleepy Route 66 town of Radiator Springs. On route across the country to the big Piston Cup Championship in California to compete against two seasoned pros, McQueen gets to know the town's offbeat characters.","release_date":"2006-06-08"},{"vote_count":7916,"id":299534,"video":false,"vote_average":8.4,"title":"Avengers: Endgame","popularity":101.953,"poster_path":"/or06FN3Dka5tukK1e9sl16pB3iy.jpg","original_language":"en","original_title":"Avengers: Endgame","genre_ids":[12,878,28],"backdrop_path":"/7RyHsO4yDXtBv1zUU3mTpHeQ0d5.jpg","adult":false,"overview":"After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.","release_date":"2019-04-24"},{"vote_count":1642,"id":458156,"video":false,"vote_average":7.1,"title":"John Wick: Chapter 3 \u2013 Parabellum","popularity":100.609,"poster_path":"/ziEuG1essDuWuC5lpWUaw1uXY2O.jpg","original_language":"en","original_title":"John Wick: Chapter 3 \u2013 Parabellum","genre_ids":[80,28,53],"backdrop_path":"/vVpEOvdxVBP2aV166j5Xlvb5Cdc.jpg","adult":false,"overview":"Super-assassin John Wick returns with a $14 million price tag on his head and an army of bounty-hunting killers on his trail. After killing a member of the shadowy international assassin\u2019s guild, the High Table, John Wick is excommunicado, but the world\u2019s most ruthless hit men and women await his every turn.","release_date":"2019-05-15"},{"vote_count":48,"id":81452,"video":false,"vote_average":4.1,"title":"The Japanese Wife Next Door","popularity":93.363,"poster_path":"/rb8HjegADc7q7O5A0yFnQiFtzXp.jpg","original_language":"ja","original_title":"Inran naru ichizoku: Dai-ni-shô - zetsurin no hate ni","genre_ids":[],"backdrop_path":"/hpYG98Z86AyebWymFqVyOzkUJiR.jpg","adult":false,"overview":"An outrageous and insanely over the top erotic (\u2018Pinku\u2019) movie that delights in breaking several taboos, in the unique way that only a Pinku movie can! The story starts with office worker Takashi, who shares a drink one night with two women (Mina and Sakura). Fate intervenes and he subsequently ends up marrying Sakura (played by busty JAV Idol, Reiko Yamaguchi). The newlywed couple move into Takashi\u2019s family home (shared with his sister, father and grandfather), but Sakura\u2019s nymphomaniac sex drive soon starts to cause tensions.  When Takashi starts to falter in his marital duties, Sakura turns to the rest of the family in order to satisfy her nympho lust\u2026.  Trivia: This movie was followed by a sequel (The Japanese Wife Next Door \u2013 Part 2) which features the exact same cast, but follows Takashi\u2019s fate if he had married Mina (the other woman he shared the drink with that night) instead.","release_date":"2004-06-23"},{"vote_count":729,"id":456740,"video":false,"vote_average":5,"title":"Hellboy","popularity":92.52,"poster_path":"/bk8LyaMqUtaQ9hUShuvFznQYQKR.jpg","original_language":"en","original_title":"Hellboy","genre_ids":[28,12,14,27,878],"backdrop_path":"/5BkSkNtfrnTuKOtTaZhl8avn4wU.jpg","adult":false,"overview":"Hellboy comes to England, where he must defeat Nimue, Merlin's consort and the Blood Queen. But their battle will bring about the end of the world, a fate he desperately tries to turn away.","release_date":"2019-04-10"},{"vote_count":219,"id":459992,"video":false,"vote_average":6.9,"title":"Long Shot","popularity":91.482,"poster_path":"/m2ttWZ8rMRwIMT7zA48Jo6mTkDS.jpg","original_language":"en","original_title":"Long Shot","genre_ids":[35,10749],"backdrop_path":"/88r25ghJzVYKq0vaOApqEOZsQlD.jpg","adult":false,"overview":"When Fred Flarsky reunites with and charms his first crush, Charlotte Field\u2014one of the most influential women in the world. As Charlotte prepares to make a run for the Presidency, she hires Fred as her speechwriter and sparks fly.","release_date":"2019-05-02"},{"vote_count":49,"id":458302,"video":false,"vote_average":7.6,"title":"Remi, Nobody's Boy","popularity":83.033,"poster_path":"/mQYXlxlUTmOP4FWt52qkZZb8JNM.jpg","original_language":"fr","original_title":"Rémi sans famille","genre_ids":[18,35],"backdrop_path":"/4aFtD31RpP018y8XipTLrU8Y3pa.jpg","adult":false,"overview":"The adventures of the young Rémi, an orphan, collected by the gentle Madam Barberin. At the age of 10 years, he is snatched from his adoptive mother and entrusted to the signor Vitalis, a mysterious itinerant musician. Has its sides, he will learn the harsh life of acrobat and sing to win his bread. Accompanied by the faithful dog capi and of the small monkey Joli-Coeur, his long trip through France, made for meetings, friendships and mutual assistance, leads him to the secret of its origins.","release_date":"2018-12-12"},{"vote_count":200,"id":612152,"video":false,"vote_average":5.6,"title":"Secret Obsession","popularity":81.975,"poster_path":"/iKMeE6oYzBVzhA6xLGb8PPWEruF.jpg","original_language":"en","original_title":"Secret Obsession","genre_ids":[18,53],"backdrop_path":"/uQUlZIyrVmOfVVj2JRrPmRcn6M1.jpg","adult":false,"overview":"Newlywed Jennifer is brutally attacked at a dark rest stop. While healing from her injuries, she can\u2019t recall anything from her past, including the ordeal. Her husband, Russell , is just thankful she\u2019s alive and eager to get her home. As he reintroduces her to their secluded mountain estate, Detective Page  pursues Jennifer\u2019s assailant \u2014 his own daughter went missing and was never found. The same fate now awaits Jennifer, unless someone realizes that her loving caretaker is actually her captor.","release_date":"2019-07-18"},{"vote_count":20,"id":466272,"video":false,"vote_average":6.5,"title":"Once Upon a Time in Hollywood","popularity":78.362,"poster_path":"/8j58iEBw9pOXFD2L0nt0ZXeHviB.jpg","original_language":"en","original_title":"Once Upon a Time in Hollywood","genre_ids":[18,35,28,80,37],"backdrop_path":"/b82nVVhYNRgtsTFV1jkdDwe6LJZ.jpg","adult":false,"overview":"A faded television actor and his stunt double strive to achieve fame and success in the film industry during the final years of Hollywood's Golden Age in 1969 Los Angeles.","release_date":"2019-07-25"}]
     */

    @SerializedName("page")
    private int page;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("results")
    private List<Results> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public static class Results implements Parcelable {
        /**
         * vote_count : 754
         * id : 420818
         * video : false
         * vote_average : 7.2
         * title : The Lion King
         * popularity : 498.836
         * poster_path : /dzBtMocZuJbjLOXvrl4zGYigDzh.jpg
         * original_language : en
         * original_title : The Lion King
         * genre_ids : [12,16,10751,18,28]
         * backdrop_path : /1TUg5pO1VZ4B0Q1amk3OlXvlpXV.jpg
         * adult : false
         * overview : Simba idolises his father, King Mufasa, and takes to heart his own royal destiny. But not everyone in the kingdom celebrates the new cub's arrival. Scar, Mufasa's brother—and former heir to the throne—has plans of his own. The battle for Pride Rock is ravaged with betrayal, tragedy and drama, ultimately resulting in Simba's exile. With help from a curious pair of newfound friends, Simba will have to figure out how to grow up and take back what is rightfully his.
         * release_date : 2019-07-12
         */

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

        public void setVoteCount(int voteCount) {
            this.voteCount = voteCount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public boolean isVideo() {
            return video;
        }

        public void setVideo(boolean video) {
            this.video = video;
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

        public String getOriginalLanguage() {
            return originalLanguage;
        }

        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
        }

        public String getOriginalTitle() {
            return originalTitle;
        }

        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        public boolean isAdult() {
            return adult;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public List<Integer> getGenreIds() {
            return genreIds;
        }

        public void setGenreIds(List<Integer> genreIds) {
            this.genreIds = genreIds;
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
