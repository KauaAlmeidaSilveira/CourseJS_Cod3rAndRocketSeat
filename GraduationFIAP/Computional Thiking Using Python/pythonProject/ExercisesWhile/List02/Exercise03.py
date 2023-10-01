while True:

    numero = int(input("Digite um número x: "))
    opcao = input("Escolha uma opção (1 - Mod de 6, 2 - Fatorial, 3 - Exibir todos os inteiros de 1 até um número x) ou digite 'N' para sair: ")

    match opcao:
        case '1':
            if numero % 6 == 0:
                print(f"{numero} é divisível por 6.")
            else:
                print(f"{numero} não é divisível por 6.")

            opcao = input("Deseja continuar ? (S/N)")
            if opcao == 'N':
                break

        case '2':
            fatorial = 1
            for i in range(1, numero + 1):
                fatorial *= i
            print(f"O fatorial de {numero} é {fatorial}.")

            opcao = input("Deseja continuar ? (S/N)")
            if opcao == 'N':
                break
        case '3':
            print(f"Inteiros de 1 até {numero}:")
            for i in range(1, numero + 1):
                print(i)

            opcao = input("Deseja continuar ? (S/N)")
            if opcao == 'N':
                break
        case _:
            print("Opção inválida. Tente novamente.")
