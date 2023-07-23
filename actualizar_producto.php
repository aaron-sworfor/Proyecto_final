<?php
include 'conexion_examen.php';

$pdo = new Conexion();
 
if ($_SERVER['REQUEST_METHOD'] == 'PUT') {
    $sql="UPDATE Productos_inventario SET nombre=:nom, marca=:mar, descripcion=:can, precio=:pre WHERE  id=:id";
	$stmt=$pdo->prepare($sql);	
	$stmt->bindValue(':id',$_GET['id']);
	$stmt->bindValue(':nom',$_GET['nombre']);
	$stmt->bindValue(':mar',$_GET['marca']);
	$stmt->bindValue(':can',$_GET['descripcion']);
	$stmt->bindValue(':pre',$_GET['precio']);
	$stmt->execute();
	exit;

}else{

header("HTTP/1.1 400 Bad Request");
}

?>