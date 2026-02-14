package org.example;

import org.example.tache.Tache;

import java.awt.*;
import java.util.Scanner;

/**
 * Class par défaut de l'application
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Choisissez une action :");
        System.out.println("1. créer une tache");

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Description : \n");
            String description = sc.nextLine();

            Tache tache = new Tache(description);

            System.out.println(tache.toString());
        }

    }
}
