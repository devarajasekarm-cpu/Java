import java.util.Arrays;

public class WeeklyVideoDetails {

    //view function
    public int[] calculateViews(int[][] views){
        int viewCount = 0;
        int week = 0;
        //finding most viewed week
        for(int i=0; i<views.length; i++){
            int temp = 0;
            for(int j=0; j<views[i].length; j++){
                temp += views[i][j];
            }
            if(viewCount < temp){
                viewCount = temp;
                week = i;
            }
        }
        //most viewed video
        int temp = 0;
        for(int i=0; i<views[week].length; i++){
            if(temp <views[week][i]){
                temp = views[week][i];
            }
        }
        return new int[] {week+1, temp};
    }
    //like function
    public int calculateLikes(int[][] likes){
        int high = 0;
        for(int i=0; i<likes.length; i++){
            int temp = 0;
            for(int j=0; j<likes[i].length; j++){
                temp += likes[i][j];
            }
            if(high<temp){
                high = i;
            }
        }
        return high+1;
    }

    //comment function
    public int[] calculateComments(int[][] comments){
        int week = 0;
        int high = 0;
        for(int i=0; i< comments.length; i++){
            int temp = 0;
            for(int j=0; j<comments[i].length; j++){
                temp += comments[i][j];
            }
            if(high<temp){
                high = temp;
                week = i;
            }
        }
        int video = 0;
        int videoIndex = 0;
        for(int i=0; i<comments[week].length; i++){
            if(video < comments[week][i]){
                video = comments[week][i];
                videoIndex = i;
            }
        }
        return new int[] {week+1, videoIndex+1};
    }
    void main() {

        int[][] views = {{123,12324,43324,63242,324}, {4232,5232,53431,4322},{2342,2412,5646,8564,3443}};
        int[][] likes = {{243,654,123,876,553}, {342,543,243,567,865},{234,654,765,533,765}};
        int[][] comments = {{23,45,21,35,123}, {31,54,86,94,45}, {32,86,53,75,98}};
        System.out.println("Highest view of the week and video count :"+ Arrays.toString(calculateViews(views)));
        System.out.println("Highest average like of the week : "+ calculateLikes(likes));
        System.out.println("Highest Commented week and : video :"+ Arrays.toString(calculateComments(comments)));
    }

}
