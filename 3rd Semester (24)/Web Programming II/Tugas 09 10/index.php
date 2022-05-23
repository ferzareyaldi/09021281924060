<?php
require 'functions.php';
$book=query("SELECT * FROM tb_book");

if(isset($_POST['submit'])){
	$book=cari($_POST['cari']);
}

?>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="https://fonts.googleapis.com/css2?family=Noto+Sans&display=swap" rel="stylesheet">
	<title>Daftar Buku</title>
	<style>
		a {
  			padding: 5px 5px;
 			text-align: center;
  			text-decoration: none;
  			display: inline-block;
			color: DarkSLateGray;
		}
		a:hover {
			border: 2px solid black;
			background-color: yellow;
			color: black;
			transition: 0.7s;
		}
		#style-th{
			background-color: yellow;
		}
		body {
			font-family: 'Noto Sans', sans-serif;
		}
		#btn-cari{
			font-family: 'Noto Sans', sans-serif;
			background-color: yellow;
  			border: none;
  			color: black;
  			text-align: center;
  			text-decoration: none;
  			display: inline-block;
  			margin: 4px 2px;
  			cursor: pointer;
		}
	</style>
</head>
<body>
	<h3>Daftar Buku</h3>
	<p><a href="insert.php">Tambah Buku</a></p>
	<form action="" method="POST">
		<input type="text" name="cari" placeholder="Masukkan Kata Kunci" autofocus>
		<button id="btn-cari" name="submit">Cari</button>
	</form>
	<p></p>
	<table border="1" width="1000" cellpadding="5" cellspacing="0">
		<tr id="style-th">
			<th>No</th>
			<th>Judul Buku</th>
			<th width="100">Penulis</th>
			<th>Penerbit</th>
			<th>Kategori</th>
			<th>Resensi</th>
			<th width="180" >Keterangan</th>
		</tr>
		<?php $i = 1; ?>
		<?php foreach ($book as $buku) { ?>
		<tr>
			<td style="text-align:center"><?= $i ?></td>
			<td><?= $buku["title_book"]?></td>
			<td><?= $buku["writer"]?></td>
			<td><?= $buku["publisher"]?></td>
			<td><?= $buku["category"]?></td>
			<td><?= $buku["review"]?></td>
			<td style="text-align: center"><a href="delete.php?id_book=<?= $buku['id_book']?>">HAPUS </a> | <a href="edit.php?id_book=<?= $buku['id_book'] ?>">EDIT</a></td>
		</tr>
		<?php $i++ ?>
		<?php } ?>
	</table>
</body>
</html>

