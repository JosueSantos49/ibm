/*
Desenvolver um programa que resolva o problema no menor número de tentativas possível

Descubra o Assassino:
 
O empresário Bill G. Ates foi assassinado e o corpo dele foi deixado na frente da delegacia de polícia. 
O detetive Lin Ust Orvalds foi escolhido para investigar este caso. Após uma série de investigações, ele 
organizou uma lista com prováveis assassinos, os locais do crime e quais armas poderiam ter sido utilizadas.
 
Suspeitos:
Charles B. Abbage
Donald Duck Knuth
Ada L. Ovelace
Alan T. Uring
Ivar J. Acobson
Ras Mus Ler Dorf
 
Locais:
Redmond
Palo Alto
San Francisco
Tokio
Restaurante no Fim do Universo
São Paulo
Cupertino
Helsinki
Maida Vale
Toronto

Armas:
Peixeira
DynaTAC 8000X (o primeiro aparelho celular do mundo)
Trezoitão
Trebuchet
Maça
Gládio

Uma testemunha foi encontrada, mas ela só consegue responder se Lin fornecer uma teoria. 
Para cada teoria ele "chuta" um assassino, um local e uma arma. 
A testemunha então responde com um número. 
Se a teoria estiver correta (assassino, local e arma corretos), ela responde 0. 
Se a teoria está errada, um valor 1, 2 ou 3 é retornado. 
1 indica que o assassiona está incorreto; 
2 indica que o local está incorreto; 
3 indica que a arma está incorreta.
Se mais de uma suposição está incorreta, ela retorna um valor arbitrário 
entre as que estão incorretos (isso é totalmente aleatório).
 
 */
package descubraassassino;

import java.util.Scanner;

public class DescubraAssassino {

    public static void main(String[] args) {
        
        Scanner dados = new  Scanner(System.in);
                
        System.out.println("Digite o numero de tentativa: ");
        int tentativa = dados.nextInt();
        
        //laço para executar o numero de tentativa escolida
        for (int i = 0; i < tentativa; i++) {
                    
            System.out.println("Informe uma teoria: ");

            //Capiturando os valores digitados a partir do teclado
            int assassino = dados.nextInt();
            int local = dados.nextInt();
            int arma = dados.nextInt();

            //Se a teoria estiver correta ela responde 0.
            if((assassino == 0) && (local == 0) && (arma == 0)){
                System.out.println("Assassino, local e arma corretos. " + " Teoria: " + assassino + ", " + local + ", " + arma);
            }

            //Se a teoria está errada, um valor 1, 2 ou 3 é retornado. 
            if((assassino == 1) && (local == 2) || (arma == 3)){
                System.out.println("Teoria está errada. " + " Teoria: " + assassino + ", " + local + ", " + arma);
            }

            //1 indica que o assassiona está incorreto; 
            if((assassino == 1) && (local == 1) && (arma == 1)){
                System.out.println("Assassino está incorreto. " + " Teoria: " + assassino + ", " + local + ", " + arma);
            }
            
            //2 indica que o local está incorreto;
            if((assassino == 2) && (local == 2) && (arma == 2)){
                System.out.println("Local está incorreto. " + " Teoria: " + assassino + ", " + local + ", " + arma);
            }

            //3 indica que a arma está incorreta.
            if((assassino == 3) && (local == 3) && (arma == 3)){
                System.out.println("Arma está incorreta. " + " Teoria: " + assassino + ", " + local + ", " + arma);
            } 
            
            System.out.println("Isso é totalmente aleatório. " + " Valor arbitrário: " + assassino + ", " + local + ", " + arma);
                
        }
                
    }
    
}
