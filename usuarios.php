<?php

include 'conexion_examen.php';		

$pdo=new Conexion();

if($_SERVER['REQUEST_METHOD']=='GET')
{

		$sql=$pdo->prepare("SELECT * FROM usuarios WHERE usuario=:usu and clave=:clave");
		$sql->bindValue(':usu',$_GET['usuario']);	
		$sql->bindValue(':clave',$_GET['clave']);	
		$sql->execute();
		$sql->setFetchMode(PDO::FETCH_ASSOC);
		header ("http/1.1 200 OK");
		echo json_encode($sql->fetchAll());
		exit;
	
header("HTTP/1.1 400 Bad REQUEST_METHOD");
}
?>