package pl.booker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.booker.model.entity.PublicationEntity;
import pl.booker.model.entity.UserEntity;

import java.util.List;

@Controller
public class PublicationController {

    @GetMapping("/list")
    public String showPubList(UserEntity user, List<PublicationEntity> publications) {
        if(publications != null) {
            return null;
        }
        else if(user != null) {
            publications = user.getPublicationEntities()
        }
    }

    @PostMapping("/filter-list")
    public String showFilteredPubList() {
        return "list";
    }

    @GetMapping("/search")
    public String showSearchForm() {
        return null;
    }

    @PostMapping("/perform-search")
    public String performSearch() {
        return "list";
    }

    @GetMapping("/pub")
    public String showPubInfo() {
        return null;
    }

    @GetMapping("/edit")
    public String showPubEditForm() {
        return null;
    }

    @PostMapping("/perform-edit")
    public String editPub() {
        return "pub";
    }

    @GetMapping("/new")
    public String showNewResourceForm() {
        return null;
    }

    @PostMapping("/save-pub")
    public String savePub() {
        return "pub";
    }
}
