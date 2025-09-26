package com.ex03;

import com.ex03.shallowcopy.BasicCar;
import com.ex03.shallowcopy.Nano;

public class mainShallow {
    public static void main(String[] args) {
        try {
            // 1. Criando o Protótipo ORIGINAL
            BasicCar nanoPrototype = new Nano("XM624");
            System.out.println(nanoPrototype);

            // 2. Obtendo uma cópia CLONADA do Nano
            // Observação: O construtor do Nano não é chamado novamente!
            BasicCar clonedCar = nanoPrototype.clone();

            // 3. Modificando o objeto clonado (sem afetar o protótipo original)
            clonedCar.setModelName("Nano XM900 (Clonado)");
            clonedCar.setPrice(11200);

            // 4. Trabalhando com a cópia clonada
            System.out.println(clonedCar);


            // Prova: O protótipo original permanece inalterado
            System.out.println("Protótipo Original: " + nanoPrototype.getModelName());
            System.out.println("Cópia Clonada: " + clonedCar.getModelName());

            // Prova de Identidade (IDs de memória diferentes)
            System.out.println("IDs de memória diferentes? " + (nanoPrototype != clonedCar));


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
