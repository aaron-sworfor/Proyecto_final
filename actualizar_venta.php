<?php

include 'conexion_examen.php';

$pdo=new Conexion();

if($_SERVER['REQUEST_METHOD']=='PUT')
{
	$sql="UPDATE  venta_productos SET id_producto=:idpro, fecha_venta=:fec, cantidad_productos=:can, precio=:prec, nombre_producto= :nomb WHERE id_venta=:idv";
	$stmt=$pdo->prepare($sql);	
	$stmt->bindValue(':idv',$_GET['id_venta']);
	$stmt->bindValue(':idpro',$_GET['id_producto']);
	$stmt->bindValue(':fec',$_GET['fecha_venta']);
	$stmt->bindValue(':can',$_GET['cantidad_productos']);
	$stmt->bindValue(':prec',$_GET['precio']);	
	$stmt->bindValue(':nomb',$_GET['nombre_producto']);	
	$stmt->execute();
	header ("http/1.1 200 OK");
	exit;
} else {
	header("HTTP/1.1 400 Bad REQUEST_METHOD");
}
?>