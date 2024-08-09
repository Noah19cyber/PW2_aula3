import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Livro meulivro = new Livro();
   System.out.print("Titulo: ");
   meulivro.nome = "Vermelho, branco e sangue azul";
   meulivro.autor = "Casey McQuiston";
   meulivro.editora = "Seguinte";
   meulivro.paginas = 392;
   meulivro.resumo = "Quando sua mãe foi eleita presidenta dos Estados Unidos, Alex Claremont-Diaz se tornou o novo queridinho da mídia norte-americana. Bonito, carismático e com personalidade forte, Alex tem tudo para seguir os passos de seus pais e conquistar uma carreira na política, como tanto deseja. Mas quando sua família é convidada para o casamento real do príncipe britânico Philip, Alex tem que encarar o seu primeiro desafio diplomático: lidar com Henry, irmão mais novo de Philip, o príncipe mais adorado do mundo, com quem ele é constantemente comparado";
   meulivro.Tipocapa = "comum";
   meulivro.valor = 23.99;
   System.out.println(meulivro.nome
           +"escrito por "+ meulivro.autor
           +" custa " + meulivro.valor);

    editora Seguinte = new editora();
    Seguinte.nome = "Seguinte";
    Seguinte.email = "seguinte@gmail.com";
    Seguinte.site = "seguinte.com";




    }
}