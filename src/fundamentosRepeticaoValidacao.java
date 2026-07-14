import java.util.Scanner;

void main () {
    Scanner usuario = new Scanner(System.in);
    System.out.println("Digite o seu primeiro nome:");
    String nome = usuario.nextLine();

    System.out.println("Digite um número positivo:");
    int numero = usuario.nextInt();

    while (numero < 0) {
        System.out.println("Seu número precisa ser positivo:");
        numero = usuario.nextInt();
    }
    contadorCrescente (numero);
    System.out.println(); // para pular linha entre as respostas;
    contadorDecrescente (numero);
    System.out.println(); // para pular linha entre as respostas;
    repetidor(nome,numero);

}
void contadorCrescente (int limite) {  //contador crescente
    System.out.println("A contagem crescente até seu número é: ");
    for (int contagem = 0; contagem <= limite; contagem++){
        System.out.print(contagem);
    }
}

void contadorDecrescente (int limite){ //contador decrescente
    System.out.println("A contagem descrescente a partir do seu número é:");
    for (int contagem = limite; contagem > 0; contagem--){
        System.out.print(contagem);
    }
}

void repetidor (String nome, int vezes){ //repetidor de nome, quando necessario
    if (nome.length () > 6){
        System.out.println("O nome " + nome + " tem menos de 6 letras");
        System.out.println (nome);
    } else if (nome.length () < 6) {
        System.out.println("O nome " + nome + " tem mais do que 6 letras");
        System.out.println (nome);
    }else {
        for (int letras = 0; letras < vezes; letras++) {
            System.out.println(nome);
        }
    }
}
