import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Filosofos {
	
	public class garfo extends Thread{
		 final int garfoEsquerda;
		 final int garfoDireita;
		
		public Garfos(int garfoEsquerda,int garfoDireita){
			    this.garfoEsquerda=garfoEsquerda;
				this.garfoDireita= garfoDireita;
		}
		
	}
	
	
	public void run() {
		while(true) {
			try {
				Sorteio.Direita();
				Sorteio.Esquerda();
				Thread.sleep(1000);
			}catch(InterruptedException ex) {
					System.out.println(ex);
			}
		}
	}
	
	public void SorteioDireita() {
		int garfoDireita;
		Random d  = new Random();
		garfoDireita =d.nextInt(5);
		
		System.out.println("Garfo da Direita:" + garfoDireita);
	}
	
	public void SorteioEsquerda() {
		int garfoEsquerda;
		Random d  = new Random();
		garfoEsquerda =d.nextInt(5);
		
		System.out.println("Garfo da Esquerda:" + garfoEsquerda);
	}
	
	public class Filosofos extends thread{
		String nome;
		Garfos garfo;
		int lugarMesa;
		
		public class Filosofos(String nome,Garfos garfo, int lugarMesa){
			this.nome= nome;
			this.garfo=garfo;
			this.lugarMesa=lugarMesa;
			
			System.out.println("O filósofo" + nome + "sentou a mesa");
			Thread.sleep(1000);
		}
		
		public void run{
			while(true) {
				if(garfo.gardoDireita==5) {
					System.out.println("O filósofo" + nome + "pegou o garfo" + garfo.garfoDireita);
						if(garfo.garfoEsquerda==1){
							System.out.println("O filósofo" + nome + "pegou o garfo" + garfo.garfoEsquerda);
							System.out.println("O filósofo" + nome + "está comendo");
							System.out.println("O filósofo" + nome + "largou o garfo  direita");
							System.out.println("O filósofo" + nome + "largou o garfo a esquerda");
						}else {
							System.out.println("O filósofo" + nome + "largou o garfo" + garfo.garfoDireita);
						}
				}else {
					try {
						Pensar();
					}catch(InterruptedException ex){
						Logger.getLogger(Filosofos.class.getName()).Log(Level.SEVERE,null,ex);
					}
				}
				
				if(garfo.gardoDireita==1) {
					System.out.println("O filósofo" + nome + "pegou o garfo" + garfo.garfoDireita);
						if(garfo.garfoEsquerda==2){
							System.out.println("O filósofo" + nome + "pegou o garfo" + garfo.garfoEsquerda);
							System.out.println("O filósofo" + nome + "está comendo");
							System.out.println("O filósofo" + nome + "largou o garfo  direita");
							System.out.println("O filósofo" + nome + "largou o garfo a esquerda");
						}else {
							System.out.println("O filósofo" + nome + "largou o garfo" + garfo.garfoDireita);
						}
				}else {
					try {
						Pensar();
					}catch(InterruptedException ex){
						Logger.getLogger(Filosofos.class.getName()).Log(Level.SEVERE,null,ex);
					}
				}
				
				if(garfo.gardoDireita==2) {
					System.out.println("O filósofo" + nome + "pegou o garfo" + garfo.garfoDireita);
						if(garfo.garfoEsquerda==3){
							System.out.println("O filósofo" + nome + "pegou o garfo" + garfo.garfoEsquerda);
							System.out.println("O filósofo" + nome + "está comendo");
							System.out.println("O filósofo" + nome + "largou o garfo  direita");
							System.out.println("O filósofo" + nome + "largou o garfo a esquerda");
						}else {
							System.out.println("O filósofo" + nome + "largou o garfo" + garfo.garfoDireita);
						}
				}else {
					try {
						Pensar();
					}catch(InterruptedException ex){
						Logger.getLogger(Filosofos.class.getName()).Log(Level.SEVERE,null,ex);
					}
				}
				
				
			
			}
		}
	}
}


