package com.ex03;

import com.ex03.deepcopy.BasicCarDeepCopy;

public class mainDeep {
    public static void main(String[] args) {
        try {
            // 1. PROTÓTIPO ORIGINAL
            BasicCarDeepCopy original = new BasicCarDeepCopy("Vermelho", 200);
            System.out.println("ORIGINAL antes da modificação:");
            System.out.println(original); // Motor: 200 HP

            System.out.println("\n------------------------------------");

            // 2. CLONAGEM (Deep Copy)
            BasicCarDeepCopy cloned = original.clone();
            cloned.setColor("Azul"); // Alterando um campo primitivo (não afeta o original)

            // 3. MODIFICANDO O OBJETO INTERNO MÚTAVEL NO CLONE
            System.out.println("Modificando motor do CLONE...");
            cloned.getEngine().upgrade(50); // Aumenta 50 HP SOMENTE no clone

            System.out.println("\n------------------------------------");

            // 4. VERIFICAÇÃO FINAL

            System.out.println("RESULTADO NO CLONE (Azul):");
            System.out.println(cloned);
            // Saída esperada: Motor: 250 HP

            System.out.println("\nRESULTADO NO ORIGINAL (Vermelho):");
            System.out.println(original);
            // Saída esperada: Motor: 200 HP (PROVA DE INDEPENDÊNCIA!)

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
