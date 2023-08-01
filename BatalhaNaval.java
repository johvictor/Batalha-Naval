package Batalha;

import java.util.Scanner;
import java.util.Random;

public class BatalhaNaval {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       boolean game = true;
       int tentativas =0;
        //Tamanho do tabuleiro
       Campo [][] tabu = new Campo[6][6];
       DistribuirCampos(tabu);
       SotearNavios(tabu);
        while(game){   
            DesenharCampo(tabu);         
            int []posicao=new int [2];
            System.out.println("\n Qual a linha:");
            posicao[0]=input.nextInt();
            System.out.println("\n Qual a coluna:");
            posicao[1]=input.nextInt();
            
            TacarBomba(tabu,posicao);
        }
        
    }
    
    public static void SotearNavios(Campo tabu [][]){
        Random gerador= new Random();
        for (int i = 0; i < 10; i++) {
        int u =gerador.nextInt(5);
        int j =gerador.nextInt(5); 
        
        tabu[u][j].setHasNavio(true);
        }
        
        
        
    }
    
    public static void DistribuirCampos(Campo tabu[][]){
        for(int l=0;l<6;l++){
            for(int c=0;c<6;c++){
                tabu[l][c]=new Campo('~', false);
            }
        }
    }
    
    
    public static void DesenharCampo(Campo tabu[][]){
            LimparTela();
            int i=0;
        System.out.println("     0 | 1 | 2 | 3 | 4 | 5");
          
        for(int l=0;l<6;l++){
            System.out.print(" "+i+"|");
            for(int c=0;c<6;c++){
                  
                  System.out.print("  "+tabu[l][c].getSimbolo()+" ");
            }
            System.out.print("\n");
            i++;
        }        
    }
        
        
    public static void LimparTela(){
            for (int i = 0; i < 50; i++) {
                System.out.println("\n");
            }
        }
    
    public static void TacarBomba(Campo tabu[][], int p[]){
       int num1=p[0];
       int num2=p[1];
      if(tabu[num1][num2].isHasNavio()){
       tabu[num1][num2].setSimbolo('X');
       tabu[num1][num2].setMarcado(true);
      }else{
          tabu[num1][num2].setSimbolo(' ');
          tabu[num1][num2].setMarcado(true);
      }
    }
        
}
