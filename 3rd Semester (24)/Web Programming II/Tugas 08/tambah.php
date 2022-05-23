<?php
require 'functions.php';
if (isset($_POST["submit"])) {
	
	//cek apakah data berhasil ditambahkan
	if (tambah($_POST)) {
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
</head>
<body>
	<form action="" method="POST">
		<table align="center" border="1">
			<tr>
				<td colspan="3">Tambah Data Mahasiswa</td>
			</tr>
			<tr>
				<td>ID Mahasiswa</td>
				<td>:</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Nama</td>
				<td>:</td>
				<td><input type="text" name="nama"></td>
			</tr>
			<tr>
				<td>Alamat</td>
				<td>:</td>
				<td><textarea name="alamat" cols="20" rows="4"></textarea></td>
			</tr>
			<tr>
				<td>Jenis Kelamin</td>
				<td>:</td>
				<td>
					<input type="radio" name="jk" value="Pria">Pria
					<input type="radio" name="jk" value="Wanita">Wanita
				</td>
			</tr>
			<tr>
				<td>Tanggal Lahir</td>
				<td>:</td>
				<td>
					<select name="tgl">
						<?php
						for ($i=1; $i <=31 ; $i++) { 
							echo "<option value='$i'>$i</option>";
						}
						?>
					</select>
					<select name="bln">
						<?php
						for ($i=1; $i <=12 ; $i++) { 
							echo "<option value='$i'>$i</option>";
						}
						?>
					</select>
					<input type="text" name="thn" size="4">
				</td>
			</tr>
			<tr>
				<td>Jurusan</td>
				<td>:</td>
				<td>
					<select name="jurusan">
						<option value="Teknik Informatika">Teknik Informatika</option>
						<option value="Sistem Informasi">Sistem Informasi</option>
						<option value="Sistem Komputer">Sistem Komputer</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Minat</td>
				<td>:</td>
				<td>
					<input type="checkbox" name="minat[]" value="Programming">Programming<br>
					<input type="checkbox" name="minat[]" value="Desain">Desain<br>
					<input type="checkbox" name="minat[]" value="OlahRaga">OlahRaga<br>
				</td>
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