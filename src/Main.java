import P.Service.Enum.TypeHouse;
import P.Service.Model.*;
import P.Service.Service.AnnouncementService;
import P.Service.Service.BookingService;
import P.Service.Service.DataBaseService;
import P.Service.Service.UserService;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address(1, "Московская область", "Москва", "Улица Ленина, Дом 1");
        Address address2 = new Address(2, "Ленинградская область", "Санкт-Петербург", "Улица Горького, Дом 2");
        Address address3 = new Address(3, "Свердловская область", "Екатеринбург", "Улица Пушкина, Дом 3");
        Address address4 = new Address(4, "Татарстан", "Казань", "Улица Фрунзе, Дом 4");
        Address address5 = new Address(5, "Ростовская область", "Ростов-на-Дону", "Улица Гагарина, Дом 5");
        Address address6 = new Address(6, "Краснодарский край", "Краснодар", "Улица Лермонтова, Дом 6");
        Address address7 = new Address(7, "Сибирский федеральный округ", "Новосибирск", "Улица Толстого, Дом 7");
        Address address8 = new Address(8, "Приморский край", "Владивосток", "Улица Петрова, Дом 8");
        Address address9 = new Address(9, "Башкортостан", "Уфа", "Улица Советская, Дом 9");
        Address address10 = new Address(10, "Самарская область", "Самара", "Улица Кирова, Дом 10");

        Announcement announcement1 = new Announcement(1, "Уютная квартира в центре города. Отличное расположение и современный ремонт.", LocalDate.of(2023, 8, 10), "Квартира в центре", TypeHouse.APARTMENT, "Владелец 1", false, 2, 80, address1);
        Announcement announcement2 = new Announcement(2, "Просторный дом с садом и бассейном в тихом районе.", LocalDate.of(2023, 7, 25), "Семейный дом с бассейном", TypeHouse.HOUSE, "Владелец 2", true, 4, 300, address2);
        Announcement announcement3 = new Announcement(3, "Студия в новостройке с видом на море. Отличное предложение для инвестиций.", LocalDate.of(2023, 9, 5), "Студия с видом на море", TypeHouse.APARTMENT, "Владелец 3", false, 1, 45, address3);
        Announcement announcement4 = new Announcement(4, "Коттедж в пригороде с собственной территорией и гаражом.", LocalDate.of(2023, 8, 15), "Коттедж с территорией", TypeHouse.HOUSE, "Владелец 4", true, 6, 400, address4);
        Announcement announcement5 = new Announcement(5, "Светлая квартира с балконом и ремонтом. Развитая инфраструктура вокруг.", LocalDate.of(2023, 8, 20), "Светлая квартира с балконом", TypeHouse.APARTMENT, "Владелец 5", false, 2, 90, address5);
        Announcement announcement6 = new Announcement(6, "Уединенный дом в лесу с прудом. Идеальное место для отдыха.", LocalDate.of(2023, 7, 10), "Дом в лесу с прудом", TypeHouse.HOUSE, "Владелец 6", true, 3, 250, address6);
        Announcement announcement7 = new Announcement(7, "Современная квартира с панорамным видом. Подходит для семейного проживания.", LocalDate.of(2023, 9, 8), "Современная квартира с видом", TypeHouse.APARTMENT, "Владелец 7", false, 3, 120, address7);
        Announcement announcement8 = new Announcement(8, "Дачный участок с плодовыми деревьями и огородом. Отличное место для летнего отдыха.", LocalDate.of(2023, 6, 5), "Дачный участок с огородом", TypeHouse.LAND, "Владелец 8", true, 0, 800, address8);
        Announcement announcement9 = new Announcement(9, "Комфортабельный пентхаус с террасой. Все удобства для роскошного проживания.", LocalDate.of(2023, 8, 28), "Пентхаус с террасой", TypeHouse.APARTMENT, "Владелец 9", false, 2, 150, address9);
        Announcement announcement10 = new Announcement(10, "Просторный дом с гаражом и бассейном. Идеально для большой семьи.", LocalDate.of(2023, 7, 15), "Семейный дом с бассейном", TypeHouse.HOUSE, "Владелец 10", true, 5, 350, address10);
        Announcement[] announcements1 = {announcement1};
        Announcement[] announcements2 = {announcement2};
        Announcement[] announcements3 = {announcement3};
        Announcement[] announcements4 = {announcement4};
        Announcement[] announcements5 = {announcement5};
        Announcement[] announcements6 = {announcement6};
        Announcement[] announcements7 = {announcement7};
        Announcement[] announcements8 = {announcement8};
        Announcement[] announcements9 = {announcement9};
        Announcement[] announcements10 = {announcement10};
        Announcement[] announcements = {announcement1,announcement2,announcement2, announcement3, announcement4, announcement5, announcement6, announcement7, announcement8, announcement9, announcement10};


        User user1 = new User(1, "Иван", "Петров", "ivan@email.com", LocalDate.of(2023, 3, 5),announcements1);
        User user2 = new User(2, "Анна", "Сидорова", "anna@email.com", LocalDate.of(2022, 9, 25), announcements2);
        User user3 = new User(3, "Алексей", "Иванов", "alex@email.com", LocalDate.of(2023, 1, 15), announcements3);
        User user4 = new User(4, "Екатерина", "Смирнова", "ekaterina@email.com", LocalDate.of(2022, 12, 10), announcements4);
        User user5 = new User(5, "Михаил", "Козлов", "mikhail@email.com", LocalDate.of(2023, 5, 20), announcements5);
        User user6 = new User(6, "Ольга", "Морозова", "olga@email.com", LocalDate.of(2022, 10, 8),announcements6);
        User user7 = new User(7, "Павел", "Сергеев", "pavel@email.com", LocalDate.of(2023, 2, 14), announcements7);
        User user8 = new User(8, "Наталья", "Котова", "natalia@email.com", LocalDate.of(2022, 11, 30), announcements8);
        User user9 = new User(9, "Сергей", "Александров", "sergei@email.com", LocalDate.of(2023, 4, 12), announcements9);
        User user10 = new User(10, "Анастасия", "Григорьева", "anastasia@email.com", LocalDate.of(2022, 8, 3),announcements10);

        Booking booking3 = new Booking(user3, announcement4);
        Booking booking4 = new Booking(user8, announcement5);
        Booking booking5 = new Booking(user9, announcement2);
        Booking booking6 = new Booking(user4, announcement7);
        Booking booking7 = new Booking(user5, announcement10);
        Booking booking8 = new Booking(user10, announcement6);
        Booking booking9 = new Booking(user7, announcement9);
        Booking booking10 = new Booking(user1, announcement8);
        User[] users = {user1, user2, user3, user4, user5, user6, user7, user8, user9, user10};

                DataBase dataBase = new DataBase();
                dataBase.setUsers(users);
                dataBase.setAnnouncements(announcements);
                dataBase.setBooking();
                DataBaseService dataBaseService = new DataBaseService();
                UserService userService = new UserService(dataBaseService);
                BookingService bookingService = new BookingService(dataBase);
                AnnouncementService announcementService = new AnnouncementService(dataBase);



                Scanner scan = new Scanner(System.in);
                int choice;

                do {
                    System.out.println("Выберите действие:");
                    System.out.println("1. Получить всех пользователей");
                    System.out.println("2. Получить объявление по ID пользователя");
                    System.out.println("3. Получить объявления по адресу");
                    System.out.println("4. Забронировать объявление");
                    System.out.println("5. Отменить бронь объявления");
                    System.out.println("6. Получить все объявления");
                    System.out.println("7. Создать объявление");
                    System.out.println("8. Получить объявление по ID");
                    System.out.println("9. Удалить объявление по ID");
                    System.out.println("10. Отсортировать объявления по рейтингу");
                    System.out.println("11. Отфильтровать объявления по цене");
                    System.out.println("12. Отфильтровать объявления по типу");
                    System.out.println("0. Выйти из программы");
                    System.out.print("Введите номер выбранного действия: ");
                    choice = scan.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println(Arrays.toString(userService.getAllUser()));
                            break;
                        case 2:
                            System.out.print("Введите ID пользователя: ");
                            long userId = scan.nextLong();
                            System.out.println(Arrays.toString(userService.getAnnouncementByUserId(userId)));
                            break;
                        case 3:
                            System.out.println(Arrays.toString(userService.getAnnouncementByAddress(address2)));
                            break;
                        case 4:
                            System.out.println(bookingService.bookAnnouncement(announcement3));
                            break;
                        case 5:
                            System.out.println(bookingService.unBookAnnouncement(announcement2));
                            break;
                        case 6:
                            System.out.println(Arrays.toString(announcementService.getAllAnnouncement()));
                            break;
                        case 7:
                            System.out.println(Arrays.toString(announcementService.createAnnouncement(new Announcement(11, "Описание 11-го объявления", LocalDate.of(2023, 8, 31), "Заголовок 11-го объявления", TypeHouse.APARTMENT, "Владелец 11", false, 3, 110, address1))));
                            break;
                        case 8:
                            System.out.print("Введите ID объявления: ");
                            long announcementId = scan.nextLong();
                            System.out.println(announcementService.getAnnouncementById(announcementId));
                            break;
                        case 9:
                            System.out.print("Введите ID объявления для удаления: ");
                            int deleteAnnouncementId = scan.nextInt();
                            announcementService.deleteAnnouncementById(deleteAnnouncementId);
                            break;
                        case 10:
                            System.out.println(Arrays.toString(announcementService.sortAnnouncementsByRating()));
                            break;
                        case 11:
                            System.out.print("Введите минимальную цену: ");
                            long minPrice = scan.nextLong();
                            System.out.print("Введите максимальную цену: ");
                            long maxPrice = scan.nextLong();
                            System.out.println(Arrays.toString(announcementService.sortByPrice(minPrice, maxPrice)));
                            break;
                        case 12:
                            System.out.println(Arrays.toString(announcementService.filterByType()));
                            break;
                        case 0:
                            System.out.println("Выход из программы.");
                            break;
                        default:
                            System.out.println("Некорректный выбор. Пожалуйста, выберите действие из списка.");
                    }
                } while (choice != 0);



    }
}