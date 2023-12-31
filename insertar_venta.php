<?php

include 'conexion_examen.php';

$pdo=new Conexion();

if($_SERVER['REQUEST_METHOD']=='POST')
{
	$sql="INSERT INTO venta_productos (id_venta, id_producto, fecha_venta, cantidad_productos, precio, nombre_producto, id_factura) VALUES (:idv,:idpro, :fec, :can, :prec, :nomb, :fact)";
	$stmt=$pdo->prepare($sql);	
	$stmt->bindValue(':idv',$_POST['id_venta']);
	$stmt->bindValue(':idpro',$_POST['id_producto']);
	$stmt->bindValue(':fec',$_POST['fecha_venta']);
	$stmt->bindValue(':can',$_POST['cantidad_productos']);
	$stmt->bindValue(':prec',$_POST['precio']);	
	$stmt->bindValue(':nomb',$_POST['nombre_producto']);
	$stmt->bindValue(':fact',$_POST['id_factura']);
	$stmt->execute();
	$idPost=$pdo->lastInsertId();
	
	
	if($idPost)
	{
		header ("http/1.1 200 OK");
		echo json_encode($idPost);
		exit;
	}
} else {
	header("HTTP/1.1 400 Bad REQUEST_METHOD");
}
?>