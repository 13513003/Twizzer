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

$n_query=2;

function cetak() {
	var s="";
					
	for (i=0;i<$n_query;i++) {
		var stringInt = i.toString();
								
		s+= '<input type="text" name="K'+stringInt+'" placeholder="Kategori '+(i+1)+'"> :&nbsp; <input type="text" name="ValK'+stringInt+'" placeholder="Keyword '+(i+1)+'"><br>'; //Create textboxes as HTML
	}
	document.getElementById("kategori").innerHTML = s;
}
cetak();