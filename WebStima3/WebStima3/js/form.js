  $n_query=2;
  function addNQuery() {
    if ($n_query<5)
      $n_query++;
    cetak();
  }
  
  function removeNQuery() {
    if ($n_query>2)
      $n_query--;
    cetak();
  }
  

  
  function cetak() {
    var s="";
    
    for (i = 0; i < $n_query; i++) {
      var stringInt = i.toString();
      
      s+= '<input type="text" id = "K'+stringInt+'" name="K'+stringInt+'" placeholder="Kategori '+(i+1)+'"> :&nbsp; <input type="text" name="ValK'+stringInt+'" placeholder="Keyword '+(i+1)+'"><br>'; //Create textboxes as HTML
    }
    document.getElementById("kategori").innerHTML = s;
  }
  
  function GantiTopikTemplateSport(){
    $n_query = 2;
    cetak();
    document.getElementById('HeaderTemplate').innerHTML ="Sport"
    document.getElementById('K0').value="Sepak Bola"
    document.getElementById('K1').value="Basket"
    
  }

  function GantiTopikTemplateOtomotif(){
    $n_query = 2;
    cetak();
    document.getElementById('HeaderTemplate').innerHTML ="Otomotif"
    document.getElementById('K0').value="Mobil"
    document.getElementById('K1').value="Motor"
    
  }

  function GantiTopikTemplatePolitikHukum(){
    $n_query = 2;
    cetak();
    document.getElementById('HeaderTemplate').innerHTML ="Politik dan Hukum"
    document.getElementById('K0').value="Pemerintahan"
    document.getElementById('K1').value="Kejahatan"
    
  }

  function GantiTopikTemplateEntertainment(){
    $n_query = 3;
    cetak();
    document.getElementById('HeaderTemplate').innerHTML ="Entertainment"
    document.getElementById('K0').value="Game"
    document.getElementById('K1').value="Musik"
    document.getElementById('K2').value="Film"
  }



  function FreeTopic(){
    $n_query = 2;
    cetak();
    document.getElementById('HeaderTemplate').innerHTML ="Free Topic"
    
  }