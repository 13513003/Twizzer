package StringMatching;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import twitter4j.JSONException;

public class TwitSearch {
    private static ArrayList<String> ListTweet;
    private static ArrayList<ArrayList<String>> ListResult;
    public ArrayList<String> init(){
        ArrayList<String> List = new ArrayList<String>();
        String line;
        String delims = "[}{]+";
        String[] tokens;
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\bin\\input.txt"))) {
            line = br.readLine();
            if(line != null){
            tokens = line.split(delims);
            do {
                tokens = line.split(delims);
                for (int j = 0; j < tokens.length; j++) {
                    if (!tokens[j].equals("")) {
                        List.add(tokens[j]);
                    }
                }
            } while ((line = br.readLine()) != null);
        }
            
        }
        
        catch (IOException e)
        {
            //System.out.println("File I/O error!");
        }
        return List;
    }
   public void TwitSearchBM(ArrayList<String> ListTweet, ArrayList<String> ListSearch, String searchpattern){
       ListSearch.add("Kategori " + searchpattern);
       for(int j=0;j<ListTweet.size();j++){
           String tweettemp = new String(ListTweet.get(j).toLowerCase());
           KMP kmp = new KMP(searchpattern);
           int offset = kmp.search(tweettemp);
           if(offset != ListTweet.get(j).length()){
               ListSearch.add(ListTweet.get(j));
               ListTweet.remove(ListTweet.get(j));
           }
       }
       ListSearch.add(1,"Jumlah : " + (ListSearch.size()-1) );
       ListSearch.add(2,"Daftar Tweets : ");
   }
    public void TwitSearchKMP(ArrayList<String> ListTweet, ArrayList<String> ListSearch, String searchpattern){
        ListSearch.add("Kategori " + searchpattern);
        for(int j=0;j<ListTweet.size();j++){
            String tweettemp = new String(ListTweet.get(j).toLowerCase());
            KMP kmp = new KMP(searchpattern);
            int offset = kmp.search(tweettemp);
            if(offset != ListTweet.get(j).length()){
                ListSearch.add(ListTweet.get(j));
                ListTweet.remove(ListTweet.get(j));
            }
        }
        ListSearch.add(1,"Jumlah : " + (ListSearch.size()-1) );
        ListSearch.add(2,"Daftar Tweets : ");
    }
    public void TwitterCategorySearchBM(ArrayList<String> ListTweet,ArrayList<ArrayList<String>> ListResult, String[] keywords){
        int i =0;
        for(String keyword : keywords){
            String text = keyword.toLowerCase();
            ListResult.add(new ArrayList<String>());
            TwitSearchBM(ListTweet, ListResult.get(i), text);
            i++;
        }
    }
    public void TwitterCategorySearchKMP(ArrayList<String> ListTweet,ArrayList<ArrayList<String>> ListResult, String[] keywords){
        int i =0;
        for(String keyword : keywords){
            String text = keyword.toLowerCase();
            ListResult.add(new ArrayList<String>());
            TwitSearchKMP(ListTweet, ListResult.get(i), text);
            i++;
        }
    }

    public ArrayList<ArrayList<String>> GetResult(){
        return ListResult;
    }
    public ArrayList<String> GetTweet(){
        return ListTweet;
    }
    public void SetTweet(ArrayList<String> x){
        ListTweet = new ArrayList<String>(x);
    }
    public void RunBM(String search,ArrayList<String> ListTweet){
        String delims = "[,]+";
        String[] text;
        text = search.toLowerCase().split(delims);
        TwitSearch TS = new TwitSearch();
        ListResult = new ArrayList<ArrayList<String>>();
        TS.TwitterCategorySearchBM(ListTweet, ListResult, text);
    }
    
    public void RunKMP(String search,ArrayList<String> ListTweet){
        String delims = "[,]+";
        String[] text;
        text = search.toLowerCase().split(delims);
        TwitSearch TS = new TwitSearch();
        ListResult = new ArrayList<ArrayList<String>>();
        TS.TwitterCategorySearchKMP(ListTweet, ListResult, text);
    }
    
}
