<%-- 
    Document   : newjsp
    Created on : Apr 18, 2015, 7:45:33 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>

            <form id="searchForm" method="get" action="SearchResult.jsp" target="features">
            <fieldset>
                Topik : <input id="s" type="text" value="#Gaming" name="keyword" />
                    
                    <div style="position:relative;left:130px;">
                        <input type="text" name="K0" value="Fighting" /> : <input type="text" name="ValK0" value="mortal kombat" />
                    </div>
                    <div style="position:relative;left:130px;">
                        <input type="text" name="K1" value="RPG" /> : <input type="text" name="ValK1" value="witcher" />
                    </div>
                    <!-- radio button untuk mode KMP atau BoyerMoore -->
                    <div style="position:relative;display:inline">
                      <input type="radio" id="searchKMP" name="mode" value="KMP" checked /> 
                    </div> 
                    <div style="position:relative;display:inline">
                      <label for="searchKMP" id="siteNameLabel">KMP</label>
                    </div>
                      <input type="radio" id = "searchBM" name="mode" value="BM" /> <label for="searchBM">BoyerMoore</label>
                    </div>

                <input type="submit" value="Submit" id="submitButton" />
            </fieldset>
        </form>
</body>
</html>
