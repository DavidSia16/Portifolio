<?php
  session_start();
  /*
  echo '<pre>';
  print_r($_SESSION);
  echo '</pre>';
  //remover índices doarray de sessão
  // unset 
  
  unset($_SESSION['x']); // para remover o indice apenas se existir 

  echo '<pre>';
  print_r($_SESSION);
  echo '</pre>';

  //destruir a variavel de sessão
  //session_destroy()
  session_destroy(); //será destruída

  //forcar um redirecionamento

  echo '<pre>';
  print_r($_SESSION);
  echo '</pre>';
  */ 

  session_destroy();
  header('Location: index.php');

  ?>