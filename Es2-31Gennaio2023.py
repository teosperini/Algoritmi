def Ex2(lista):
    #scorro tutta la lista cercando il maggiore (coso Teta N)
    #creo una lista di zeri lunga quanto il numero maggiore di quella lista (costo Teta 1)
    #ogni volta che incontro quel numero incremento il valore dell'indice corrispondente (costo Teta 1)
    #cerco il massimo della nuova lista e utilizzo l'indice per capire qual'è quello che compare più volte
    l = len(lista)
    listaOutput = [0 for i in range(max(lista))]
    for i in range(l):
        listaOutput[lista[i]-1]+=1
    indexNumMax = -1
    numMax = 0
    for j in range(len(listaOutput)):
        if listaOutput[j] > numMax:
            indexNumMax = j
            numMax = listaOutput[j]
    return indexNumMax+1

print(Ex2([2, 6, 8, 5, 2, 3, 6, 8, 9, 5, 8, 1, 2]))