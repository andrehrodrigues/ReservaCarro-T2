/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservacarros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Carro> compactos = new ArrayList<Carro>();
        compactos.add(new Carro("Gol", "Wolksvagen", "Compacto", 4));
        compactos.add(new Carro("Palio", "FIAT", "Compacto", 4));
        compactos.add(new Carro("Ka", "Ford", "Compacto", 4));
        
        ArrayList<Carro> esportivos = new ArrayList<Carro>();
        esportivos.add(new Carro("Ferrari", "Ferrari", "Esportivo", 2));
        esportivos.add(new Carro("Bugatti", "Bugatti", "Esportivo", 2));
        esportivos.add(new Carro("Lamborghini", "Lamborghini", "Esportivo", 2));
        
        ArrayList<Carro> suvs = new ArrayList<Carro>();
        suvs.add(new Carro("Navigator", "Lincoln Motors", "SUV", 7));
        suvs.add(new Carro("HRV", "Honda", "SUV", 7));
        suvs.add(new Carro("Q5", "Audi", "SUV", 7));
        
        //Cria locadoras
        //South Car -> Compactos
        Locadora southCar = new Locadora("South Car", 210.00, 200.00, 150.00, 90.00,compactos);
        //West Car -> Esportivos
        Locadora westCar = new Locadora("West Car", 530.00, 200.00, 150.00, 90.00,esportivos);
        //North Car -> SUV's
        Locadora northCar = new Locadora("North Car", 630.00, 600.00, 580.00, 590.00,suvs);
        
        
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File("entrada.txt"));
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                //Pedido do clinte
                String tipoCarro;
                String qtdAssentos;
                ArrayList<String> datas = new ArrayList<>();
                int diasSemana = 0;
                int fimSemana = 0;
                
                Scanner lineScanner = new Scanner(line);
                if(lineScanner.hasNext()){
                    tipoCarro = lineScanner.next();
                    tipoCarro = tipoCarro.replace(":","");

                    qtdAssentos = lineScanner.next();
                    qtdAssentos = qtdAssentos.replace(":","");

                    while (lineScanner.hasNext()) {
                        lineScanner.next();
                        String data = lineScanner.next();
                        data = data.replace(",","");
                        
                        if(data.equals("(sab)") || data.equals("(dom)")){
                            fimSemana++;
                        }else{
                            diasSemana++;
                        }
                        datas.add(data);
                    }
                    
                    if(tipoCarro.equals("Normal")){
                        if(Integer.parseInt(qtdAssentos) > 2){
                            ArrayList<Carro> carros = southCar.getCarrosDisponives();
                            for(int i = 0; i < carros.size(); i++ ){
                                System.out.print(carros.get(i).getNome());
                                if( i+1 < carros.size()){
                                    System.out.print(",");
                                }
                                else{
                                    System.out.print(":");
                                }
                            }
                            System.out.println("South Car");
                        }else{
                            ArrayList<Carro> carros = westCar.getCarrosDisponives();
                            for(int i = 0; i < carros.size(); i++ ){
                                System.out.print(carros.get(i).getNome());
                                if( i+1 < carros.size()){
                                    System.out.print(",");
                                }
                                else{
                                    System.out.print(":");
                                }
                            }
                            System.out.println("West Car");
                        }
                        
                    }else{
                        ArrayList<Carro> carros = northCar.getCarrosDisponives();
                            for(int i = 0; i < carros.size(); i++ ){
                                System.out.print(carros.get(i).getNome());
                                if( i+1 < carros.size()){
                                    System.out.print(",");
                                }
                                else{
                                    System.out.print(":");
                                }
                            }
                            System.out.println("North Car");
                    }
                    
                }
                lineScanner.close();
            }
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fileScanner != null) {
                fileScanner.close();
            }
        }
        
        
        
        
        
        
    }
    
}
