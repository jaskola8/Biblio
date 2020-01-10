package com.example.booker.controller;
import com.example.booker.model.entity.PublicationEntity;
import com.example.booker.model.entity.UserEntity;
import com.example.booker.services.PublicationService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;


@Controller
@RequestMapping("/pub")
public class PublicationController {

    private PublicationService publicationService;

    PublicationController(PublicationService publicationService) {
        this.publicationService = publicationService;
    }

    @GetMapping("/")
    public String showOwnedPubList(@AuthenticationPrincipal final UserEntity user, Model model) {
        model.addAttribute("books", publicationService.getOwnedPublications(user));
        return "publications/owned";
    }

    @GetMapping("/all")
    public String showPubList(Model model) {
        model.addAttribute("publications", publicationService.getAllPublications());
        return "publications/all";
    }

    @GetMapping("/show/{id}")
    public String showPubInfo(@PathVariable Long id, Model model) {
        PublicationEntity publicationEntity = publicationService.getPublicationById(id);
        model.addAttribute("publication", publicationEntity);
        return "all";
    }

    @GetMapping("/edit/{id}")
    public String showPubEditForm(@PathVariable Long id, Model model) {
        PublicationEntity publicationEntity = publicationService.getPublicationById(id);
        model.addAttribute("publication", publicationEntity);
        return "publications/edit";
    }

    @PostMapping("/update/{id}")
    public String editPub(@PathVariable Long id, @Valid PublicationEntity publicationEntity,
                          BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "publications/edit";
        }
        if(!publicationService.updatePublication(id, publicationEntity)) {
            return "publications/edit";
        };
        return "all";
    }

    @GetMapping("/create")
    public String showNewPubForm(Model model) {
        model.addAttribute("publication", new PublicationEntity());
        return "publications/create";
    }

    @PostMapping("/save")
    public String saveNewPub(Model model, @Valid PublicationEntity publicationEntity,
                             BindingResult result) {
        if(result.hasErrors()) {
            return "publications/create";
        }
        if(!publicationService.saveNewPublication(publicationEntity)) {
            return "publications/create";
        };
        return "all";
    }

}
