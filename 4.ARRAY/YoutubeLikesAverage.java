public class YoutubeLikesAverage {
    static void main() {

        int[] videoViews = {1234, 2343, 6423, 2451, 67452};
        int[] videoLikes = {323, 656, 234, 856, 123};
        int[] videoComments = {122, 63, 223, 664, 23};

        //total video's of last five video
        int totalViews = 0;
        for(int i=0; i<videoViews.length; i++){
            totalViews += videoViews[i];
        }
        System.out.println("Last five video views : "+ totalViews);

        //average like of last five video
        int totalLikes = 0;
        for(int i=0; i<videoLikes.length; i++){
            totalLikes += videoLikes[i];
        }
        System.out.println("Average of last five video likes : "+ totalLikes/videoLikes.length);

        //most commented video
        int video = 0;
        int comment = videoComments[0];
        for(int i=0; i<videoComments.length; i++){
            if(comment<videoComments[i]){
                comment = videoComments[i];
                video = i;
            }
        }
        System.out.println("Most commented views : "+(video+1)+" ( count - "+ comment +" )");
    }
}
