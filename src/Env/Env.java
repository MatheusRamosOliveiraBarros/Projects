/*
|--------------------------------------------------------------------------
| Instruções
|--------------------------------------------------------------------------
|
| 1. Copiar este arquivo nessa mesma pasta raiz do projeto
| 2. Renomear o arquivo novo para "env.java" (não será commitado)
| 3. Preencher os campos abaixos de acordo com o ambiente
|
| Obs1.: serão criadas constantes  que funcionarão no projeto todo.
| Obs2.: ao criar novas constantes no arquivo "Env.php" para utilização no sistema (a princípio apenas no arquivo DAO),
| deve-se replicar essa alteração neste arquivo (env.php.example) e commitá-lo, para
| os outros ambientes adaptarem-se a alteração realizada
|
*/
package Env;

public abstract class Env {
    // Dados banco de dados
    public static final String ENV_SERVER   = "localhost";
    public static final String ENV_DATABASE = "db_projeto";
    public static final String ENV_USER     = "ale";
    public static final String ENV_PASSWORD = "asd123";
}