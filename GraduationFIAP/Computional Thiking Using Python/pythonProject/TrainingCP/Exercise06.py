nome = input("Digite o nome do funcionário: ")
salarioBruto = float(input("Digite o salário bruto do funcionário: "))

if salarioBruto <= 1100.00:
    descontoInss = salarioBruto * 0.075
elif salarioBruto <= 2203.48:
    descontoInss = salarioBruto * 0.09
elif salarioBruto <= 3305.22:
    descontoInss = salarioBruto * 0.12
else:
    descontoInss = salarioBruto * 0.14

print(f"Nome do funcionário: {nome}")
print(f"Salário bruto: R${salarioBruto:.2f}")
print(f"Desconto do INSS: R${descontoInss:.2f}")
print(f"Salário líquido: R${salarioBruto-descontoInss:.2f}")
