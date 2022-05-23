<?php
require 'functions.php';
//ambil id
$id_book=$_GET['id_book'];

//ambil data di query
$buku=query("SELECT * FROM tb_book WHERE id_book=$id_book")[0];
//var_dump($mahasiswa);

//memecah kategori
$category=explode(',',$buku['category']);

if (isset($_POST["submit"])) {
	
	//cek apakah data berhasil diedit
	if (edit($_POST)) {
		echo "<script> alert('Data Berhasil Di edit');
		location.href='index.php';</script>";
	}
	else{
		echo "<script> alert('Data Gagal Diedit');
		location.href='index.php';</script>";
	}
}

?>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Tambah Data</title>
	<link href="https://fonts.googleapis.com/css2?family=Noto+Sans&display=swap" rel="stylesheet">
	<style>
		body {
			font-family: 'Noto Sans', sans-serif;
		}
	</style>
</head>
<body>
	<form action="" method="POST">
		<table align="center" border="1" cellpadding="5" cellspacing="0">
			<tr>
				<th colspan="3">Tambah Data Mahasiswa</th>
			</tr>
			<tr>
				<td>ID Buku</td>
				<td>:</td>
				<td><input type="text" name="id_book" value="<?= $buku['id_book'] ?>"></td>
			</tr>
			<tr>
				<td>Judul Buku</td>
				<td>:</td>
				<td><input type="text" name="title_book" value="<?= $buku['title_book'] ?>"></td>
			</tr>
			<tr>
				<td>Penulis</td>
				<td>:</td>
				<td><input type="text" name="writer" value="<?= $buku['writer'] ?>"></td>
			</tr>
			<tr>
			<tr>
				<td>Penerbit</td>
				<td>:</td>
				<td>
					<select name="publisher">
						<option value="Erlangga" <?php if($buku['publisher']=="Erlangga"){echo "selected=selected";} ?>>Erlangga</option>
						<option value="Coursera" <?php if($buku['publisher']=="Coursera"){echo "selected=selected";} ?>>Coursera</option>
						<option value="Stepic" <?php if($buku['publisher']=="Stepic"){echo "selected=selected";} ?>>Stepic</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Kategori</td>
				<td>:</td>
				<td>
					<input type="checkbox" name="category[]" value="Buku Programming" <?php if(in_array("Buku Programming",$category)){echo "checked=checked";} ?>>Buku Programming<br>
					<input type="checkbox" name="category[]" value="Buku Komputer" <?php if(in_array("Buku Komputer",$category)){echo "checked=checked";} ?>>Buku Komputer<br>
					<input type="checkbox" name="category[]" value="Buku Agama" <?php if(in_array("Buku Agama",$category)){echo "checked=checked";} ?>>Buku Agama<br>
				</td>
			</tr>
			<tr>
			<td>Resensi</td>
				<td>:</td>
				<td><textarea name="review" cols="20" rows="4"<?= $buku['review'] ?>></textarea></td>
			</tr>
			<tr>
				<td colspan="3">
					<button name="submit">Kirim</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>