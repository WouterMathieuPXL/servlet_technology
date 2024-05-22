package be.pxl.paj.servlets;

import be.pxl.paj.servlets.repository.PhoneBookEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhoneBookController {

    private final PhoneBookEntryRepository phoneBookEntryRepository;

    @Autowired
    public PhoneBookController(PhoneBookEntryRepository phoneBookEntryRepository) {
        this.phoneBookEntryRepository = phoneBookEntryRepository;
    }

    @RequestMapping("/display_phonebook_entries")
    public String displayEntries(Model model) {
        model.addAttribute("entries", phoneBookEntryRepository.findAll());
        return "display_phonebook_entries";
    }
}