package jogo;

import javax.swing.JOptionPane;

public class Quiz {

	public class Perguntas {

	}

	public int perguntar(int s) {

		int nota = 0;

		if (s == 0) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 1*****\n\nPergunta 1: Qual dos aspectos da escrita abaixo é abordado pela disciplina?\n\n1 - Escrita como tecnologia\n2 - Escrita como ferramenta de comunicação\n3 - Escrita como mecanismo de aprendizado\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 1*****\n\nPergunta 2: A leitura tem vários aspectos. Nesta disciplina ela irá ser abordada como:\n\n1 - Processo de interrelacionamente\n2 - Processo de semiotização\n3 - Processo de formação\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 1*****\n\nPergunta 3: Qual dos temas abaixo está na ementa da disciplia?\n\n1 - Discurso\n2 - Palestra\n3 - Validação\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 1*****\n\nPergunta 4: Qual dos temas abaixo está na ementa da disciplia?\n\n1 - Imagem\n2 - Fala\n3 - texto\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 1*****\n\nPergunta 5: A linguagem será abordada como dimensões...\n\n1 - interrelacionadas\n2 - agregadas\n3 - interpretativas\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}
		}
		
		if (s == 1) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia 1*****\n\nPergunta 1: Escolha a forma correta do verbo to be no Presente Simples do inglês do pronome: It ___\n\n1 - are\n1 - is\n3 - am\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia 1*****\n\nPergunta 2: Escolha a forma correta do verbo to be no Presente Simples do inglês do pronome: She ___\n\n1 - are\n2 - is\n3 - amn\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia 1*****\n\nPergunta 3: Escolha a forma correta do verbo to be no Presente Simples do inglês do pronome: They ___\n\n1 - are\n2 - is\n3 - am\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia 1*****\n\nPergunta 4: Escolha a forma correta do verbo to be no Presente Simples do inglês do pronome: You ___\n\n1 - am\n2 - is\n3 - are\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia 1*****\n\nPergunta 5: Escolha a forma correta do verbo to be no Presente Simples do inglês do pronome: We ___\n\n1 - is\n2 - are\n3 - am\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}
		}
		
		if (s == 2) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 1*****\n\nPergunta 1: Qual dos itens abaixo não está na ementa da disciplina?\n\n1 - Computação gráfica\n2 - Ética em Computação\n3 - Áreas da Computação\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 1*****\n\nPergunta 2: Qual dos itens abaixo está na ementa da disciplina?\n\n1 - Sociedade contemporânea\n2 - Sociedade da informação\n3 - Sociedade da interrelação\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 1*****\n\nPergunta 3: TI e comunicação estão nesta disciplina ?\n\n1 - sim\n2 - não\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 1*****\n\nPergunta 4: Mercado de Trabalho em TI está nesta disciplina?\n\n1 - sim\n2 - não\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(

						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 1*****\n\nPergunta 5: Quais dos aspectos abaixo estão na ementa da disciplina?\n\n1 - culturais, relacionais e socias\n2 - sociais, culturais e ambientais\n3 - relacionais, ambientais e culturais\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}
		}
		
		if (s == 3) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 1*****\n\nPergunta 1: De acordo com a ementa, esta disciplia tem o objetivo de...\n\n1 - Interpretação e Resolução de Problemas relevantes para Tecnologia da Informação\n2 - Raciocínio lógico e e interpretação de problemas da Tecnologia da Informação\n3 - Resolução de problemas em sistemas de Tecnologia da Informação\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 1*****\n\nPergunta 2: Qual dos conteúdos abaixo está na ementa da disciplina?\n\n1 - Logaritmo\n2 - Conjuntos\n3 - Números complexos\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 1*****\n\nPergunta 3: Qual dos conteúdos abaixo não está na ementa da disciplina?\n\n1 - Análise dos primos\n2 - Sistemas de equações\n3 - Análise combinatória\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2) {
				resposta = JOptionPane.showInputDialog(

						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 1*****\n\nPergunta 4: Polinômios e funções polinomiais estão na ementa da disciplia?\n\n1 - Sim\n2 - Não\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 1*****\n\nPergunta 5: Trigonometria está na ementa da disciplia?\n\n1 - Não\n2 - Sim\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}
		}

		if (s == 5) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 2*****\n\nPergunta 1: O termo discurso admite quantos significas?\n\n1 - 1\n2 - 2\n3 - Vários\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 2*****\n\nPergunta 2: O significado mais conhecido sobre o termo discurso é:\n\n1 - exposição oral sobre determinado conteúdo\n2 - exposição metódica sobre determinado assunto\n3 - exposiçao metódica sobre vários assunto\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 2*****\n\nPergunta 3: O discurso também pode ser um conjunto de ideias organizadas por meio da linguagem de forma a influir no(a)...\n\n1 -raciocinio\n2 - aprendizagem\n3 - interpretação\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 2*****\n\nPergunta 4: Qual dos temas abaixo está ne ementa da disciplia?\n\n1 - Texto\n2 - Imagem\n3 - Fala\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 2*****\n\nPergunta 5: A coesão se manisfesta localmente. Isso quer dizer que:\n\n1 - Está presente na superficie textual, sendo responsável pelas conexões das frases\n2 - Está presente na superficie textual, sendo responsável pelo encadeamento dos componentes textuais\n3 - Está presente somente em alguns locais do texto\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}
		}
		
		if (s == 6) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia 2*****\n\nPergunta 1: A frase `O computador está funcionando` em inglês ficaria:\n\n1 - Working is the computer\n2 - The computer is working\n3 - Is the working the computer\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia 2*****\n\nPergunta 2: Qual a tradução mais correta da frase` Anna and Brian are operating system` ?\n\n1 - Anna e Brian estão estragando o sistema\n2 - Anna e Brian estão consertando o sistema\n3 - Anna e Brian estão operando o sistema\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia 2*****\n\nPergunta 3: A negativa mais correta da frase 'My keyboard is broken' é:\n\n1 - My keyboard broken is not\n2 - Is not broken my Keyboard\n3 - My keyboard is not broken\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia 2*****\n\nPergunta 4: A traduçâo da frase 'Jonathan is tired.' é:\n\n1 - Jonathan está inpaciente\n2 - Jonathan é policial\n3 - Jonathan está cansado\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia 2*****\n\nPergunta 5: Qual das frases abaixo não está em inglês?\n\n1 - Jeu denfant\n2 - The computer is good\n3 - Child's play\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}
		}
		
		if (s == 7) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 2*****\n\nPergunta 1: O que é técnica?\n\n1 - Conjunto de precedimentos ligados a uma arte ou ciência\n2 - Maneira pelas quais resolvemos todos os problemas da sociedade\n3 - É a mulher do técnico\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 2*****\n\nPergunta 2: O que é tecnologia?\n\n1 - Teoria geral e/ou estudo sistemático sobre técnicas, processos, meios...\n2 - Teoria específica e/ou estudo sistemático sobre técnicas, processos, meios...\n3 - Teoria geral e/ou maneira sistemáticas técnicas para resolver processos.\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 2*****\n\nPergunta 3: Qual das duas é mais abstrata?\n\n1 - Técnica\n2 - Tecnologia\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 2*****\n\nPergunta 4: Qual dos itens abaixo pode ser sociedade?\n\n1 - Comunidade independente\n2 - Comunidade interdepente\n3 - Comunidade concorrente\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 2*****\n\nPergunta 5: Uma comunidade organizada envolve grau considerável de:\n\n1 - Comunicação e cooperação\n2 - Socialização e meios\n3 - Cooperação e Sindicalização\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}
		}
		
		if (s == 8) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 2*****\n\nPergunta 1: Quando um objeto x é um dos elementos que compõem o conjunto A dizemos que:\n\n1 - x está contido em A\n2 - x pertence a A\n3 - x está dentro de A\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 2*****\n\nPergunta 2: Se todos os elementos de um conjunto B também são elementos de um conjunto A, dizemos que:\n\n1 - B é um conjunto de A\n2 - A é um dominante de B\n3 - B está contido em A\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 2*****\n\nPergunta 3: A interseção entre os conjuntos A = {1, 2, 3} e B = {2, 3, 4} é:\n\n1 - {2, 3}\n2 - {1, 2, 3, 4}\n3 - {1, 4}\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(

						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 2*****\n\nPergunta 4: A união entre os conjuntos A = {1, 2, 3} e B = {2, 3, 4} é:\n\n1 - {1, 4}\n2 - {1, 2, 3, 4}\n3 - {2, 3}\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 2*****\n\nPergunta 5: A interseção de A = {1, 2} com B = {1, 3} unido com C = {3, 4} é igual a:\n\n1 - {1, 3, 4}\n2 - {1, 2, 3, 4}\n3 - {1}\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}
		}
		
		if (s == 10) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 3*****\n\nPergunta 1: Qual o objetivo da carta de apresentação?\n\n1 - Expor historias sobre a vida do escrevente\n2 - Comseguir um emprego, estágio, etc\n3 - Detalhar sua esperiências profissional anterior.\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 3*****\n\nPergunta 2: O que o escrevente relata na carta?\n\n1 - Um pedido de emprego\n2 - Uma história sobre sua vida\n3 - Situaçoes reais da sua carreira acadêmica\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 3*****\n\nPergunta 3: Qual o genero da carta de apresentação\n\n1 - descritivo\n2 - apresentavivo\n3 - discursivo\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 3*****\n\nPergunta 4: O que é a paragrafação?\n\n1 - Um meio para dividir um texto em pequenas proções de informação\n2 - Um método de dividir um parágrafo coerentemente\n3 - Um recurso para padronizar os parágrafos de um texto\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM PORGUGUES*********************************************\n\n*****Dia 3*****\n\nPergunta 5: Para que serve a paragrafação ?\n\n1 - Deixar o texto visualmente mais bonito\n2 - Auxiliar na organização do texto\n3 - Distribuir de forma coerente as palavras em um parágrafo\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}
		}
		
		if (s == 11) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia 3*****\n\nPergunta 1 : De acordo com a frase 'Maria's cell phone is blocked' tem algo que pertence a Maria bloqueado. O que é?\n\n1 - Celular\n2 - Notebook\n3 - Tablet\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia*3*****\n\nPergunta 2: Na frase 'John was at home when it started to rain and his computer got wet from a drip'.O que aconteceu com o computador de John?\n\n1 - Caiu\n2 - Molhou\n3 - Foi arranhado\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia 3*****\n\nPergunta 3: 'Roberta's computer clock is late'. De acordo com esta frase, qual o problema de Roberta?\n\n1 - O relógio do seu computador está atrasado\n2 - O seu cachorro não late\n3 - O relógio do seu computador está adiantado\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia 3*****\n\nPergunta 4: De acordo com a frase 'UFRN set up a Memory Management Council' o que a UFRN instalou?\n\n1 - Uma memória de condendimentos\n2 - Um programa de gerenciamento de conselhos\n3 - Um conselho gestor da memória\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************PRATICAS DE LEITURA E ESCRITA EM INGLÊS*********************************************\n\n*****Dia 3*****\n\nPergunta 5: Five times seven:\n\n1 - 35\n2 - 11\n3 - Telefone\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}
		}
		
		if (s == 12) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 3*****\n\nPergunta 1: Qual dos aspectos abaixo não está na sociedade da informação?\n\n1 - Divulgar um grande número de infomrações\n2 - Infra-estrutura de acesso\n3 - Melhoria na velocidade de acesso a comunicação\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 3*****\n\nPergunta 2: De acordo com a privacidade individual, é correto afirma que:\n\n1 - Devemos forcer nossos dados logo que se pede para agilizar algum processo\n2 - Devemos buscar conhecer o maior número de dados de outras pessoas\n3 - Devemos ter cuidado no exposição dos nossos dados\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 3*****\n\nPergunta 3: De acordo com a melhoria de acesso a comunicação, devemos...\n\n1 - Socializar o acesso a comunicação\n2 - Distribuir todas as informações\n3 - Compartilhar fake news\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 3*****\n\nPergunta 4: As politicas de regulamentação são importantes para:\n\n1 - Burocratizas as informações para evitar fake news\n2 - Regulamentar o acesso\n3 - Colocar politos na internet\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************TECNOLOGIA DA INFORMAÇÃO E SOCIEDADE*********************************************\n\n*****Dia 3*****\n\nPergunta 5: A segurança nas transações financeiras são para:\n\n1 - Evitar o vazamento de dados importantes\n2 - Evitar que algumas pessoas façam essas transações\n3 - Evitar esse tipo de transação\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}
		}
		
		if (s == 13) {

			int v = 0;
			String resposta = "";

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 3*****\n\nPergunta 1: O que é a atitimética?\n\n1 - Ramo da matemática que lida com os números e operações\n2 - Ramo da matemática que soma divide subtrai e multiplica números\n3 - O estudo da complexidade dos números\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 3*****\n\nPergunta 2: A operação de subtração é associativa?\n\n1 - sim\n2 - não\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 3*****\n\nPergunta 3: A operação de subtração é comutativa?\n\n1 - sim\n2 - não\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 1)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 3*****\n\nPergunta 4: Qual dos números abaixo é divisível por 2?\n\n1 - 351\n2 - 654\n3 - 689\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 2)
					nota += 2;
			}

			v = 0;

			while (v != 1 && v != 2 && v != 3) {
				resposta = JOptionPane.showInputDialog(
						"*********************************************RESOLUÇÃO DE PROBLEMAS MATEMÁTICOS PARA TI*********************************************\n\n*****Dia 3*****\n\nPergunta 5: Pergunta 5: Qual dos números abaixo é divisível por 3?\n\n1 - 658\n2 - 946\n3 - 351\n\n\n\n\n\n\n\n**Digite o valor correspondente a sua resposta:");
				try {
					v = Integer.parseInt(resposta);
				} catch (Exception e) {
					v = 0;
				}
				if (v == 3)
					nota += 2;
			}
		}


		return nota;
	}

}
