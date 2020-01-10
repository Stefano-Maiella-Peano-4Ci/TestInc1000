# TestInc1000
Questo è l'esercizio sui thread svolto in classe.

Questa volta in questo esercizio sui thread al posto di estendere la classe thread, ho implementato l'interfaccia RUNNABLE, questo metodo ci permette l'ereditarietà multipla, ovvero possiamo ereditare da più interfacce, altrimento avremmo potuto estendere una sola classe.

In questo esercizio c'è la possibilità di un conflitto, ovvero di un errore durante l'esecuzione del progetto, ovvero siccome entrabi i threads lavora su di una variabile di classe **_cnt_** che possiede una allocazione fissa nella memoria, essa è accessibile da tutte le classi del package. 

