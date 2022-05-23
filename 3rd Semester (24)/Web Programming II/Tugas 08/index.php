<?php
require 'functions.php';
$mahasiswa=query("SELECT * FROM tb_mahasiswa");

if(isset($_POST['submit'])){
	$mahasiswa=cari($_POST['cari']);
}

?>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Daftar Mahasiswa</title>
</head>
<body>
	<h3>Daftar Mahasiswa</h3>
	<p><a href="tambah.php">Tambah Data Mahasiswa</a></p>
	<form action="" method="POST">
		<input type="text" name="cari" placeholder="Masukkan Kata Kunci" autofocus>
		<button name="submit">Cari</button>
	</form>
	<p></p>
	<table border="1" width="800">
		<tr>
			<th>No</th>
			<th>Nama</th>
			<th>Alamat</th>
			<th>Jenis Kelamin</th>
			<th>Tanggal Lahir</th>
			<th>Jurusan</th>
			<th>Minat</th>
			<th>Keterangan</th>
		</tr>
		<?php $i = 1; ?>
		<?php foreach ($mahasiswa as $mhs) { ?>
		<tr>
			<td><?= $i ?></td>
			<td><?= $mhs["nama"]?></td>
			<td><?= $mhs["alamat"]?></td>
			<td><?= $mhs["gender"]?></td>
			<td><?= $mhs["tgl_lahir"]?></td>
			<td><?= $mhs["jurusan"]?></td>
			<td><?= $mhs["minat"]?></td>
			<td><a href="hapus.php?id=<?= $mhs['id']?>">HAPUS </a>| <a href="edit.php?id=<?= $mhs['id'] ?>">EDIT</a></td>
		</tr>
		<?php $i++ ?>
		<?php } ?>
	</table>
</body>
</html>

