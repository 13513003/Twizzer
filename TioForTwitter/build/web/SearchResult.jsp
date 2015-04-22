<%@page import="StringMatching.TwitSearch"%>
<%@page import="StringMatching.GetTweet"%>
<%@page import="StringMatching.BM"%>
<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
<%@ page import="java.io.*,java.util.*,twitter4j.*,twitter4j.conf.ConfigurationBuilder" %>
<html>
<head>
<title>Search Result</title>
</head>
<body>
<left>
<h2>Search Result : </h2>
</left> 
<% 
        String search = request.getParameter("keyword") ;
        ArrayList<String> categories = new ArrayList<String>();
        ArrayList<String> keywords = new ArrayList<String>();
        int l =0;
        String tempCategories = new String();
        String tempKeywords = new String();
        do{
            tempCategories = request.getParameter("K"+l);
            tempKeywords = request.getParameter("ValK"+l);
            if(tempCategories != null && tempKeywords != null){
                categories.add(tempCategories);
                keywords.add(tempKeywords);
                l++;
            }
        }while(tempCategories != null && tempKeywords != null);

        int k = 0;
        GetTweet G = new GetTweet();
        G.Run(search);
        TwitSearch TS = new TwitSearch();
        ArrayList<String> ListTemp = new ArrayList<String>();
        ListTemp = TS.init();
        TS.SetTweet(ListTemp);
        for(String keyword: keywords){
            String[] words = keyword.split(",");
            if(request.getParameter("mode").equalsIgnoreCase("kmp"))
                TS.RunKMP(keyword,TS.GetTweet()); 
            else if(request.getParameter("mode").equalsIgnoreCase("bm"))
                TS.RunBM(keyword,TS.GetTweet());
            int j = 0;
            for (ArrayList<String> s : TS.GetResult()){
                int i =0;
                String word = words[j];
                for (String result : s) {
                    String temp = result.toLowerCase();
                    int offset = temp.indexOf(word.toLowerCase());
                    if(offset >= 0 && i != 0){
                        String temp1 = result.substring(offset,offset+word.length());
                        String highlight = "<span style=\"font-weight:bold; color:blue; \">"+temp1+"</span>";
                        String temp2 = result.replaceFirst(temp1, highlight);
                        out.println(temp2);  
                    }
                    else{
                        String temp2 = new String();
                        if(result.contains("Kategori")){
                            temp2 = "Kategori "+categories.get(k)+" - "+result.substring(9,result.length());
                            out.println(temp2);
                        }
                        else
                            out.println(result);
                    }
                    out.println("<br>");
                    i++;  
                }
                out.println("<br>");
                j++;
            }
            k++;
        }
        TS.GetTweet().add(0,"Kategori UNKNOWN");
        TS.GetTweet().add(1,"Jumlah : "+(TS.GetTweet().size()-1));
        TS.GetTweet().add(2,"Daftar Tweets :");
        for(String result : TS.GetTweet()){
            out.println(result);
            out.println("<br>");
        }
%>
</body>
</html>
