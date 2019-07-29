package id.afdaldev.moviecatalogueapi.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TVShowResponse {

    /**
     * page : 1
     * total_results : 83322
     * total_pages : 4167
     * results : [{"original_name":"See No Evil: The Moors Murders","genre_ids":[18],"name":"See No Evil: The Moors Murders","popularity":481.27,"origin_country":["GB"],"vote_count":13,"first_air_date":"2006-05-14","backdrop_path":"/7AKhSfJHnVi0zXQS4eJirHDs22p.jpg","original_language":"en","id":11634,"vote_average":4.5,"overview":"The dramatisation of one of the most notorious killing sprees in British history.","poster_path":"/b71BaRjp9TwxUZodLGgSRIlkfL8.jpg"},{"original_name":"La casa de papel","genre_ids":[80,18],"name":"Money Heist","popularity":293.955,"origin_country":["ES"],"vote_count":420,"first_air_date":"2017-05-02","backdrop_path":"/piuRhGiQBYWgW668eSNJ2ug5uAO.jpg","original_language":"es","id":71446,"vote_average":8.1,"overview":"To carry out the biggest heist in history, a mysterious man called The Professor recruits a band of eight robbers who have a single characteristic: none of them has anything to lose. Five months of seclusion - memorizing every step, every detail, every probability - culminate in eleven days locked up in the National Coinage and Stamp Factory of Spain, surrounded by police forces and with dozens of hostages in their power, to find out whether their suicide wager will lead to everything or nothing.","poster_path":"/MoEKaPFHABtA1xKoOteirGaHl1.jpg"},{"original_name":"The Flash","genre_ids":[18,10765],"name":"The Flash","popularity":239.682,"origin_country":["US"],"vote_count":2748,"first_air_date":"2014-10-07","backdrop_path":"/jC1KqsFx8ZyqJyQa2Ohi7xgL7XC.jpg","original_language":"en","id":60735,"vote_average":6.7,"overview":"After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.","poster_path":"/fki3kBlwJzFp8QohL43g9ReV455.jpg"},{"original_name":"Arrow","genre_ids":[80,18,9648,10759],"name":"Arrow","popularity":233.902,"origin_country":["US"],"vote_count":2538,"first_air_date":"2012-10-10","backdrop_path":"/dKxkwAJfGuznW8Hu0mhaDJtna0n.jpg","original_language":"en","id":1412,"vote_average":5.8,"overview":"Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.","poster_path":"/mo0FP1GxOFZT4UDde7RFDz5APXF.jpg"},{"original_name":"Legion","genre_ids":[10759,10765],"name":"Legion","popularity":229.54,"origin_country":["US"],"vote_count":580,"first_air_date":"2017-02-08","backdrop_path":"/87eP7ITTrOWvkA4EqCuoRdyjzLy.jpg","original_language":"en","id":67195,"vote_average":7.5,"overview":"David Haller, AKA Legion, is a troubled young man who may be more than human. Diagnosed as schizophrenic, David has been in and out of psychiatric hospitals for years. But after a strange encounter with a fellow patient, he\u2019s confronted with the possibility that the voices he hears and the visions he sees might be real.","poster_path":"/vT0Zsbm4GWd7llNjgWEtwY0CqOv.jpg"},{"original_name":"Crímenes que cambiaron la historia","genre_ids":[99,10767],"name":"Crímenes que cambiaron la historia","popularity":199.464,"origin_country":["ES"],"vote_count":6,"first_air_date":"2019-01-22","backdrop_path":"/fngq96eBFAlXuqUzzKuxCi0ytsB.jpg","original_language":"es","id":86816,"vote_average":3.5,"overview":"","poster_path":"/fMgPDXqSL4XILb0RKSXpDqc5tJ9.jpg"},{"original_name":"Stranger Things","genre_ids":[18,9648,10765],"name":"Stranger Things","popularity":192.698,"origin_country":["US"],"vote_count":2440,"first_air_date":"2016-07-15","backdrop_path":"/56v2KjBlU4XaOv9rVYEQypROD7P.jpg","original_language":"en","id":66732,"vote_average":8.3,"overview":"When a young boy vanishes, a small town uncovers a mystery involving secret experiments, terrifying supernatural forces, and one strange little girl.","poster_path":"/x2LSRK2Cm7MZhjluni1msVJ3wDF.jpg"},{"original_name":"The 100","genre_ids":[18,10765],"name":"The 100","popularity":190.599,"origin_country":["US"],"vote_count":1602,"first_air_date":"2014-03-19","backdrop_path":"/qYTIuJJ7fIehicAt3bl0vW70Sq6.jpg","original_language":"en","id":48866,"vote_average":6.5,"overview":"100 years in the future, when the Earth has been abandoned due to radioactivity, the last surviving humans live on an ark orbiting the planet \u2014 but the ark won't last forever. So the repressive regime picks 100 expendable juvenile delinquents to send down to Earth to see if the planet is still habitable.","poster_path":"/wBzNjurA8ijJPF21Ggs9nbviIzi.jpg"},{"original_name":"Pandora","genre_ids":[10759,10765],"name":"Pandora","popularity":181.109,"origin_country":[],"vote_count":3,"first_air_date":"2019-07-16","backdrop_path":"/dUn5B2B5BaM2de21Z3fZP79NK4m.jpg","original_language":"en","id":90670,"vote_average":5.7,"overview":"Set in the year 2199, a young woman who has lost everything finds a new life at Earth's Space Training Academy where she learns to defend the galaxy from intergalactic threats.","poster_path":"/tPsvhL45f1AjES5rycFIxnbaH8v.jpg"},{"original_name":"Murder, She Wrote","genre_ids":[80,18,9648],"name":"Murder, She Wrote","popularity":179.625,"origin_country":["US"],"vote_count":83,"first_air_date":"1984-09-30","backdrop_path":"/5M8bF0BwBk6RtJVrvpS9zj2bcxM.jpg","original_language":"en","id":484,"vote_average":7.1,"overview":"An unassuming mystery writer turned sleuth uses her professional insight to help solve real-life homicide cases.","poster_path":"/j6DC2Xe0SZS6xKS2d6LWL1EGwzX.jpg"},{"original_name":"Grey's Anatomy","genre_ids":[18],"name":"Grey's Anatomy","popularity":164.45,"origin_country":["US"],"vote_count":974,"first_air_date":"2005-03-27","backdrop_path":"/y6JABtgWMVYPx84Rvy7tROU5aNH.jpg","original_language":"en","id":1416,"vote_average":6.3,"overview":"Follows the personal and professional lives of a group of doctors at Seattle\u2019s Grey Sloan Memorial Hospital.","poster_path":"/eqgIOObafPJitt8JNh1LuO2fvqu.jpg"},{"original_name":"ワンパンマン","genre_ids":[16,35,10759],"name":"One-Punch Man","popularity":161.896,"origin_country":["JP"],"vote_count":438,"first_air_date":"2015-10-04","backdrop_path":"/s0w8JbuNNxL1YgaHeDWih12C3jG.jpg","original_language":"ja","id":63926,"vote_average":8,"overview":"Saitama is a hero who only became a hero for fun. After three years of \u201cspecial\u201d training, though, he\u2019s become so strong that he\u2019s practically invincible. In fact, he\u2019s too strong\u2014even his mightiest opponents are taken out with a single punch, and it turns out that being devastatingly powerful is actually kind of a bore. With his passion for being a hero lost along with his hair, yet still faced with new enemies every day, how much longer can he keep it going?","poster_path":"/iE3s0lG5QVdEHOEZnoAxjmMtvne.jpg"},{"original_name":"Family Guy","genre_ids":[16,35],"name":"Family Guy","popularity":159.899,"origin_country":["US"],"vote_count":1567,"first_air_date":"1999-01-31","backdrop_path":"/3OFrs1ets87VmRvG78Zg5eJTZeq.jpg","original_language":"en","id":1434,"vote_average":6.5,"overview":"Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.","poster_path":"/gBGUL1UTUNmdRQT8gA1LUV4yg39.jpg"},{"original_name":"Marvel's Agents of S.H.I.E.L.D.","genre_ids":[18,10759,10765],"name":"Marvel's Agents of S.H.I.E.L.D.","popularity":159.457,"origin_country":["US"],"vote_count":1327,"first_air_date":"2013-09-24","backdrop_path":"/iWopHyAvuIDjGX10Yc3nn6UEebW.jpg","original_language":"en","id":1403,"vote_average":6.8,"overview":"Agent Phil Coulson of S.H.I.E.L.D. (Strategic Homeland Intervention, Enforcement and Logistics Division) puts together a team of agents to investigate the new, the strange and the unknown around the globe, protecting the ordinary from the extraordinary.","poster_path":"/cXiETfFK1BTLest5fhTLfDLRdL6.jpg"},{"original_name":"The Simpsons","genre_ids":[16,35],"name":"The Simpsons","popularity":144.345,"origin_country":["US"],"vote_count":2059,"first_air_date":"1989-12-17","backdrop_path":"/1pP0gg0iNGX06wSs19EQOvzfZIF.jpg","original_language":"en","id":456,"vote_average":7.1,"overview":"Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.","poster_path":"/yTZQkSsxUFJZJe67IenRM0AEklc.jpg"},{"original_name":"Fear the Walking Dead","genre_ids":[18,27],"name":"Fear the Walking Dead","popularity":142.714,"origin_country":["US"],"vote_count":966,"first_air_date":"2015-08-23","backdrop_path":"/7r4FieFH6Eh6S55hi8c9LOiFENg.jpg","original_language":"en","id":62286,"vote_average":6.3,"overview":"What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.","poster_path":"/aOdTWn8dXlS0tA5xl0ZBr8Ws15R.jpg"},{"original_name":"ありふれた職業で世界最強","genre_ids":[16,10759,10765],"name":"Arifureta: From Commonplace to World's Strongest","popularity":142.405,"origin_country":["JP"],"vote_count":8,"first_air_date":"2019-07-08","backdrop_path":"/1lL1ts7dzTUp0eOTHvMqfw6zFJn.jpg","original_language":"ja","id":86034,"vote_average":5.3,"overview":"Seventeen-year-old Hajime Nagumo is your average, everyday otaku. However, his simple life of pulling all-nighters and sleeping in school is suddenly turned upside down when he, along with the rest of his class, is summoned to a fantasy world! They're treated like heroes and tasked with the duty of saving the human race from utter extinction. But what should have been any otaku's wet dream quickly turns into Hajime's nightmare. While the rest of his class are blessed with godlike powers, Hajime's job, Synergist, only has a single transmutation skill. Ridiculed and bullied by his classmates for being weak, he soon finds himself in despair. Will he be able to survive in this dangerous world of monsters and demons with only a glorified blacksmith's level of strength?","poster_path":"/cmMh8awgtRvLUKmYvIXtVCYINIv.jpg"},{"original_name":"ナルト 疾風伝","genre_ids":[16,35,18],"name":"Naruto Shippūden","popularity":141.174,"origin_country":["JP"],"vote_count":234,"first_air_date":"2007-02-15","backdrop_path":"/c14vjmndzL9tBdooGsMznMFrFLo.jpg","original_language":"ja","id":31910,"vote_average":7.5,"overview":"Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.","poster_path":"/zAYRe2bJxpWTVrwwmBc00VFkAf4.jpg"},{"original_name":"Gotham","genre_ids":[80,18,14],"name":"Gotham","popularity":137.933,"origin_country":["US"],"vote_count":1124,"first_air_date":"2014-09-22","backdrop_path":"/mKBP1OCgCG0jw8DwVYlnYqVILtc.jpg","original_language":"en","id":60708,"vote_average":6.8,"overview":"Before there was Batman, there was GOTHAM. \n\nEveryone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them \u2013 the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker? ","poster_path":"/4XddcRDtnNjYmLRMYpbrhFxsbuq.jpg"},{"original_name":"ドクターストーン","genre_ids":[16,10759],"name":"Dr. Stone","popularity":131.256,"origin_country":["JP"],"vote_count":12,"first_air_date":"2019-07-05","backdrop_path":"/1Ep6YHL5QcrNC1JN6RYalWRPopi.jpg","original_language":"ja","id":86031,"vote_average":6.8,"overview":"The science-fiction adventure follows two boys struggle to revive humanity after a mysterious crisis has left everyone in the world turned to stone for several millennia.","poster_path":"/dLlnzbDCblBXcJqFLXyvN43NIwp.jpg"}]
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
         * original_name : See No Evil: The Moors Murders
         * genre_ids : [18]
         * name : See No Evil: The Moors Murders
         * popularity : 481.27
         * origin_country : ["GB"]
         * vote_count : 13
         * first_air_date : 2006-05-14
         * backdrop_path : /7AKhSfJHnVi0zXQS4eJirHDs22p.jpg
         * original_language : en
         * id : 11634
         * vote_average : 4.5
         * overview : The dramatisation of one of the most notorious killing sprees in British history.
         * poster_path : /b71BaRjp9TwxUZodLGgSRIlkfL8.jpg
         */

        @SerializedName("original_name")
        private String originalName;
        @SerializedName("name")
        private String name;
        @SerializedName("popularity")
        private double popularity;
        @SerializedName("vote_count")
        private int voteCount;
        @SerializedName("first_air_date")
        private String firstAirDate;
        @SerializedName("backdrop_path")
        private String backdropPath;
        @SerializedName("original_language")
        private String originalLanguage;
        @SerializedName("id")
        private int id;
        @SerializedName("vote_average")
        private double voteAverage;
        @SerializedName("overview")
        private String overview;
        @SerializedName("poster_path")
        private String posterPath;
        @SerializedName("genre_ids")
        private List<Integer> genreIds;
        @SerializedName("origin_country")
        private List<String> originCountry;

        public String getOriginalName() {
            return originalName;
        }

        public void setOriginalName(String originalName) {
            this.originalName = originalName;
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

        public String getFirstAirDate() {
            return firstAirDate;
        }

        public void setFirstAirDate(String firstAirDate) {
            this.firstAirDate = firstAirDate;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        public String getOriginalLanguage() {
            return originalLanguage;
        }

        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
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

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getPosterPath() {
            return posterPath;
        }

        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }

        public List<Integer> getGenreIds() {
            return genreIds;
        }

        public void setGenreIds(List<Integer> genreIds) {
            this.genreIds = genreIds;
        }

        public List<String> getOriginCountry() {
            return originCountry;
        }

        public void setOriginCountry(List<String> originCountry) {
            this.originCountry = originCountry;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(originalName);
            dest.writeString(name);
            dest.writeDouble(popularity);
            dest.writeInt(voteCount);
            dest.writeString(firstAirDate);
            dest.writeString(backdropPath);
            dest.writeString(originalLanguage);
            dest.writeInt(id);
            dest.writeDouble(voteAverage);
            dest.writeString(overview);
            dest.writeString(posterPath);
            dest.writeStringList(originCountry);
        }

        protected Results(Parcel in) {
            originalName = in.readString();
            name = in.readString();
            popularity = in.readDouble();
            voteCount = in.readInt();
            firstAirDate = in.readString();
            backdropPath = in.readString();
            originalLanguage = in.readString();
            id = in.readInt();
            voteAverage = in.readDouble();
            overview = in.readString();
            posterPath = in.readString();
            originCountry = in.createStringArrayList();
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
