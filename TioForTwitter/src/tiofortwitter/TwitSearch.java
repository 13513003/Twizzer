package StringMatching;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TwitSearch {

    public void init(ArrayList<String> ListTweet){
        String line;
        String delims = "[}{]+";
        String[] tokens;
        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            line = br.readLine();
            tokens = line.split(delims);

            do {
                tokens = line.split(delims);
                for (int j = 0; j < tokens.length; j++) {
                    if (!tokens[j].equals("")) {
                        ListTweet.add(tokens[j]);
                    }
                }
            } while ((line = br.readLine()) != null);
        }
        catch (IOException e)
        {
            System.out.println("File I/O error!");
        }
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
            for(String line : ListResult.get(i)){
                System.out.println(line);
            }
            i++;
        }
    }
    public void TwitterCategorySearchKMP(ArrayList<String> ListTweet,ArrayList<ArrayList<String>> ListResult, String[] keywords){
        int i =0;
        for(String keyword : keywords){
            String text = keyword.toLowerCase();
            ListResult.add(new ArrayList<String>());
            TwitSearchKMP(ListTweet, ListResult.get(i), text);
            for(String line : ListResult.get(i)){
                System.out.println(line);
            }
            i++;
        }
    }

    public static void Run(){
        String input = "Real,binatang,berCOding,madrid";
        String delims = "[,]+";
        String[] text;
        text = input.toLowerCase().split(delims);
        TwitSearch TS = new TwitSearch();
        ArrayList<String> ListTweet = new ArrayList<String>();
        TS.init(ListTweet);
        ArrayList<ArrayList<String>> ListResult = new ArrayList<ArrayList<String>>();
        TS.TwitterCategorySearchBM(ListTweet,ListResult,text);

        System.out.println("");
        ListTweet.add(0,"Kategori UNKNOWN");
        ListTweet.add(1,"Jumlah : "+(ListTweet.size()-1));
        ListTweet.add(2,"Daftar Tweets :");
        for(String line : ListTweet){
            System.out.println(line);
        }
    }
}
