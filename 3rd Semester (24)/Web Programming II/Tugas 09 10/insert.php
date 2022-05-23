<?php
require 'functions.php';
if (isset($_POST["submit"])) {
	
	//cek apakah data berhasil ditambahkan
	if (insert($_POST)) {
		echo "<script> alert('Data Berhasil Ditambahkan');
		location.href='index.php';</script>";
	}
	else{
		echo "<script> alert('Data Gagal Ditambahkan');
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
				<th colspan="3">Tambah Data Buku</th>
			</tr>
			<tr>
				<td>ID Buku</td>
				<td>:</td>
				<td><input type="text" name="id_book"></td>
			</tr>
			<tr>
				<td>Judul Buku</td>
				<td>:</td>
				<td><input type="text" name="title_book"></td>
			</tr>
			<tr>
				<td>Penulis</td>
				<td>:</td>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
			<tr>
				<td>Penerbit</td>
				<td>:</td>
				<td>
					<select name="publisher">
						<option value="Erlangga">Erlangga</option>
						<option value="Coursera">Coursera</option>
						<option value="Stepic">Stepic</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Kategori</td>
				<td>:</td>
				<td>
					<input type="checkbox" name="category[]" value="Buku Programming">Buku Programming<br>
					<input type="checkbox" name="category[]" value="Buku Komputer">Buku Komputer<br>
					<input type="checkbox" name="category[]" value="Buku Agama">Buku Agama<br>
				</td>
			</tr>
			<tr>
			<td>Resensi</td>
				<td>:</td>
				<td><textarea name="review" cols="20" rows="4"></textarea></td>
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