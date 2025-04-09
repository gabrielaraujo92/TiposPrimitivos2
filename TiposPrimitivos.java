/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposprimitivos;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
     
    // Declaração de novas variáveis com contexto do Brasil
    byte numeroCachorros = 3; // Tipo byte para o número médio de cachorros por residência no Brasil
    short temperaturaMedia = 25; // Tipo short para uma temperatura comum no Brasil
    int distanciaTrabalho = 1500; // Tipo int para a distância média de uma viagem diária para o trabalho
    long populacaoSaoPaulo = 12325232L; // Tipo long para a população de São Paulo (aproximadamente 12 milhões, dado de 2023)
    float alturaMedia = 1.70f; // Tipo float para a altura média da população brasileira
    double precoGasolina = 5.80; // Tipo double para o preço médio da gasolina no Brasil (aproximadamente em 2023)
    char classificacaoIMC = 'N'; // Tipo char para a classificação de IMC (N para normal, por exemplo)
    boolean possuiCarro = false; // Tipo boolean para saber se a pessoa possui carro (vamos supor que não)

    // Exibição dos valores
    System.out.println("Número de cachorros: " + numeroCachorros);
    System.out.println("Temperatura média: " + temperaturaMedia + "°C");
    System.out.println("Distância até o trabalho: " + distanciaTrabalho + " km");
    System.out.println("População de São Paulo: " + populacaoSaoPaulo);
    System.out.println("Altura média: " + alturaMedia + " m");
    System.out.println("Preço da gasolina: R$ " + precoGasolina);
    System.out.println("Classificação IMC: " + classificacaoIMC);
    System.out.println("Possui carro? " + possuiCarro);
}

    }

