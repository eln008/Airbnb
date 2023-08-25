package P.Service.Service;

import P.Service.Enum.TypeHouse;
import P.Service.Interface.AnnouncementInterface;
import P.Service.Model.Announcement;
import P.Service.Model.DataBase;
import java.util.Scanner;

import java.util.Arrays;

public class AnnouncementService implements AnnouncementInterface {
Scanner scan = new Scanner (System.in);
    DataBase dataBase = new DataBase();

    public AnnouncementService(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    @Override
    public Announcement[] createAnnouncement(Announcement newAnnouncement) {
        Announcement[] currentAnnouncements = dataBase.getAnnouncements();
        for (Announcement a : currentAnnouncements) {
            if (a.getId() == newAnnouncement.getId()) {
                return null;
            }
        }
        Announcement[] updatedAnnouncements = new Announcement[currentAnnouncements.length + 1];
        System.arraycopy(currentAnnouncements, 0, updatedAnnouncements, 0, currentAnnouncements.length);

        updatedAnnouncements[currentAnnouncements.length] = newAnnouncement;
        dataBase.setAnnouncements(updatedAnnouncements);

        return updatedAnnouncements;
    }


    @Override
    public Announcement[] getAllAnnouncement() {

        return dataBase.getAnnouncements();
    }

    @Override
    public Announcement getAnnouncementById(long id) {
        for (Announcement a: getAllAnnouncement()) {
            if(a.getId()==id){
                return a;
            }
        }
        return null;
    }

    @Override
    public void deleteAnnouncementById(int id) {
        Announcement[] allAnnouncements = getAllAnnouncement();
        int newArrayLength = allAnnouncements.length - 1;
        Announcement[] newArray = new Announcement[newArrayLength];
        int newIndex = 0;

        for (Announcement a : allAnnouncements) {
            if (a.getId() != id) {
                newArray[newIndex] = a;
                newIndex++;
            }
        }
        dataBase.setAnnouncements(newArray);
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] != null) {

                newArray[i].setId(i + 1);
            }
        }
    }



    @Override
    public Announcement updateById(int id, Announcement announcement) {
        Announcement[] announcements = getAllAnnouncement();

        for (int i = 0; i <announcements.length ; i++) {
            if(announcements[i].getId() == id){
                announcements[i] = announcement;
                dataBase.setAnnouncements(announcements);
                return announcement;
            }
        }
        return null;
    }

    @Override
    public Announcement[] sortAnnouncementsByRating() {
        Announcement[] allAnnouncements = getAllAnnouncement();
        int countHighRating = 0;

        for (Announcement a : allAnnouncements) {
            if (a.getRating() >= 3) {
                countHighRating++;

            }
        }
        Announcement[] highRatingAnnouncements = new Announcement[countHighRating];
        int index = 0;
        for (Announcement a : allAnnouncements) {
            if (a.getRating() > 3) {
                highRatingAnnouncements[index] = a;
                index++;
            }
        }

        return highRatingAnnouncements;
    }

    @Override
    public Announcement[] sortByPrice(long minPrice, long maxPrice) {
        Announcement[] allAnnouncements = getAllAnnouncement();
        Announcement[] filteredAnnouncements = new Announcement[allAnnouncements.length];
        int count = 0;

        for (Announcement a : allAnnouncements) {
            long price = a.getPricePerDay();
            if (price >= minPrice && price <= maxPrice) {
                filteredAnnouncements[count] = a;
                count++;
            }
        }

        Announcement[] result = new Announcement[count];
        System.arraycopy(filteredAnnouncements, 0, result, 0, count);

        return result;
    }


    @Override
    public Announcement[] filterByType() {
        System.out.println("Выберите тип квартиры: 1) тип APARTMENT 2) тип HOUSE 3) тип LAND ");
        int otVet = scan.nextInt();

        switch (otVet){
            case 1:
            System.out.println("Объявления типа APARTMENT:");
            for (Announcement a : getAllAnnouncement()) {
                if (a.getTypeHouse() == TypeHouse.APARTMENT) {
                    System.out.println(a);
                }
            }
                break;
            case 2:
                System.out.println("Объявления типа HOUSE:");
                for (Announcement a : getAllAnnouncement()) {
                    if (a.getTypeHouse() == TypeHouse.HOUSE) {
                        System.out.println(a);
                    }
                }
                break;
            case 3:
                System.out.println("Объявления типа LAND:");
                for (Announcement a : getAllAnnouncement()) {
                    if (a.getTypeHouse() == TypeHouse.LAND) {
                        System.out.println(a);
                    }
                    }
                break;
            default:
                System.out.println("Некорректный выбор типа квартиры.");
                break;
        }

        return null;
    }
}
