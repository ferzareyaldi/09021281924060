<?php
require 'functions.php';
//ambil id
$id=$_GET['id'];

//ambil data di query
$mhs=query("SELECT * FROM tb_mahasiswa WHERE id=$id")[0];
//var_dump($mahasiswa);
//memecah tanggal lahir
$tgl_lahir=explode('-', $mhs['tgl_lahir']);
//print_r($tgl_lahir);
//memecah minat
$minat=explode(',',$mhs['minat']);
//print_r($minat);

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
				<td><input type="text" name="id" value="<?= $mhs['id'] ?>"></td>
			</tr>
			<tr>
				<td>Nama</td>
				<td>:</td>
				<td><input type="text" name="nama" value="<?= $mhs['nama'] ?>"></td>
			</tr>
			<tr>
				<td>Alamat</td>
				<td>:</td>
				<td><textarea name="alamat" cols="20" rows="4"><?= $mhs['alamat'] ?></textarea></td>
			</tr>
			<tr>
				<td>Jenis Kelamin</td>
				<td>:</td>
				<td>
					<input type="radio" name="jk" value="Pria" <?php if($mhs['gender']=="Pria"){ echo "checked=checked";} ?>>Pria
					<input type="radio" name="jk" value="Wanita" <?php if($mhs['gender']=="Wanita"){ echo "checked=checked";} ?>>Wanita
				</td>
			</tr>
			<tr>
				<td>Tanggal Lahir</td>
				<td>:</td>
				<td>
					<select name="tgl">
						<?php
						for ($i=1; $i <=31 ; $i++) { ?>
							<option value=<?= $i ?> <?php if($tgl_lahir[2]==$i){echo "selected=selected";} ?>><?= $i?></option>
						<?php } ?>
					</select>
					<select name="bln">
						<?php
						for ($i=1; $i <=12 ; $i++) { ?>
							<option value=<?= $i ?> <?php if($tgl_lahir[1]==$i){echo "selected=selected";} ?>><?= $i?></option>
						<?php } ?>
					</select>
					<input type="text" name="thn" size="4" value="<?= $tgl_lahir[0] ?>">
				</td>
			</tr>
			<tr>
				<td>Jurusan</td>
				<td>:</td>
				<td>
					<select name="jurusan">
						<option value="Teknik Informatika" <?php if($mhs['jurusan']=="Teknik Informatika"){echo "selected=selected";} ?>>Teknik Informatika</option>
						<option value="Sistem Informasi" <?php if($mhs['jurusan']=="Sistem Informasi"){echo "selected=selected";} ?>>Sistem Informasi</option>
						<option value="Sistem Komputer" <?php if($mhs['jurusan']=="Sistem Komputer"){echo "selected=selected";} ?>>Sistem Komputer</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Minat</td>
				<td>:</td>
				<td>
					<input type="checkbox" name="minat[]" value="Programming" <?php if(in_array("Programming",$minat)){echo "checked=checked";} ?>>Programming<br>
					<input type="checkbox" name="minat[]" value="Desain" <?php if(in_array("Desain",$minat)){echo "checked=checked";} ?>>Desain<br>
					<input type="checkbox" name="minat[]" value="OlahRaga" <?php if(in_array("OlahRaga",$minat)){echo "checked=checked";} ?>>OlahRaga<br>
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