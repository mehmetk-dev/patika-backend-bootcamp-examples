package Hafta8.Proje;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class LogApp {

    private static Set<String> USER_NAMES =  new HashSet<>();
    static Scanner scanner = new Scanner(System.in);

    private static File LOG_FILE = new File("C:\\Users\\Mehme\\IdeaProjects\\java-dersleri\\java\\Hafta8\\Proje\\log.txt");

    public static void main(String[] args) {


        USER_NAMES.add("Mehmet");
        USER_NAMES.add("Ali");
        USER_NAMES.add("Burak");


        System.out.println("Kullanıcı adınızı giriniz: ");
        String userName = scanner.nextLine();

        Optional<String> optionalUserName = USER_NAMES.stream()
                .filter(user -> user.equalsIgnoreCase(userName))
                .findFirst();

        if (optionalUserName.isEmpty()){
            writeLog(LogLevel.ERROR,"Kullanıcı bulunamadı! " + userName);
            System.out.println("Kullanıcı bulunamadı: " + userName);
        }else{
            writeLog(LogLevel.INFO,"Kullanıcı giriş yaptı : "+ userName);
        }

        int choise;

        do {
            System.out.println("\n---LOG UYGULAMASI---");
            System.out.println("1-Loglarda Ara");
            System.out.println("2-Log Dosyasını Temizle");
            System.out.println("3-Log Dosyasını Görüntüle.");
            System.out.println("4-Çıkış");
            System.out.println("Seçiminiz");
            choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise){
                case 1:
                    searchLog(scanner);
                    break;
                case 2:
                    clearLogFile();
                    break;
                case 3:
                    showLogFile();
                    break;
                case 4:
                    writeLog(LogLevel.INFO,"Uygulama Sonlandırıldı.");
                    System.out.println("Uygulamadan Çıkılıyor...");
                    continue;
                default:
                    System.out.println("Geçersiz işlem tekrar deneyiniz.");
            }
        }while (choise != 4);
    }

    private static void showLogFile() {

        try(BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE))) {
            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void clearLogFile() {

        System.out.println("Log dosyasını silmek istiyorsanız 'evet' yazınız");
        String choise = scanner.nextLine();
        if (choise.equalsIgnoreCase("evet")){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE))){
                writer.write("");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Yanlış bir şey yazdınız.");
        }
    }

    private static void searchLog(Scanner scanner) {

        System.out.println("Aramak istediğiniz Log'u yazınız:");
        String search = scanner.nextLine();

        String line;
        boolean isFound = false;

        try(BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE))) {

            while((line = reader.readLine())  != null){
                if (line.toUpperCase().contains(search.toUpperCase())){
                    System.out.println("Bulunan log ->" + line);
                    isFound = true;
                }
            }

            if (!isFound){
                System.out.println("Veri bulunamadı: " + search);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeLog(LogLevel logLevel, String message) {

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE,true))) {

            String formattedDate = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

            String log = String.format("[%s] [%s] [%s]",formattedDate,logLevel,message);
            writer.write(log);
            writer.newLine();


        } catch (IOException e) {
            System.out.println("Log yazılamadı : " + e.getMessage());
        } ;
    }
}
