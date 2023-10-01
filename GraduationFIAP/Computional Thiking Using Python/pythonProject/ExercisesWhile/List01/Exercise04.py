senhaCorreta = 1234

while True:
    senha = int(input("Digite a senha numérica: "))

    if senha == senhaCorreta:
        print("Senha correta. Acesso permitido.")
        break
    else:
        print("Senha incorreta. Tente novamente.")
