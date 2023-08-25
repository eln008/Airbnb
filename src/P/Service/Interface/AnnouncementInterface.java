package P.Service.Interface;

import P.Service.Model.Announcement;

public interface AnnouncementInterface {
    Announcement[] createAnnouncement(Announcement announcement);
    Announcement[] getAllAnnouncement();
    Announcement getAnnouncementById(long id);
    void deleteAnnouncementById(int id);
    Announcement updateById(int id, Announcement announcement);
    Announcement[] sortAnnouncementsByRating();
    Announcement[] sortByPrice(long maxPrice, long minPrice );
    Announcement[] filterByType();

}
