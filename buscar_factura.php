<?php

include 'conexion_examen.php';

$pdo = new Conexion();

if ($_SERVER['REQUEST_METHOD'] == 'GET') {
   
        if (isset($_GET['id_factura'])) {
        $sql = $pdo->prepare("SELECT * FROM venta_productos WHERE id_factura=:fact");
        $sql->bindValue(':fact', $_GET['id_factura']);
        $sql->execute();
        $sql->setFetchMode(PDO::FETCH_ASSOC);	
        header("HTTP/1.1 200 OK");
        echo json_encode($sql->fetchAll());
        exit;
    } else {
        $sql = $pdo->prepare("SELECT * FROM venta_productos");
        $sql->execute();
        $sql->setFetchMode(PDO::FETCH_ASSOC);
        header("HTTP/1.1 200 OK");
        echo json_encode($sql->fetchAll());
        exit;
    }
} else {
    header("HTTP/1.1 400 Bad Request");
}
?>