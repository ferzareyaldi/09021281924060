<?php
require 'functions.php';
$id_book=$_GET['id_book'];
//cek apakah data berhasil dihapus atau tidak
if (delete($id_book)>0) {
	echo "<script> alert('Data Berhasil Dihapus');
	location.href='index.php';</script>";
}
else{
	echo "<script> alert('Data Gagal Dihapus');
	windows.history.go(-1);</script>";
}
