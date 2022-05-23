<?php 
//koneksi ke database
$koneksi = mysqli_connect("localhost","root","","dblibrary") or die("Koneksi ke db Gagal");

function query($query){
	global $koneksi;
	$hasil=mysqli_query($koneksi,$query);
	$rows=[];
	while($row = mysqli_fetch_assoc($hasil)){
		$rows[] = $row;
	}
	return $rows;
}

function insert($data){
	global $koneksi;
	//ambil data dari form
	$id_book=htmlspecialchars($data["id_book"]);
	$title_book=htmlspecialchars($data["title_book"]);
	$writer=htmlspecialchars($data["writer"]);
	$publisher=htmlspecialchars($data["publisher"]);
	$category_array=$data["category"];
	//pengabungan kategory
	$category=implode(",", $category_array);

	$review=htmlspecialchars($data["review"]);

	//perintah sql untuk insert data
	$insert="INSERT INTO tb_book (id_book,title_book,writer,publisher,category,review) VALUES ('$id_book','$title_book','$writer','$publisher','$category','$review')";
	$sql=mysqli_query($koneksi,$insert);
	return mysqli_affected_rows($koneksi);

}
function hapus($id_book){
	global $koneksi;
	mysqli_query($koneksi,"DELETE FROM tb_book where id_book=$id_book");
	return mysqli_affected_rows($koneksi);
}

function edit($data){
global $koneksi;
	//ambil data dari form
	$id_book=htmlspecialchars($data["id_book"]);
	$title_book=htmlspecialchars($data["title_book"]);
	$writer=htmlspecialchars($data["writer"]);
	$publisher=htmlspecialchars($data["publisher"]);
	$category_array=$data["category"];
	//pengabungan kategory
	$category=implode(",", $category_array);

	$review=htmlspecialchars($data["review"]);

	//perintah sql untuk insert data
	$update="UPDATE tb_book SET id_book='$id_book',title_book='$title_book',writer='$writer',publisher='$publisher',category='$category',review='$review' WHERE id_book='$id_book'";
	$sql=mysqli_query($koneksi,$update);
	return mysqli_affected_rows($koneksi);

}

function cari($cari){
	$query="SELECT * FROM tb_book WHERE title_book like '%$cari%'";
	return query($query);
}

?>