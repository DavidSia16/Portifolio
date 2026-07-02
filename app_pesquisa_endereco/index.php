<?php
    
    $dsn = 'mysql:host=localhost;dbname=php_com_pdo'
    $usuario = 'root';
    $senha = ''; 

    try {
    	$conexão = new PDO($dsn, $usuario, $senha);

    	$query = '
         	create table tb_usarios(
 				id not null tb_usarios primary key auto_increment,
 				nome varchar(50) not null,
 				email varchar(100) not null,
 				senha varchar(32) not null
 				)         	
    	';

    	 $retorno = $conexão->exec($query);
    	//0
    	 echo $retorno;

    	 $query = '
             insert into tb_usuarios(
             	nome, email, senha 
             ) values (
             	"Jorge Sant Ana", "davidsia16@gmail.com.br", "123456")
    	 ';
    	 $retorno = $conexão->exec($query);

    } catch(PDOexception $e) {
    	echo 'Erro: '.$e->getcode().' Mensagem:'.$e->getMessage(); //registrar erro 
    	     echo '<pre>';
             print_r($e);
             echo '</pre>';

    }

	