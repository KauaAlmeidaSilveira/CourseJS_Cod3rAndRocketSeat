somaNotas = 0
totalAlunos = 0
reprovadosDireto = 0
exameAprovado = 0

while True:
    nota = float(input("Digite a nota do aluno (ou uma nota negativa para sair): "))

    if nota < 0:
        break

    somaNotas += nota
    totalAlunos += 1

    if nota < 3.5:
        reprovadosDireto += 1
    elif nota >= 3.5 and nota < 7:
        exameAprovado += 1

if totalAlunos > 0:
    mediaTurma = somaNotas / totalAlunos
else:
    mediaTurma = 0

print(f"Média da turma: {mediaTurma:.2f}")
print("Reprovados direto:", reprovadosDireto)
print("Exame aprovado:", exameAprovado)
