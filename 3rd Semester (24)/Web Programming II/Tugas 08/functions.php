<?php 
//koneksi ke database
$koneksi = mysqli_connect("localhost","root","","dbmahasiswa") or die("Koneksi ke db Gagal");

function query($query){
	global $koneksi;
	$hasil=mysqli_query($koneksi,$query);
	$rows=[];
	while($row = mysqli_fetch_assoc($hasil)){
		$rows[] = $row;
	}
	return $rows;
}

function tambah($data){
	global $koneksi;
	//ambil data dari form
	$id=htmlspecialchars($data["id"]);
	$nama=htmlspecialchars($data["nama"]);
	$alamat=htmlspecialchars($data["alamat"]);
	$jk=htmlspecialchars($data["jk"]);
	$tgl=htmlspecialchars($data["tgl"]);
	$bln=htmlspecialchars($data["bln"]);
	$thn=htmlspecialchars($data["thn"]);
	//pengabungan tgl_lahir sesuai format database thn-bln-tgl
	$tgl_lahir=$thn."-".$bln."-".$tgl;
	$jurusan=htmlspecialchars($data["jurusan"]);
	$minat_array=$data["minat"];
	//pengabungan minat
	$minat=implode(",", $minat_array);

	//perintah sql untuk tambah data
	$tambah="INSERT INTO tb_mahasiswa (id,nama,alamat,gender,tgl_lahir,jurusan,minat) VALUES ('$id','$nama','$alamat','$jk','$tgl_lahir','$jurusan','$minat')";
	$sql=mysqli_query($koneksi,$tambah);
	return mysqli_affected_rows($koneksi);

}
function hapus($id){
	global $koneksi;
	mysqli_query($koneksi,"DELETE FROM tb_mahasiswa where id=$id");
	return mysqli_affected_rows($koneksi);
}

function edit($data){
global $koneksi;
	//ambil data dari form
	$id=htmlspecialchars($data["id"]);
	$nama=htmlspecialchars($data["nama"]);
	$alamat=htmlspecialchars($data["alamat"]);
	$jk=htmlspecialchars($data["jk"]);
	$tgl=htmlspecialchars($data["tgl"]);
	$bln=htmlspecialchars($data["bln"]);
	$thn=htmlspecialchars($data["thn"]);
	//pengabungan tgl_lahir sesuai format database thn-bln-tgl
	$tgl_lahir=$thn."-".$bln."-".$tgl;
	$jurusan=htmlspecialchars($data["jurusan"]);
	$minat_array=$data["minat"];
	//pengabungan minat
	$minat=implode(",", $minat_array);

	//perintah sql untuk tambah data
	$update="UPDATE tb_mahasiswa SET id='$id',nama='$nama',alamat='$alamat',gender='$jk',tgl_lahir='$tgl_lahir',jurusan='$jurusan',minat='$minat' WHERE id='$id'";
	$sql=mysqli_query($koneksi,$update);
	return mysqli_affected_rows($koneksi);

}

function cari($cari){
	$query="SELECT * FROM tb_mahasiswa WHERE nama like '%$cari%'";
	return query($query);
}

?>