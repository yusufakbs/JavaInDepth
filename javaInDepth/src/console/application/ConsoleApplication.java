package console.application;

import java.util.Scanner;

public class ConsoleApplication {
    private static Scanner sc = new Scanner(System.in);

    private static void printMenu() {
        System.out.println("Godoro Console App. Version 0.1");
        System.out.println("1. Listele \n" +
                "2. Ekle \n" +
                "3. Güncelle \n" +
                "4. Seç \n" +
                "5. Sil \n" +
                "6. Sakla \n" +
                "7. Yükle \n" +
                "0. Çık");
    }

    private static int scanChoice(){
        System.out.println("Lütfen seçiminizi giriniz");
        int choice = sc.nextInt();
        return choice;
    }

    private static void handleCommand(int choice){
        switch (choice){
            case 1:
                listEntities();
                break;
            case 2:
                insertEntities();
                break;
            case 3:
                updateEntities();
                break;
            case 4:
                selectEntities();
                break;
            case 5:
                deleteEntities();
                break;
            case 6:
                storeEntities();
                break;
            case 7:
                loadEntities();
                break;
            case 0:
                exitApplication();
                break;
            default:
                System.out.println("Komut anlaşılamadı.");
        }
    }

    private static void exitApplication() {
        System.out.println("Çıkılıyor..");
        System.exit(0);

    }

    private static void loadEntities() {
        System.out.println("Yükleniyor..");

    }

    private static void storeEntities() {
        System.out.println("Saklanıyor..");

    }

    private static void deleteEntities() {
        System.out.println("Siliniyor..");

    }

    private static void selectEntities() {
        System.out.println("Seçiliyor..");

    }

    private static void insertEntities() {
        System.out.println("Ekleniyor..");

    }

    private static void updateEntities() {
        System.out.println("Güncelleniyor..");
    }

    private static void listEntities() {
        System.out.println("Listeleniyor...");
    }

    public static void main(String[] args) {
        while (true){
            printMenu();
            int scanChoice = scanChoice();
            System.out.println("Seçtiğiniz Madde : " + scanChoice);
           handleCommand(scanChoice);
            System.out.println("-----------------------");
        }

    }
}
